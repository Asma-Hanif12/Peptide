package TestCases;

import org.testng.annotations.Test;
import pageObjects.PeptidesPage;

public class PeptidesTest extends BaseTest {
    @Test(priority = 4)
    public void testPeptides() throws InterruptedException {
        peptidesPage = new PeptidesPage();
        peptidesPage.ClickPeptides();
//        peptidesPage.ClickSearch();
//        peptidesPage.SelectExperience();
//        peptidesPage.SelectProfile();
//        peptidesPage.NotFDA();
        peptidesPage.Clickcompare();
        peptidesPage.Selectcompare();
        peptidesPage.backButton();
    }

}
