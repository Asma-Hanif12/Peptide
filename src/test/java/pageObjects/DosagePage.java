package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class DosagePage extends BasePage {
    private final By Dosage = By.xpath("//span[normalize-space()='Dosage']");
    private final By ADP = By.xpath("//button[normalize-space()='Add Peptide Dose']");
    private final By Date =By.xpath("//div[@class='ant-picker-input']");
    private final By enterpeptides = By.xpath("//div[@class='w-full h-auto xl:h-[48px] !bg-[#F2F5F6] rounded-md px-3 py-2 flex justify-between items-center cursor-pointer']");
    private final By EnterDosage = By.xpath("//input[@placeholder='Enter dosage you have taken']");
    private final By Goal = By.xpath("//textarea[@placeholder='Write your primary goal']");
    private final By add = By.xpath("//button[normalize-space()='Add']");
    private final By AI = By.xpath("//button[normalize-space()='AI Feedback']");
    private final By continuebutton = By.xpath("//button[normalize-space()='Continue']");
    private final By sendbutton = By.xpath("//button[@type='submit']");


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



    public void ClickDosage() {
    driver.findElement(Dosage).click();
    }
    public void ClickADP() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement apd = wait.until(ExpectedConditions.visibilityOfElementLocated(ADP));
        Thread.sleep(1000);
        apd.click();
    }

    public void ClickDate() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement dates = wait.until(ExpectedConditions.visibilityOfElementLocated(Date));
        Thread.sleep(1000);
        dates.click();
        WebElement selectdates = driver.findElement(By.xpath("//div[normalize-space()='7']"));
        selectdates.click();
    }

    public void clickenterpeptides() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement peptides = wait.until(ExpectedConditions.visibilityOfElementLocated(enterpeptides));
        Thread.sleep(1000);
        peptides.click();
        List<WebElement> options = driver.findElements(By.xpath("//div[@class='w-full h-auto xl:h-[48px] !bg-[#F2F5F6] rounded-md px-3 py-2 flex justify-between items-center cursor-pointer']/following-sibling::div//div[contains(@class,'px-4') and contains(@class,'py-3')]"));
        if (!options.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(options.size());
            options.get(randomIndex).click();
            System.out.println("Selected option index of peptides: " + randomIndex);
        } else {
            System.out.println("No options found.");
        }
    }


    public void dosageno() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> buttons = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(EnterDosage));
        int maxButtons = Math.min(buttons.size(), 2);
        if (maxButtons == 0) {
            throw new RuntimeException("No buttons found in the given section.");
        }
        WebElement randomButton = buttons.get(random.nextInt(maxButtons));
        randomButton.click();

        int Dosage = 10 + random.nextInt(90);
        driver.findElement(EnterDosage).sendKeys(String.valueOf(Dosage));

    }

    public void Setgoal() {
        driver.findElement(Goal).sendKeys(getRandomAlphaNumeric(10));
    }

    public void clickadd() throws InterruptedException {
        driver.findElement(add).click();
    }

    public void SetAI() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement dates = wait.until(ExpectedConditions.visibilityOfElementLocated(AI));
        Thread.sleep(1000);
        dates.click();
        WebElement selectstartdate = driver.findElement(By.xpath("//div[@class='aspect-square flex']//div[normalize-space()='1']"));
        selectstartdate.click();
        Thread.sleep(2000);

        WebElement selectenddate = driver.findElement(By.xpath("//div[@class='aspect-square flex']//div[normalize-space()='13']"));
        selectenddate.click();
    }

    public void ClickContinue() throws InterruptedException {
        driver.findElement(continuebutton).click();
    }

    public void clicksendbutton() throws InterruptedException {
        driver.findElement(sendbutton).click();
    }

    }

