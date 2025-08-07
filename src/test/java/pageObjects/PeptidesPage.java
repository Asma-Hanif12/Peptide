package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class PeptidesPage extends BasePage {
    private final By peptides = By.xpath("//span[normalize-space()='Peptides']");
private final By search = By.xpath("//input[@placeholder='Search peptides']");

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

public void ClickSearch() {
//        driver.findElement(search).sendKeys(getRandomString(5));
    driver.findElement(search).sendKeys("M");
}

}
