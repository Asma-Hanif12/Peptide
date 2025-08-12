package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class PeptidesPage extends BasePage {
    private final By peptides = By.xpath("//span[normalize-space()='Peptides']");
    private final By search = By.xpath("//input[@placeholder='Search peptides']");
    private final By experience = By.xpath("//span[normalize-space()='Select Experience Level']");
    private final By profile = By.xpath("//span[normalize-space()='Select Side Effect Profile']");
    private final By status = By.xpath("//span[normalize-space()='Select Status']");
    private final By compare = By.xpath("//button[normalize-space()='Compare']");
    private final By selectcheckbox = By.xpath("(//input[contains(@type,'checkbox')])");
    private final By CompareButton = By.xpath("//button[normalize-space()='Compare (2 of 2)']");
    private final By Back = By.xpath("//img[@alt='left-arrows']");


    private final Random random = new Random();

    private String getRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

    public void ClickPeptides() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement pep = wait.until(ExpectedConditions.visibilityOfElementLocated(peptides));
        Thread.sleep(1000);
        pep.click();
    }

//    public void ClickSearch() {
////        driver.findElement(search).sendKeys(getRandomString(5));
//        driver.findElement(search).sendKeys("M");
//    }

//    public void SelectExperience() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//        WebElement dropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(experience));
//        Thread.sleep(1000);
//        dropDown.click();
//        WebElement beginner = driver.findElement(By.xpath("//div[normalize-space()='Beginner to Intermediate']"));
//        beginner.click();
//
//    }

//    public void SelectProfile() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//        WebElement dropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(profile));
//        Thread.sleep(1000);
//        dropDown.click();
//        WebElement SideEffect = driver.findElement(By.xpath("//div[normalize-space()='Minimal']"));
//        SideEffect.click();
//
//    }

//    public void NotFDA() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//        WebElement dropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(status));
//        Thread.sleep(1000);
//        dropDown.click();
//        WebElement SelectStatus = driver.findElement(By.xpath("//div[normalize-space()='Not FDA']"));
//        SelectStatus.click();
//
//    }

    public void Clickcompare() {
        driver.findElement(compare).click();


    }

public void Selectcompare() throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    List<WebElement> checkboxes = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectcheckbox));

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

    driver.findElement(CompareButton).click();

}

   public void backButton() throws InterruptedException {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement backbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(Back));
        Thread.sleep(1000);
       backbtn.click();
   }


}


