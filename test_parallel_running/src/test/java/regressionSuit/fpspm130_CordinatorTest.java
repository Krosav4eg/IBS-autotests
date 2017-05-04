package regressionSuit;

import listner.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagementOfAccessRightsPage;
import pages.ReportsPage;
import pages.UserTemplatePage;


/**
 * Created by Sergey_Potapov
 */

public class fpspm130_CordinatorTest extends BaseTest {

    @Test
    public void authorizationCordinatorTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorization("dbn_coordinator", "2wsx2WSX");
        loginPage.checkCordinatorRoleName();
    }

    @Test
    public void manageOfAccessPageTest() {
        ManagementOfAccessRightsPage mainPage = new ManagementOfAccessRightsPage(driver);
        mainPage.managementOfAccessRightPageIsDisplayed();
        mainPage.allNeededSectionAreDisplayedInManagePage();
    }

    @Test
    public void userTemplatePageTest() {
        UserTemplatePage userTemplatePage = new UserTemplatePage(driver);
        userTemplatePage.userTemplatePageIsDisplayed();
    }

    @Test
    public void reportPageTest() {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.reportPageIsDisplayed();
    }
}
