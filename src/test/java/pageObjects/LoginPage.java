package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class LoginPage extends BasePage {
    private final By checkbox = By.xpath("//span[@class='checkbox__indicator']");
    private final By continueButton = By.xpath("//button[@id='onContinue']");
    private final By Menu = By.xpath("//button[@class='focus:outline-none flex items-center']");
    private final By Login = By.xpath("//button[normalize-space()='Log In']");
    private final By EnterEmail = By.xpath("//input[@placeholder='Enter your email address']");
    private final By EnterPassword = By.xpath("//input[@placeholder='Enter your password']");
    private final By LoginButton = By.xpath("//button[normalize-space()='Log in']");
    private final By option1slider = By.cssSelector("div.cursor-pointer.border-2");
    private final By SubscribeButton = By.xpath("//button[normalize-space()='Subscribe']");
    private final By continuebutton1 = By.xpath("//button[normalize-space()='Continue']");

    private final Random random = new Random();

   public void navigateToMainPage() {
        driver.get("https://peptide-kappa.vercel.app/");
    }
    public void acceptTermsAndContinue() {
        driver.findElement(checkbox).click();
        driver.findElement(continueButton).click();
    }

    public void login() throws InterruptedException {

       Thread.sleep(2000);

        driver.findElement(Menu).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(Login));
        driver.findElement(Login).click();
        Thread.sleep(3000);

    }
    public void email(String email) throws InterruptedException {
       Thread.sleep(1000);
        driver.findElement(EnterEmail).sendKeys(email);

    }
    public void password(String password){
        driver.findElement(EnterPassword).sendKeys(password);
    }

    public void clickLoginButton() throws InterruptedException {
       driver.findElement(LoginButton).click();
        Thread.sleep(3000);

    }
    public void setoption1slider() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Thread.sleep(4000);
        List<WebElement> buttons = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(option1slider));
        int maxButtons = Math.min(buttons.size(), 2);
        if (maxButtons == 0) {
            throw new RuntimeException("No buttons found in the given section.");
        }
        WebElement randomButton = buttons.get(random.nextInt(maxButtons));
        randomButton.click();

        driver.findElement(SubscribeButton).click();
        Thread.sleep(2000);

        driver.findElement(continuebutton1).click();


    }



}
