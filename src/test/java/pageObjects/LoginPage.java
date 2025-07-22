package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
    private final By checkbox = By.xpath("//span[@class='checkbox__indicator']");
    private final By continueButton = By.xpath("//button[@id='onContinue']");
    private final By Menu = By.xpath("//img[contains(@alt,'Menu')]");
    private final By Login = By.xpath("//button[normalize-space()='Log In']");
    private final By EnterEmail = By.xpath("//input[@placeholder='Enter your email address']");
    private final By EnterPassword = By.xpath("//input[@placeholder='Enter your password']");
   private final By LoginButton = By.xpath("//button[normalize-space()='Log in']");
   private final By exploreforfree = By.xpath("//span[normalize-space()='Explore for Free']");

   public void navigateToMainPage() {
        driver.get("https://thirsty-leakey.138-197-14-51.plesk.page/");
    }
    public void acceptTermsAndContinue() {
        driver.findElement(checkbox).click();
        driver.findElement(continueButton).click();
    }

    public void login() throws InterruptedException {
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

    public void clickLoginButton(){
       driver.findElement(LoginButton).click();
    }
    public void setExploreforfree() throws InterruptedException {
        Thread.sleep(6000);
        driver.findElement(exploreforfree).click();
    }
}
