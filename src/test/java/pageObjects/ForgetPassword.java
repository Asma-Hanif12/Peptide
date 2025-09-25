package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class ForgetPassword extends BasePage {
    private final By Menu = By.xpath("//button[@class='focus:outline-none flex items-center']");
    private final By Login = By.xpath("//button[normalize-space()='Log In']");
   private final By  forget = By.xpath("//a[normalize-space()='Forgot Password?']");
    private final By EnterEmail = By.xpath("//input[@placeholder='Enter your email address']");
    private final By continuebutton1 = By.xpath("//button[normalize-space()='Continue']");
    private final By verify = By.xpath("//button[normalize-space()='Verify']");
    private final By password = By.xpath("//input[contains(@placeholder,'Enter your new password')]");
    private final By confirmPasswordField = By.xpath("//input[@placeholder='Re-enter your password']");
    private final By submitButton = By.xpath("//button[normalize-space()='Reset Password']");

    private final Random random = new Random();

    private String getRandomAlphaNumeric(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }
    public void navigateToMainPage() {
        driver.get("https://peptide-md.vercel.app/");
    }


    public void login() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(Menu).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(Login));
        driver.findElement(Login).click();
        Thread.sleep(3000);

    }

    public void forgotPassword() throws InterruptedException {
        driver.findElement(forget).click();
    }

    public void email(String email) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(EnterEmail).sendKeys(email);
        driver.findElement(continuebutton1).click();

    }
    public void setOTP() throws InterruptedException {


        Thread.sleep(8000);

        String otp = "00000";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//main//form//input[@type='text']")));

        List<WebElement> otpFields = driver.findElements(By.xpath("//main//form//input[@type='text']"));

        for (int i = 0; i < otp.length(); i++) {
            WebElement inputField = otpFields.get(i);
            inputField.click();
            inputField.sendKeys(Character.toString(otp.charAt(i)));
            Thread.sleep(300);
        }
        driver.findElement(verify).click();
        Thread.sleep(5000);


    }
    public void setpassword() throws InterruptedException {

        String randomPassword = getRandomAlphaNumeric(10);
        Thread.sleep(8000);

        driver.findElement(password).sendKeys(randomPassword);
        driver.findElement(confirmPasswordField).sendKeys(randomPassword);
        driver.findElement(submitButton).click();
    }

}
