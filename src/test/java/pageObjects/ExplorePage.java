package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplorePage extends BasePage {
    private final By ExploreDropDown = By.cssSelector(".flex.items-center.space-x-1.cursor-pointer.group");
    private final By Dashboard = By.xpath("//span[normalize-space()='Dashboard']");
    private final By ChatPepi = By.xpath("//span[normalize-space()='Chat with Pepi']");


    public void DropDownvideo() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement dropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(ExploreDropDown));
        Thread.sleep(1000);
        dropDown.click();
        WebElement videos = driver.findElement(By.xpath("//span[normalize-space()='Videos']"));
        videos.click();
    }

    public void DropDownPodcasts() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement dropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(ExploreDropDown));
        Thread.sleep(1000);
        dropDown.click();
        WebElement podcasts = driver.findElement(By.xpath("//span[normalize-space()='Podcast']"));
        podcasts.click();
    }

    public void DropDownArticles() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement dropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(ExploreDropDown));
        Thread.sleep(1000);
        dropDown.click();
        WebElement articles = driver.findElement(By.xpath("//span[normalize-space()='Articles']"));
        articles.click();
    }

    public void DropDownCasestudies() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement dropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(ExploreDropDown));
        Thread.sleep(1000);
        dropDown.click();
        WebElement casestudies = driver.findElement(By.xpath("//span[normalize-space()='Case Studies']"));
        casestudies.click();
    }

    public void ClickDashboard()  {
        driver.findElement(Dashboard).click();
    }

    public void ClickChatPepi() {
        driver.findElement(ChatPepi).click();
    }


}