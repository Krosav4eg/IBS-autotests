package regressionSuit;

import listner.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagementOfAccessRightsPage;

/**
 * Created by Sergey_Potapov
 */

public class fpspm141_SearchingByParametersTest extends BaseTest {

    @Test
    public void authorizationCoordinatorTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorization("dbn_coordinator", "2wsx2WSX");
        loginPage.checkCordinatorRoleName();
    }

    @Test
    public void searchByFiltrationOnManageOfAccessPageTest() throws InterruptedException {
        ManagementOfAccessRightsPage mainPage = new ManagementOfAccessRightsPage(driver);
        mainPage.managementOfAccessRightPageIsDisplayed();
        mainPage.searchOfUserLastNameOnManagePage();
        mainPage.searchOfUserLoginOnManagePage();
        mainPage.displayOnlyCAOnManagePage();
    }
}
