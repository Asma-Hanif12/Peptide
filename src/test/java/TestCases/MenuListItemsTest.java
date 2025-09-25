package TestCases;

import org.testng.annotations.Test;
import pageObjects.MenuListItems;

public class MenuListItemsTest extends BaseTest {
    @Test(priority = 7)
    public void menuListItemsTest() throws InterruptedException {
        menuListItems = new MenuListItems();
        menuListItems.navigateToMainPage();
        menuListItems.clickvideos();
        menuListItems.clickarticles();
        menuListItems.clickDatabase();
        menuListItems.clickPodcasts();
        menuListItems.clickCaseStudies();

    }
}
