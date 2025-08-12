package TestCases;

import org.testng.annotations.BeforeSuite;

import pageObjects.*;

public class BaseTest {
protected RegisterPage registerPage;
    protected LoginPage loginPage;
    protected ExplorePage explorePage;
    protected PeptidesPage peptidesPage;
    protected DosagePage dosagePage;
    protected ForgetPassword forgetPassword;
    protected MenuListItems menuListItems;

    @BeforeSuite
    public void setUp() {
        BasePage.initializeDriver();
        registerPage = new RegisterPage();
        loginPage = new LoginPage();
        explorePage = new ExplorePage();
        peptidesPage = new PeptidesPage();
        dosagePage = new DosagePage();
        forgetPassword = new ForgetPassword();
        menuListItems =new MenuListItems();
    }
//    @AfterSuite
//    public void tearDownSuite() {
//        BasePage.quitDriver();
//}
}