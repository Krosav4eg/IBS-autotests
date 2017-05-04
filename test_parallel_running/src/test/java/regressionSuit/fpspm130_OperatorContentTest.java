package regressionSuit;

import listner.BaseTest;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Sergey_Potapov
 */

public class fpspm130_OperatorContentTest extends BaseTest {

    @Test
    public void authorizationOperatorTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorization("dbn_content_operator","2wsx2WSX");
        loginPage.checkContentOperatorRoleName();
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
    public void themeRubricPageTest() {
        ThemePublicationPage themePublicationPage = new ThemePublicationPage(driver);
        themePublicationPage.themeRubricPageDisplayed();
        themePublicationPage.themeRubricTableIsVisible();
    }

    @Test
    public void reportPageTest() {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.reportPageIsDisplayed();
    }
}

