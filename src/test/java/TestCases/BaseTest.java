package TestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pageObjects.*;

public class BaseTest {
protected RegisterPage registerPage;
    protected LoginPage loginPage;
    protected ExplorePage explorePage;
    protected PeptidesPage peptidesPage;



    @BeforeSuite
    public void setUp() {
        BasePage.initializeDriver();
        registerPage = new RegisterPage();
        loginPage = new LoginPage();
        explorePage = new ExplorePage();
        peptidesPage = new PeptidesPage();


    }
//    @AfterSuite
//    public void tearDownSuite() {
//        BasePage.quitDriver();
//}
}