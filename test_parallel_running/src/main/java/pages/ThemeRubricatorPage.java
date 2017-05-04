package pages;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;
import static utils.Constants.*;

/**
 * Created by Sergey_Potapov
 */
public class ThemeRubricatorPage extends BasePage {

    public ThemeRubricatorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = THEME_RUBRIC_PAGE)
    private WebElement themeRubricTab;

    @FindBy(xpath = THEME_RUBRIC_TABLE)
    private WebElement themeRubricTable;

    @FindBy(xpath = NAME_COLUMN_OF_TABLE)
    private WebElement nameColumnTable;

    @FindBy(xpath = DESCRIPTION_COLUMN_OF_TABLE)
    private WebElement descriptionColumnTable;

    @FindBy(xpath = ADD_BUTTON_ON_THEME_RUBRIC_PAGE)
    private WebElement addButtonOnThemeRubricPage;

    @FindBy(xpath = DIALOG_ADD_WINDOW_ON_THEME_RUBRIC_PAGE)
    private WebElement dialogAddWindowOnThemeRubricPage;

    @FindBy(xpath = NAME_OF_RUBRIC_IN_DIALOG_ADD_WINDOW)
    private WebElement nameOfNewRubricInDialogAddWindow;

    @FindBy(xpath = DESCRIPTION_OF_RUBRIC_IN_DIALOG_ADD_WINDOW)
    private WebElement descriptionOfNewRubricInDialogAddWindow;

    @FindBy(xpath = SAVE_BUTTON_OF_RUBRIC_IN_DIALOG_ADD_WINDOW)
    private WebElement saveButtonOfNewRubricInDialogAddWindow;

    @FindBy(xpath = NEW_THEME_RUBRIC)
    private WebElement newThemeRubricInTable;

    @FindBy(xpath = DESCRIPTION_OF_THEME_RUBRIC)
    private WebElement descriptionOfThemeRubricInTable;

    @FindBy(xpath = DELETE_RUBRIC_BUTTON)
    private WebElement deleteRubric;

    @FindBy(xpath = ACCEPT_DELETE_RUBRIC_BUTTON_IN_DIALOG_WINDOW)
    private WebElement deleteButtonOnThemeRubricPageInDialogWindow;

    @FindBy(xpath = CHANGE_BUTTON_ON_THEME_RUBRIC_PAGE)
    private WebElement changeButtonInThemeRubricPage;

    @FindBy(xpath = CHANGE_WINDOW_TITLE_ON_THEME_RUBRIC_PAGE)
    private WebElement changeRubrictTitleInDialogWindow;

    @FindBy(xpath = REQUIRED_FIELD_IN_ADD_NEW_RUBRIC_WINDOW)
    private WebElement requiredField;

    @FindBy(xpath = CLOSE_CHANGE_NEW_RUBRIC_WINDOW_BUTTON)
    private WebElement closeChangeWindow;

    @FindBy(xpath = SAVE_BUTTON_IN_CHANGE_RUBRIC_WINDOW)
    private WebElement saveButtonInChangeRubricButton;

    @FindBy(xpath = NEW_THEME_RUBRIC_AFTER_CHANGE)
    private WebElement newThemeRubricAfterChange;

    @FindBy(xpath = DESCRIPTION_OF_THEME_RUBRIC_AFTER_CHANGE)
    private WebElement descriptionOfThemeRubricAfterChange;

    @FindBy(xpath = IN_THE_END_RADIO_BUTTON_IN_CHANGE_RUBRIC_WINDOW)
    private WebElement inTeEndRadioButtonInChangeRubricWindow;

    @FindBy(xpath = NEW_THEME_RUBRIC_AFTER_CHANGE_IN_THE_END_OF_LIST)
    private WebElement newThemeRubricAfterChangeInTheEndOfList;

    @FindBy(xpath = TRANSFER_BUTTON_ON_THEME_RUBRIC_PAGE)
    private WebElement transferButtonOnThemeRubricPage;

    @FindBy(xpath = SELECT_PARENT_IN_TRANSFER_WINDOW)
    private WebElement selectPerentInTransferWindow;

    @FindBy(xpath = SAVE_BUTTON_IN_TRANSFER_WINDOW)
    private WebElement saveButtonInTransferWindow;

    @FindBy(css = PARENT_RUBRIC_IN_MAIN_PAGE_OF_THEME_RUBRIC_PAGE)
    private WebElement parentRubricInMainPageOgThemeRubricPage;

    @FindBy(xpath = NEW_ADDED_RUBRIC_IN_PARENT_RUBRIC)
    private WebElement newAddedRubricInPerentRubric;

    public void themeRubricPageDisplayed() {
        //logger.info("Go to the Theme Rubric Page");
        moveMouseAndClickOnVisibleElementByJS(driver,themeRubricTab);
    }

    public void themeRubricTableIsVisible() {
        //   logger.info("Theme Rubric Table is Displayed");
        elementVisibility(themeRubricTable, driver);
        //   logger.info("Check Name Columns Of Theme Rubric Table Page");
        elementVisibility(nameColumnTable, driver);
        //  logger.info("Check Description Columns Of Theme Rubric Table Page");
        elementVisibility(descriptionColumnTable, driver);
    }

    public void addNewRubric() {
        // logger.info("Add New Rubric");
        elementVisibility(dialogAddWindowOnThemeRubricPage, driver);
        fillInputField(nameOfNewRubricInDialogAddWindow, driver, "Новая Тестовая Рубрика");
        fillInputField(descriptionOfNewRubricInDialogAddWindow, driver, "Для автотестов");
        elementVisibility(saveButtonOfNewRubricInDialogAddWindow, driver).click();
        elementVisibility(newThemeRubricInTable, driver);
        assertTrue(newThemeRubricInTable.getText().contains("Новая Тестовая Рубрика"));
        assertTrue(descriptionOfThemeRubricInTable.getText().contains("Для автотестов"));
    }

    public void checkRequiredFieldsOfNewAddedRubric() {
        // logger.info("Check required field");
        elementVisibility(addButtonOnThemeRubricPage, driver).click();
        elementVisibility(saveButtonOfNewRubricInDialogAddWindow, driver).click();
        elementVisibility(requiredField, driver);
    }

    public void checkChangeOfNewAddedRubric() throws InterruptedException {
        // logger.info("Change New Rubric");
        Thread.sleep(2000);
        elementVisibility(newThemeRubricInTable, driver).click();
        elementVisibility(changeButtonInThemeRubricPage, driver).click();
        elementVisibility(changeRubrictTitleInDialogWindow, driver);
        fillInputField(nameOfNewRubricInDialogAddWindow, driver, "Новая Тестовая");
        fillInputField(descriptionOfNewRubricInDialogAddWindow, driver, "Для новых автотестов");
        elementVisibility(saveButtonInChangeRubricButton, driver).click();
        Thread.sleep(3000);
        assertTrue(newThemeRubricAfterChange.getText().contains("Новая Тестовая"));
        assertTrue(descriptionOfThemeRubricAfterChange.getText().contains("Для новых автотестов"));
        Thread.sleep(2000);
        elementVisibility(newThemeRubricAfterChange, driver).click();
        elementVisibility(newThemeRubricAfterChange, driver).click();
        elementVisibility(changeButtonInThemeRubricPage, driver).click();
        elementVisibility(changeRubrictTitleInDialogWindow, driver);
        elementVisibility(inTeEndRadioButtonInChangeRubricWindow, driver).click();
        elementVisibility(saveButtonInChangeRubricButton, driver).click();
        Thread.sleep(5000);
        assertTrue(newThemeRubricAfterChangeInTheEndOfList.getText().contains("Новая Тестовая"));
        elementVisibility(newThemeRubricAfterChangeInTheEndOfList, driver).click();
        elementVisibility(newThemeRubricAfterChangeInTheEndOfList, driver).click();
    }

    public void transferOfNewAddedRubric() throws InterruptedException {
        elementVisibility(transferButtonOnThemeRubricPage, driver).click();
        elementVisibility(selectPerentInTransferWindow, driver).click();
        elementVisibility(saveButtonInTransferWindow, driver).click();
        Thread.sleep(2000);
        elementVisibility(parentRubricInMainPageOgThemeRubricPage, driver).click();
      //  elementVisibility(parentRubricInMainPageOgThemeRubricPage, driver).click();
        elementVisibility(newAddedRubricInPerentRubric, driver).click();
        elementVisibility(newAddedRubricInPerentRubric, driver).click();
    }

    public void deleteNewAddedRubric() throws InterruptedException {
        //   logger.info("Delete New Rubric");
        elementVisibility(deleteRubric, driver).click();
        Thread.sleep(5000);
        elementVisibility(deleteButtonOnThemeRubricPageInDialogWindow, driver).click();
    }

    public void checkDeletionOfNewAddedRubric() {
        // logger.info("New Rubric has been successfully deleted");
        elementInvisibility(By.xpath("(//span/i)[2]"), driver);
    }
}
