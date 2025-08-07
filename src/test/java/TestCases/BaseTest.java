package TestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pageObjects.BasePage;
import pageObjects.ExplorePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;

public class BaseTest {
protected RegisterPage registerPage;
    protected LoginPage loginPage;
    protected ExplorePage explorePage;
    @BeforeSuite
    public void setUp() {
        BasePage.initializeDriver();
        registerPage = new RegisterPage();
        loginPage = new LoginPage();
        explorePage = new ExplorePage();



    }
//    @AfterSuite
//    public void tearDownSuite() {
//        BasePage.quitDriver();
//}
}