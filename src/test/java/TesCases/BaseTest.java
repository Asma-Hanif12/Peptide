package TesCases;

import org.testng.annotations.BeforeSuite;

import pageObjects.BasePage;
import pageObjects.RegisterPage;

public class BaseTest {
protected RegisterPage registerPage;

    @BeforeSuite
    public void setUp() {
        BasePage.initializeDriver();
        registerPage = new RegisterPage();



    }
//    @AfterSuite
//    public void tearDownSuite() {
//        BasePage.quitDriver();
//}
}