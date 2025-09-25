package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MenuListItems extends BasePage {
    private final By menu = By.xpath("//img[@alt='Menu']");
    private final By videos = By.xpath("//span[normalize-space()='Videos']");
    private final By back = By.xpath("//img[contains(@alt,'left-arrows')]");
    private final By articles = By.xpath("//span[normalize-space()='Articles']");
    private final By Database = By.xpath("//span[normalize-space()='Peptide Database']");
    private final By Podcasts = By.xpath("//span[normalize-space()='Podcast']");
    private final By CaseStudies = By.xpath("//span[normalize-space()='Case Studies']");

    public void navigateToMainPage() {
        driver.get("https://peptide-kappa.vercel.app/");
    }

    public void clickvideos() throws InterruptedException {
        driver.findElement(menu).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(videos)).click();
        Thread.sleep(3000);
        driver.findElement(back).click();

    }
    public void clickarticles() throws InterruptedException {
        driver.findElement(menu).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(articles)).click();
        Thread.sleep(3000);
        driver.findElement(back).click();
    }
    public void clickDatabase() throws InterruptedException {
        driver.findElement(menu).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Database)).click();
        Thread.sleep(3000);
        driver.findElement(back).click();
    }

    public void clickPodcasts() throws InterruptedException {
        driver.findElement(menu).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Podcasts)).click();
        Thread.sleep(3000);
        driver.findElement(back).click();
    }

    public void clickCaseStudies() throws InterruptedException {
        driver.findElement(menu).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(CaseStudies)).click();
        Thread.sleep(3000);
        driver.findElement(back).click();
    }

}
