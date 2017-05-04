package regressionSuit;

import listner.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.MyRightsPage;
import pages.PublicationPage;

/**
 * Created by Sergey_Potapov
 */
public class fpspm130_AnaliticTest extends BaseTest {

    @Test
    public void authorizationAnaliticTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorization("dbn_analyst_ca","2wsx2WSX");
        loginPage.checkAnaliticRoleName();
    }

    @Test
    public void mainPageTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.mainPageIsDisplayed();
        mainPage.allNeededSectionAreDisplayed();
    }
    @Test
    public void publishPageTest() throws InterruptedException {
        PublicationPage publicationPage = new PublicationPage(driver);
        publicationPage.publicationPageISDisplayed();
        publicationPage.allNeededTabsInPublicationPageIsDisplayed();
    }

    @Test
    public void myRightsPageTest() throws InterruptedException {
        MyRightsPage myRightsPage = new MyRightsPage(driver);
        myRightsPage.myRightsPageIsDisplayed();
    }
}
