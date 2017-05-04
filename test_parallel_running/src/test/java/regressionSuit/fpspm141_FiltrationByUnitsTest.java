package regressionSuit;


import listner.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagementOfAccessRightsPage;


/**
 * Created by Sergey_Potapov
 */

public class fpspm141_FiltrationByUnitsTest extends BaseTest {

    @Test
    public void authorizationCordinatorTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorization("dbn_coordinator", "2wsx2WSX");
        loginPage.checkCordinatorRoleName();
    }

    @Test
    public void verifyingDepartmentTest() throws InterruptedException {
        ManagementOfAccessRightsPage managementOfAccessRightsPage = new ManagementOfAccessRightsPage(driver);
        managementOfAccessRightsPage.managementOfAccessRightPageIsDisplayed();
        managementOfAccessRightsPage.assertionDepartmentFilter();
    }

    @Test
    public void verifyingRoleTest() throws InterruptedException {
        ManagementOfAccessRightsPage managementOfAccessRightsPage = new ManagementOfAccessRightsPage(driver);
        managementOfAccessRightsPage.assertionRoleFilter();
    }

}

