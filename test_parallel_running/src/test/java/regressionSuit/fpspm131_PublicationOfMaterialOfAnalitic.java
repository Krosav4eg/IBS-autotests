package regressionSuit;

import listner.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.PublicationPage;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Avic on 5/4/2017.
 */
public class fpspm131_PublicationOfMaterialOfAnalitic extends BaseTest {

    @Test
    public void authorizationAnaliticTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorization("dbn_analyst_ca","2wsx2WSX");
        loginPage.checkAnaliticRoleName();
    }

    @Test
    public void creationOfNewPublicationTest() throws InterruptedException, AWTException, IOException {
        PublicationPage publicationPage = new PublicationPage(driver);
        publicationPage.publicationPageISDisplayed();
        publicationPage.checkRequiresFields();
        publicationPage.creationNewPublicationForAnalitic();
    }

    @Test
    public void verifyNewCreatedRubric() throws InterruptedException, AWTException {
        MainPage mainPage = new MainPage(driver);
        mainPage.mainPageIsDisplayed();
        mainPage.assertionOFCreatedPublicationForAnalitic();
    }

    @Test
    public void verifyOfDeletionNewCreatedRubric() {
        MainPage mainPage = new MainPage(driver);
        mainPage.deleteNewCreatedPublication();
    }









}
