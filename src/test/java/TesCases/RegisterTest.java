package TesCases;


import org.testng.annotations.Test;
import pageObjects.RegisterPage;

public class RegisterTest extends BaseTest {
    @Test(priority = 1)
    public void testRegister() throws InterruptedException {
        registerPage = new RegisterPage();
        registerPage.navigateToSignupPage();
        registerPage.acceptTermsAndContinue();
        registerPage.reg();
        registerPage.clickRandomOption();
        registerPage.setCheckboxes2sliders();
        registerPage.setOption3sliders();
        registerPage.setoption1slider();
    }
}
