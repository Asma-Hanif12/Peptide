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

    public void navigateToMainPage() {
        driver.get("https://peptide-md.vercel.app/");
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

}
