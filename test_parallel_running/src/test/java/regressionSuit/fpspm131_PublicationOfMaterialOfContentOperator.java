package regressionSuit;

import listner.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.PublicationPage;

import java.awt.*;

/**
 * Created by Avic on 5/3/2017.
 */
public class fpspm131_PublicationOfMaterialOfContentOperator extends BaseTest {
    @Test
    public void authorizationOperatorTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorization("dbn_content_operator", "2wsx2WSX");
        loginPage.checkContentOperatorRoleName();
    }

    @Test
    public void creationOfNewPublicationTest() throws InterruptedException, AWTException {
        PublicationPage publicationPage = new PublicationPage(driver);
        publicationPage.publicationPageISDisplayed();
        publicationPage.checkRequiresFields();
        publicationPage.creationNewPublicationForContentOperator();
    }
    @Test
    public void verifyNewCreatedRubric() throws InterruptedException, AWTException {
        MainPage mainPage = new MainPage(driver);
        mainPage.mainPageIsDisplayed();
        mainPage.assertionOFCreatedPublicationForContentOperator();
    }

    @Test
    public void verifyOfDeletionNewCreatedRubric() {
        MainPage mainPage = new MainPage(driver);
        mainPage.deleteNewCreatedPublication();
    }
}
