package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
    private final By checkbox = By.xpath("//span[@class='checkbox__indicator']");
    private final By continueButton = By.xpath("//button[@id='onContinue']");
    private final By Menu = By.xpath("//button[@class='focus:outline-none flex items-center']");
    private final By Login = By.xpath("//button[normalize-space()='Log In']");
    private final By EnterEmail = By.xpath("//input[@placeholder='Enter your email address']");
    private final By EnterPassword = By.xpath("//input[@placeholder='Enter your password']");
    private final By LoginButton = By.xpath("//button[normalize-space()='Log in']");
    private final By Explore2 = By.cssSelector(".flex.items-center.space-x-1.cursor-pointer.group");
    private final By Dashboard = By.xpath("//span[normalize-space()='Dashboard']");
    private final By peptides = By.xpath("//span[normalize-space()='Peptides']");
    private final By ChatPepi = By.xpath("//span[normalize-space()='Chat with Pepi']");
    private final By Dosage = By.xpath("//span[normalize-space()='Dosage']");

   public void navigateToMainPage() {
        driver.get("https://peptide-md.vercel.app/");
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

    public void clickLoginButton(){
       driver.findElement(LoginButton).click();
    }

   public void ClickExplore2() throws InterruptedException {
       driver.findElement(Explore2).click();
   }

   public void ClickDashboard() throws InterruptedException {
       driver.findElement(Dashboard).click();
   }

   public void ClickPeptides() throws InterruptedException {
       driver.findElement(peptides).click();
   }

   public void ClickChatPepi() throws InterruptedException {
       driver.findElement(ChatPepi).click();
   }

   public void clickDosage() throws InterruptedException {
       driver.findElement(Dosage).click();
   }

}
