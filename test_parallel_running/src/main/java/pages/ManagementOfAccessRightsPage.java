package pages;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;
import static utils.Constants.*;

/**
 * Created by Sergey_Potapov
 */
public class ManagementOfAccessRightsPage extends BasePage {

    public ManagementOfAccessRightsPage(WebDriver driver) {
        super(driver);
    }

    //==================================FPS PM TAB
    @FindBy(xpath = FPS_PM_TAB)
    private WebElement fpsPmTab;

    //================================MANAGE OF ACCESS PAGE
    @FindBy(xpath = MANAGEMENT_OF_ACCESS_RIGHTS)
    private WebElement managemetOfAccessRights;

    //================================SEARCH PARAMETERS SECTION
    @FindBy(xpath = SEARCH_PARAMETERS_SECTION)
    private WebElement searchParametersSection;

    @FindBy(xpath = INPUT_LAST_NAME_FIST_NAME_FIELD)
    private WebElement inputLastNameField;

    @FindBy(xpath = INPUT_LOGIN_FIELD)
    private WebElement inputLoginField;

    //=======================DEPARTMENT DROPDOWN FILTERS=============================================
    @FindBy(css = DROPDOWN_DEPARTMENT_BUTTON)
    private WebElement dropDowndDepartmentButton;

    @FindBy(css = ALL_DEPARTMENTS_FILTER)
    private WebElement allDepartmentsFilter;

    @FindBy(xpath = VOLGO_VJTSKAJ_MI_FILTER)
    private WebElement volgoVjtskajMiFilter;

    @FindBy(xpath = VOLGO_VJTSKAJ_GU_OF_BANK_RUSSIA_FILTER)
    private WebElement volgoVjtskajGuOfBankRussiaFilter;

    @FindBy(xpath = GU_OF_BANK_RUSSIA_FILTER)
    private WebElement guOfBankRussiaFilter;

    @FindBy(xpath = GU_OF_MOSCOW_REGION)
    private WebElement guOfMoscowRegionFilter;

    @FindBy(xpath = DALNEVOSTOCHNOE_GU_OF_BANK_RUSSIA)
    private WebElement dalnevostochnoeGuOfBankRussiaFilter;

    @FindBy(xpath = MI_PO_DALNEVOSTOCHNOMU_FO)
    private WebElement miPodalnevostochnoeFoFilter;

    @FindBy(xpath = MI_PO_SEVERO_ZAPADNOMU_FO)
    private WebElement miPoSeveroZapadnomuFoFilter;

    @FindBy(xpath = MI_PO_SEBIRSCOMU_FO)
    private WebElement miPoSebirscomuFoFilter;

    @FindBy(xpath = MI_PO_CENTRALNOMU_FO)
    private WebElement miPoCentralnomuFoFilter;

    @FindBy(xpath = MI_PO_IUJNOMU_I_SEVERNOMU_KAVKAZU)
    private WebElement miPoIujnomuISebvernomuKavkazuFilter;

    @FindBy(xpath = MI_PO_GORODU_MOSCOW)
    private WebElement miPoGoroduMoscowFilter;

    @FindBy(xpath = CALUGA_DEP)
    private WebElement calugaDepFilter;

    @FindBy(xpath = SEVERO_ZAPADNOE_GU_BANK_OF_RUSSIA)
    private WebElement severoZapadnoeGuBankOfRussiaFilter;

    @FindBy(xpath = SIBIRSKOE_GU_BANKA_RUSSIA)
    private WebElement sebirscoeGuBankOfRussiaFilter;

    @FindBy(xpath = URALSCOE_MI)
    private WebElement uralscoeOfRussiaFilter;

    @FindBy(xpath = URALSCOE_GU_OF_BANK_RUSSIA)
    private WebElement uralscoeGuOfRussiaFilter;

    @FindBy(xpath = UJNOE_GU_OF_BANK_RUSSIA)
    private WebElement ujnoeGuOfRussiaFilter;

    //=======================ROLE DROPDOWN FILTERS=============================================

    @FindBy(xpath = DROPDOWN_ROLE_BUTTON)
    private WebElement dropDownRoleButton;

    @FindBy(xpath = DROPDOWN_ALL_ROLE_BUTTON)
    private WebElement dropDownAllRoleButton;

    @FindBy(xpath = DROPDOWN_ROLE_CONTENT_OPERATOR_BUTTON)
    private WebElement dropDownRoleContentButton;

    @FindBy(xpath = DROPDOWN_ROLE_ANALITIC_BUTTON)
    private WebElement dropDownRoleAnaliticButton;

    //================================SEARCH ONLY CA CHECKBOX

    @FindBy(xpath = DISPLAY_ONLY_CA_CHECKBOX)
    private WebElement displayOnlyCaCheckBox;

    //================================SEARCH RESULTS BY FIRST AND LAST NAME IN TABLE

    @FindBy(xpath = RESULTS_OF_SEARCH_TABLE)
    private WebElement resultsOfSearchTable;

    @FindBy(xpath = USER_FIRST_NAME_LAST_NAME_IN_TABLE)
    private WebElement firstNameLastNameInTable;

    //================================SEARCH RESULTS BY LOGIN IN TABLE
    @FindBy(xpath = USER_LOGIN_IN_IN_TABLE)
    private WebElement userLoginInTable;

    //================================SEARCH RESULTS BY ONLY CA IN TABLE

    @FindBy(xpath = FOUNTED_USER_1_IN_TABLE)
    private WebElement displayfoundedUser1;

    @FindBy(xpath = FOUNTED_USER_2_IN_TABLE)
    private WebElement displayfoundedUser2;

    @FindBy(xpath = FOUNTED_USER_3_IN_TABLE)
    private WebElement displayfoundedUser3;

    @FindBy(xpath = FOUNTED_USER_4_IN_TABLE)
    private WebElement displayfoundedUser4;


    //================================UNCONFIRMED  ROLE  IN TABLE

    @FindBy(xpath = UNCONFIRMED_ROLE_IN_TABLE)
    private WebElement unconfirmedRole;

    @FindBy(xpath = CONFIRMATION_ROLE_FOR_USER_DIALOG_WINDOW)
    private WebElement confirmedRoleForUser;

    @FindBy(xpath = CONFIRMATION_ROLE_FOR_USER_DIALOG_WINDOW_CHECKBOX)
    private WebElement confirmedRoleForUserCheckBox;

    @FindBy(xpath = CONFIRMATION_ROLE_FOR_USER_DIALOG_WINDOW_SAVE_BUTTON)
    private WebElement confirmedRoleForUserSaveButton;

    //================================CONFIRMED ROLE  IN TABLE

    @FindBy(xpath = CONFIRMED_ROLE_IN_TABLE)
    private WebElement confirmedRole;

    //================================SELECTION OF RUBRIC IN TABLE

    @FindBy(xpath = RUBRIC_ICON)
    private WebElement rubricIcon;

    @FindBy(xpath = SELECT_RUBRIC_WINDOW)
    private WebElement selectRubricWindow;

    @FindBy(xpath = SELECT_RUBRIC)
    private WebElement selectRubric;

    @FindBy(xpath = SELECT_RUBRIC_IS_DISPLAYED)
    private WebElement selectedRubricIsDispalayed;

    @FindBy(xpath = SELECTED_RUBRIC_CHECKBOX1)
    private WebElement selectedRubricCheckbox1;

    @FindBy(xpath = DELETE_SELECTED_RUBRIC_BUTTON)
    private WebElement deleteSelectedRubricButton;

    @FindBy(xpath = NO_RECORDS_FOUND_MESSAGE)
    private WebElement noRecordsFoundMessage;

    @FindBy(xpath = SAVE_RUBRIC_BUTTON)
    private WebElement saveRubricButton;


    //========================Founded USERS FOR ANALITIC SEARCH=============================================
    @FindBy(xpath = "(//td[contains(text(),'dbn_content_operator')])[2]")
    private WebElement contetntOperatorFoundedUser;

    @FindBy(xpath = "(//td[contains(text(),'dbn_analyst_ca')])[2]")
    private WebElement analiticFoundedUser1;

    @FindBy(xpath = "(//td[contains(text(),'dbn_analyst_mi_2')])[2]")
    private WebElement analiticFoundedUser2;

    @FindBy(xpath = "(//td[contains(text(),'dbn_analyst_tu_29')])[2]")
    private WebElement analiticFoundedUser3;

    @FindBy(xpath = "(//td[contains(text(),'dbn_analyst_tu_29')])[2]")
    private WebElement analiticFoundedUser4;

    @FindBy(xpath = "(//td[contains(text(),'dbn_analyst_tu_45')])[2]")
    private WebElement analiticFoundedUser5;

    @FindBy(xpath = "(//td[contains(text(),'dbn_member_mi_2')])[2]")
    private WebElement analiticFoundedUser6;


    //==========================================================================================================
    public void managementOfAccessRightPageIsDisplayed() {
        //logger.info("Assertion that management Of Access Right Page Is Displayed");
        elementVisibility(fpsPmTab, driver).click();
        fpsPmTab.click();
        elementVisibility(managemetOfAccessRights, driver);
    }

    public void allNeededSectionAreDisplayedInManagePage() {
        // logger.info("Assertion that all NeededSection Are Displayed In Manage Page");
        elementVisibility(searchParametersSection, driver);
        elementVisibility(resultsOfSearchTable, driver);
    }

    public void searchOfUserLastNameOnManagePage() throws InterruptedException {
        //logger.info("search of User Last Name On Manage Page");
        fillInputField(inputLastNameField, driver, "ДБН dbn_content_operator");
        elementVisibility(firstNameLastNameInTable, driver);
        assertTrue(firstNameLastNameInTable.getText().contains("ДБН dbn_content_operator"));
        waitingCustomForElement();
    }

    public void searchOfUserLoginOnManagePage() throws InterruptedException {
        //logger.info("search of User Login On Manage Page");
        elementVisibility(inputLastNameField, driver).clear();
        fillInputField(inputLoginField, driver, "dbn_analyst_ca");
        elementVisibility(userLoginInTable, driver);
        waitingCustomForElement();
        assertTrue(userLoginInTable.getText().contains("dbn_analyst_ca"));

    }

    public void displayOnlyCAOnManagePage() throws InterruptedException {
        // logger.info("display Only Content Analist On ManagePage");
        elementVisibility(inputLoginField, driver).clear();
        elementVisibility(displayOnlyCaCheckBox, driver).click();
        waitingCustomForElement();
        assertTrue(displayfoundedUser1.getText().contains("Центральный аппарат"));
        assertTrue(displayfoundedUser2.getText().contains("Центральный аппарат"));
        assertTrue(displayfoundedUser3.getText().contains("Центральный аппарат"));
        assertTrue(displayfoundedUser4.getText().contains("МИ по Центральному ФО"));
    }

    public void approvalOfRoleOnManagePage() throws InterruptedException {
        //  logger.info("approval Of Role On Manage Page");
        waitingCustomForElement();
        elementVisibility(unconfirmedRole, driver).click();
        elementVisibility(confirmedRoleForUserCheckBox, driver).click();
        waitingCustomForElement();
        elementVisibility(confirmedRoleForUserSaveButton, driver).click();
        waitingCustomForElement();
        elementVisibility(confirmedRole, driver);
        waitingCustomForElement();
        elementVisibility(confirmedRole, driver).click();
        waitingCustomForElement();
        elementVisibility(confirmedRoleForUserCheckBox, driver).click();
        waitingCustomForElement();
        elementVisibility(confirmedRoleForUserSaveButton, driver).click();
        waitingCustomForElement();
        elementVisibility(unconfirmedRole, driver);
    }

    public void assignRubricToTheRole() throws InterruptedException {
        // logger.info("Assign Rubric To The Role");
        waitingCustomForElement();
        elementVisibility(rubricIcon, driver).click();
        elementVisibility(selectRubricWindow, driver);
        waitingCustomForElement();
        elementVisibility(selectRubric, driver).click();
        waitingCustomForElement();
        elementVisibility(selectedRubricIsDispalayed, driver);
        elementVisibility(saveRubricButton, driver).click();
        waitingCustomForElement();
        elementVisibility(rubricIcon, driver).click();
        waitingCustomForElement();
        elementVisibility(selectedRubricIsDispalayed, driver);
        waitingCustomForElement();
        elementVisibility(selectedRubricCheckbox1, driver).click();
        elementVisibility(deleteSelectedRubricButton, driver).click();
        waitingCustomForElement();
        elementVisibility(saveRubricButton, driver).click();
        waitingCustomForElement();
        elementVisibility(rubricIcon, driver).click();
        waitingCustomForElement();
        elementVisibility(noRecordsFoundMessage, driver);
    }

    public void assertionRoleFilter() throws InterruptedException {
        //  logger.info("Assertion Role Filter");
        waitingCustomForElement();
        moveMouseAndClickOnVisibleElementByJS(driver, dropDownRoleButton);
        elementVisibility(dropDownRoleContentButton, driver).click();
        waitingCustomForElement();
        assertTrue(contetntOperatorFoundedUser.getText().contains("dbn_content_operator"));

        moveMouseAndClickOnVisibleElementByJS(driver, dropDownRoleButton);
        elementVisibility(dropDownRoleAnaliticButton, driver).click();
        elementVisibility(analiticFoundedUser1, driver);
        elementVisibility(analiticFoundedUser2, driver);
        elementVisibility(analiticFoundedUser3, driver);
        elementVisibility(analiticFoundedUser4, driver);
        elementVisibility(analiticFoundedUser5, driver);
        elementVisibility(analiticFoundedUser6, driver);

        moveMouseAndClickOnVisibleElementByJS(driver, dropDownRoleButton);
        elementVisibility(dropDownAllRoleButton, driver).click();
        elementVisibility(contetntOperatorFoundedUser, driver);
//        elementVisibility(analiticFoundedUser1, driver);
//        elementVisibility(analiticFoundedUser2, driver);
//        elementVisibility(analiticFoundedUser3, driver);
//        elementVisibility(analiticFoundedUser4, driver);
//        elementVisibility(analiticFoundedUser5, driver);
//        elementVisibility(analiticFoundedUser6, driver);

    }

    public void assertionDepartmentFilter() throws InterruptedException {
        //  logger.info("Assertion Department Filter");
        waitingCustomForElement();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(volgoVjtskajMiFilter, driver).click();
        waitingCustomForElement();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(volgoVjtskajGuOfBankRussiaFilter, driver).click();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(guOfBankRussiaFilter, driver).click();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(guOfMoscowRegionFilter, driver).click();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(dalnevostochnoeGuOfBankRussiaFilter, driver).click();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(miPodalnevostochnoeFoFilter, driver).click();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(miPoSeveroZapadnomuFoFilter, driver).click();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(miPoSebirscomuFoFilter, driver).click();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        waitingCustomForElement();
        elementVisibility(miPoCentralnomuFoFilter, driver).click();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        moveMouseAndClickOnVisibleElementByJS(driver, miPoIujnomuISebvernomuKavkazuFilter);

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(miPoGoroduMoscowFilter, driver).click();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(calugaDepFilter, driver).click();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(severoZapadnoeGuBankOfRussiaFilter, driver).click();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(sebirscoeGuBankOfRussiaFilter, driver).click();

        waitingCustomForElement();
        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(uralscoeOfRussiaFilter, driver).click();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(uralscoeGuOfRussiaFilter, driver).click();

        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(ujnoeGuOfRussiaFilter, driver).click();

        waitingCustomForElement();
        moveMouseAndClickOnVisibleElementByJS(driver, dropDowndDepartmentButton);
        elementVisibility(allDepartmentsFilter, driver).click();
    }
}
