package TestCases;


import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class LoginTest extends BaseTest {
    @Test(priority = 2)
    public void testLogin() throws InterruptedException {
        loginPage = new LoginPage();
        loginPage.navigateToMainPage();
//        loginPage.acceptTermsAndContinue();
        loginPage.login();
        loginPage.email("testing12@gmail.com");
        loginPage.password("Test@123");
        loginPage.clickLoginButton();
        loginPage.setoption1slider();


    }
}
