package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PeptidesPage extends BasePage {
    private final By peptides = By.xpath("//span[normalize-space()='Peptides']");

    public void ClickPeptides() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement pep = wait.until(ExpectedConditions.visibilityOfElementLocated(peptides));
        Thread.sleep(1000);
        pep.click();
    }



}
