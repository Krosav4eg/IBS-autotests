package regressionSuit;

import listner.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ThemeRubricatorPage;

/**
 * Created by Sergey_Potapov
 */

public class fpspm140_WorkWithRubricatorTest extends BaseTest {
    @Test
    public void authorizationOperatorContentTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorization("dbn_content_operator","2wsx2WSX");
        loginPage.checkContentOperatorRoleName();
    }

    @Test
    public void createNewThemeRubricTest() throws InterruptedException {
        ThemeRubricatorPage themePublicationPage = new ThemeRubricatorPage(driver);
        themePublicationPage.themeRubricPageDisplayed();
        themePublicationPage.themeRubricTableIsVisible();
        themePublicationPage.checkRequiredFieldsOfNewAddedRubric();
        themePublicationPage.addNewRubric();
        themePublicationPage.checkChangeOfNewAddedRubric();
        themePublicationPage.transferOfNewAddedRubric();
    }

    @Test
    public void deleteNewRubricTest() throws InterruptedException {
        ThemeRubricatorPage themePublicationPage = new ThemeRubricatorPage(driver);
        themePublicationPage.deleteNewAddedRubric();
    }

    @Test
    public void newRubricWasSuccessfullyDeletedTest() {
        ThemeRubricatorPage themePublicationPage = new ThemeRubricatorPage(driver);
        themePublicationPage.checkDeletionOfNewAddedRubric();
    }

}
