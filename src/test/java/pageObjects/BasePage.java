package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class BasePage {

    protected static WebDriver driver;

    public static void initializeDriver() {
        if (driver == null) {

            ChromeOptions options = new ChromeOptions();

            // Hide "Chrome is being controlled by automated software" info-bar
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

            // Disable Google Password Manager & Autofill
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("credentials_enable_service", false);        // disable credential service
            prefs.put("profile.password_manager_enabled", false); // disable password manager
            prefs.put("autofill.profile_enabled", false);          // disable autofill profile

            options.setExperimentalOption("prefs", prefs);

            // Disable password save bubble & autofill
            options.addArguments("--disable-save-password-bubble");
            options.addArguments("--disable-autofill");
            options.addArguments("--disable-features=Autofill,PasswordManagerOnboarding");

            // Optional: run in incognito to avoid saved credentials
            options.addArguments("--incognito");

            // Scale factor for UI (your existing setting)
            options.addArguments("force-device-scale-factor=0.70");

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
