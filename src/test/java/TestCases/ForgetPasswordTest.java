package TestCases;


import org.testng.annotations.Test;
import pageObjects.ForgetPassword;

public class ForgetPasswordTest extends BaseTest {
    @Test(priority = 6)
    public void testforgetpassword() throws InterruptedException {
        forgetPassword = new ForgetPassword();
        forgetPassword.navigateToMainPage();
        forgetPassword.login();
        forgetPassword.forgotPassword();
        forgetPassword.email("testing12@gmail.com");
        forgetPassword.setOTP();
        forgetPassword.setpassword();
    }
}
