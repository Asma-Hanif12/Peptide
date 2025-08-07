package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RegisterPage extends BasePage {
    private final By checkbox = By.xpath("//span[@class='checkbox__indicator']");
    private final By continueButton = By.xpath("//button[@id='onContinue']");
    private final By Menu = By.xpath("//img[@alt='Menu']");
    private final By Signup = By.xpath("//button[normalize-space()='Signup']");
    private final By fullname = By.xpath("//input[@placeholder='Enter your full name']");
    private final By email = By.xpath("//input[contains(@placeholder,'Enter your email address')]");
    private final By password = By.xpath("//input[@placeholder='Enter your password']");
    private final By confirmPasswordField = By.xpath("//input[@placeholder='Re-enter your password']");
    private final By submitButton = By.xpath("//button[normalize-space()='Agree and Sign up']");
    private final By verify = By.xpath("//button[normalize-space()='Verify']");
    private final By option1sliderButtons = By.xpath("(//div[contains(@class,'flex flex-col gap-4')]//button)[position() <= 3]");
    private final By continuebutton1 = By.xpath("//button[normalize-space()='Continue']");
    private final By checkboxes2sliders = By.cssSelector("div.w-6.h-6.cursor-pointer.rounded-md.border-2.flex.items-center");
    private final By option3sliders = By.cssSelector("button.flex.items-center");
    private final By ageInput = By.xpath("//input[@placeholder='Enter your age']");
    private final By weightInput = By.xpath("//input[@placeholder='Enter your weight']");
    private final By option1slider = By.cssSelector("div.cursor-pointer.border-2");
    private final By SubscribeButton = By.xpath("//button[normalize-space()='Subscribe']");
    private final By Logo = By.xpath("//img[contains(@alt,'Logo')]");

    private final Random random = new Random();

    private String getRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

    private String getRandomEmail() {
        return getRandomString(8) + "@gmail.com";
    }

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

    public void acceptTermsAndContinue() {
        driver.findElement(checkbox).click();
        driver.findElement(continueButton).click();
    }
    public void clicksignup() {
        driver.findElement(Menu).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(Signup));
        driver.findElement(Signup).click();

    }

    public void reg() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement fullNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(fullname));
        fullNameField.sendKeys(getRandomString(6));

        driver.findElement(email).sendKeys(getRandomEmail());


        String randomPassword = getRandomAlphaNumeric(10);

        driver.findElement(password).sendKeys(randomPassword);
        driver.findElement(confirmPasswordField).sendKeys(randomPassword);
        driver.findElement(submitButton).click();

        Thread.sleep(8000);

        String otp = "00000";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//main//form//input[@type='text']")));

        List<WebElement> otpFields = driver.findElements(By.xpath("//main//form//input[@type='text']"));

        for (int i = 0; i < otp.length(); i++) {
            WebElement inputField = otpFields.get(i);
            inputField.click();
            inputField.sendKeys(Character.toString(otp.charAt(i)));
            Thread.sleep(300);
        }
        driver.findElement(verify).click();


    }

    public void clickRandomOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> buttons = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(option1sliderButtons));
        int maxButtons = Math.min(buttons.size(), 3);
        if (maxButtons == 0) {
            throw new RuntimeException("No buttons found in the given section.");
        }
        WebElement randomButton = buttons.get(random.nextInt(maxButtons));
        randomButton.click();

        driver.findElement(continuebutton1).click();


    }

    public void setCheckboxes2sliders() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> checkboxes = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(checkboxes2sliders));

        if (checkboxes.size() < 2) {
            throw new RuntimeException("Less than 2 checkboxes found.");
        }
        int firstIndex = random.nextInt(checkboxes.size());
        int secondIndex;
        do {
            secondIndex = random.nextInt(checkboxes.size());
        } while (secondIndex == firstIndex);
        checkboxes.get(firstIndex).click();
        checkboxes.get(secondIndex).click();
        Thread.sleep(1000);
        driver.findElement(continuebutton1).click();

    }

    public void setOption3sliders() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> buttons = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(option3sliders));
        int maxButtons = Math.min(buttons.size(), 2);
        if (maxButtons == 0) {
            throw new RuntimeException("No buttons found in the given section.");
        }
        WebElement randomButton = buttons.get(random.nextInt(maxButtons));
        randomButton.click();

        int Age = 10 + random.nextInt(90);
        driver.findElement(ageInput).sendKeys(String.valueOf(Age));

        int Weight = 10 + random.nextInt(100);
        driver.findElement(weightInput).sendKeys(String.valueOf(Weight));


        driver.findElement(continuebutton1).click();

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

        driver.findElement(Logo).click();

    }

}


