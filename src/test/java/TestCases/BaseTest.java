package TestCases;

import org.testng.annotations.BeforeSuite;

import pageObjects.BasePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;

public class BaseTest {
protected RegisterPage registerPage;
    protected LoginPage loginPage;
    @BeforeSuite
    public void setUp() {
        BasePage.initializeDriver();
        registerPage = new RegisterPage();
        loginPage = new LoginPage();



    }
//    @AfterSuite
//    public void tearDownSuite() {
//        BasePage.quitDriver();
//}
}