package TestCases;


import org.testng.annotations.Test;
import pageObjects.ExplorePage;

public class ExploreTest extends BaseTest {
    @Test(priority = 3)
    public void testExplore() throws InterruptedException {
        explorePage = new ExplorePage();
        explorePage.DropDownvideo();
        explorePage.DropDownPodcasts();
        explorePage.DropDownArticles();
        explorePage.DropDownCasestudies();
        explorePage.ClickDashboard();
//        explorePage.ClickChatPepi();
//        explorePage.ClickDosage();
    }
}
