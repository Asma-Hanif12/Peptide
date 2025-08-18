package TestCases;

import org.testng.annotations.Test;
import pageObjects.BasePage;
import pageObjects.DosagePage;
import pageObjects.PeptidesPage;

public class DosageTest extends BaseTest {
    @Test(priority = 5)
    public void testDosage() throws InterruptedException {
        dosagePage = new DosagePage();
        dosagePage.ClickDosage();
        dosagePage.ClickADP();
        dosagePage.ClickDate();
        dosagePage.clickenterpeptides();
        dosagePage.dosageno();
        dosagePage.Setgoal();
        dosagePage.clickadd();
        dosagePage.SetAI();
        dosagePage.ClickContinue();
        dosagePage.clicksendbutton();


    }
}
