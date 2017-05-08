package pages;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import static org.testng.Assert.assertTrue;
import static utils.Constants.*;

/**
 * Created by Sergey_Potapov
 */
public class PublicationPage extends BasePage {

    public PublicationPage(WebDriver driver) {
        super(driver);
    }


    //========================Publish page and all tabs============================================

    @FindBy(xpath = PUBLISHING_PAGE)
    private WebElement publishPage;

    //========================Name of material section

    @FindBy(xpath = NAME_OF_MATERIAL_TAB)
    private WebElement nameOfMaterialTab;

    @FindBy(xpath = NAME_OF_MATERIAL_INPUT_FIELD)
    private WebElement nameOfMaterialInputField;

    //========================Requisite of material section

    @FindBy(xpath = REQUISITE_OF_MATERIAL_TAB)
    private WebElement requesiteOfMaterialTab;

    @FindBy(xpath = AUTHOR_INPUT_FIELD)
    private WebElement authorInputField;

    @FindBy(xpath = DATE_OF_SIGNATURE)
    private WebElement dateOfSignature;


    //========================RUBRICATOR OF ORG LEVEL section

    @FindBy(xpath = RUBRICATOR_OF_ORG_LEVEL_TAB)
    private WebElement rubricatorOfOrgLevelTab;

    @FindBy(xpath = SELECT_ORG_OBJECTS)
    private WebElement selectOrgObjects;

    @FindBy(xpath = EXCHANGE_OF_MATERIALS_IN_BANK_OF_RUSSIA)
    private WebElement exchangeOfMaterialsInBankOfRussia;

    @FindBy(xpath = MATERIALS_FOR_GROUP)
    private WebElement materialsForGroup;

    @FindBy(xpath = BR_DISPLAYED_IN_TABLE)
    private WebElement brDispalyedInTable;

    @FindBy(xpath = VOLGO_VIATSKA_MI_DISPLAYED_IN_TABLE)
    private WebElement getPublishPage;

    @FindBy(xpath = BR_DISPLAYED_CHECKBOX_IN_TABLE)
    private WebElement brDisplayedVheckboxInTable;

    @FindBy(xpath = TU_BANK_OF_RUSSIA_TAB)
    private WebElement tuBankOfRussiaTab;

    @FindBy(xpath = VOLGO_VIATSKA_MI)
    private WebElement volgoViatskaMi;

    @FindBy(xpath = MI_DISPLAYED_IN_TABLE)
    private WebElement miDispalyedInTable;

    @FindBy(xpath = MI_DISPLAYED_CHECKBOX_IN_TABLE)
    private WebElement miDisplayedCheckboxInTable;

    @FindBy(xpath = CREDIT_ORGANIZATIONS_OF_BANK_RUSSIA)
    private WebElement creditOrganizationsOfBankRussia;

    @FindBy(xpath = TARUSA)
    private WebElement trausa;

    @FindBy(xpath = SAVE_ORG_TEMPLATE_BUTTON)
    private WebElement saveOrgTemplateButton;

    @FindBy(xpath = MATERIALS_FOR_GROUP_IS_DISPLAYED)
    private WebElement materialsForGroupIsDispalyed;

    //=================================Description of material section

    @FindBy(xpath = DESCRIPTION_OF_MATERIAL_TAB)
    private WebElement descriptionOfMaterialTab;

    @FindBy(xpath = DESCRIPTION_OF_MATERIAL_INPUT_FIELD)
    private WebElement descriptionOfMaterialInputField;

    //=================================Attached fiels section

    @FindBy(xpath = ATTACHED_FIELS_TAB)
    private WebElement attachedFilesTab;

    @FindBy(xpath = ATTACHED_FIELS_DOWNLOAD_BUTTON)
    private WebElement attachedFielsDownloafButton;

    @FindBy(xpath = FIRST_UPLOADED_FILE_IS_DISPLAYING)
    private WebElement firstuploadedFileIsDisplaed;

    @FindBy(xpath = SECOND_UPLOADED_FILE_IS_DISPLAYING)
    private WebElement secondUploadedFileIsDisplaed;

    @FindBy(xpath = THIRD_UPLOADED_FILE_IS_DISPLAYING)
    private WebElement thirdUploadedFileIsDisplaed;

    @FindBy(xpath = FOURTH_UPLOADED_FILE_IS_DISPLAYING)
    private WebElement fourthUploadedFileIsDisplaed;

    @FindBy(xpath = FIFTH_UPLOADED_FILE_IS_DISPLAYING)
    private WebElement fifthUploadedFileIsDisplaed;

    //=================================Theme rubricator section

    @FindBy(xpath = THEME_RUBRICATOR_TAB)
    private WebElement themeRubricatorTab;

    @FindBy(xpath = SELECT_THEME_RUBRICATOR_BUTTON)
    private WebElement selectThemeRzubricatorButton;

    @FindBy(xpath = SELECT_RUBRICATOR_PLUS_BUTTON)
    private WebElement selectRubricatorPlusButton;

    @FindBy(xpath = SELECT_RUBRICATOR_DISPLAYED)
    private WebElement selectRubricatorDisplayed;

    @FindBy(xpath = SELECT_RUBRICATOR_SAVE)
    private WebElement selectRubricatorSave;

    @FindBy(xpath = SELECTED_RUBRICATOR_DISPLAYED)
    private WebElement selectRubricatorDispalyed;

    @FindBy(xpath = TRASH_HOLDER_OF_SELECTED_RUBRICATOR_DISPLAYED)
    private WebElement trashHolderOFselectRubricatorDispalyed;


    //===================================Related materials section

    @FindBy(xpath = RELATED_MATERIALS_TAB)
    private WebElement relatedMaterialsTab;

    @FindBy(xpath = MATERIALS_FOR_GROUP_IS_DISPLAYED_DELETE_BUTTON)
    private WebElement materialsForGroupIsDisplayedDeleteButton;

    @FindBy(xpath = RELATED_MATERIALS_TAB_INPUTFIELD)
    private WebElement relatedMaterialsTabInputField;

    @FindBy(xpath = RELATED_MATERIALS_ADD_BUTTON)
    private WebElement relatedMaterialsAddButton;

    //===================================Service info section

    @FindBy(xpath = SERVICE_INFO_TAB)
    private WebElement serviceInfoTab;


    //========================Requires Fields

    @FindBy(xpath = REQUIRE_FIELD_1)
    private WebElement requireField1;

    @FindBy(xpath = REQUIRE_FIELD_2)
    private WebElement requireField2;

    @FindBy(xpath = REQUIRE_FIELD_3)
    private WebElement requireField3;

    //========================Error prompts for fields

    @FindBy(xpath = ORG_OBJECT_PROMPT)
    private WebElement orgObjectPrompt;

    @FindBy(xpath = ATTACH_FIELS_PROMPT)
    private WebElement attachFielsPromt;

    @FindBy(xpath = NEED_TO_SELECT_THEME_RUBRIC_PROMPT)
    private WebElement needToSelectThemeRubricPrompt;

    //=======================SAVE PUBLICATION BUTTON
    @FindBy(xpath = SAVE_PUBLICATION_BUTTON)
    private WebElement savePublicationButton;

    //==============================================MY METHODS==================================================

    public void checkRequiresFields() {
        elementVisibility(savePublicationButton, driver).click();
        elementVisibility(requireField1, driver);
        elementVisibility(requireField2, driver);
        elementVisibility(requireField3, driver);

        elementVisibility(orgObjectPrompt, driver);
        elementVisibility(attachFielsPromt, driver);
        elementVisibility(needToSelectThemeRubricPrompt, driver);

    }


    public void publicationPageISDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        elementVisibility(publishPage, driver).click();
    }

    public void allNeededTabsInPublicationPageIsDisplayed() {
        //  logger.info("All Needed Tabs In Publication Page Is Displayed");

        elementVisibility(nameOfMaterialTab, driver);
        assertTrue(nameOfMaterialTab.getText().contains("Название материала"));

        elementVisibility(requesiteOfMaterialTab, driver);
        assertTrue(requesiteOfMaterialTab.getText().contains("Реквизиты материала"));

        elementVisibility(rubricatorOfOrgLevelTab, driver);
        assertTrue(rubricatorOfOrgLevelTab.getText().contains("Рубрикатор организационных уровней"));

        elementVisibility(descriptionOfMaterialTab, driver);
        assertTrue(descriptionOfMaterialTab.getText().contains("Описание материала"));

        elementVisibility(attachedFilesTab, driver);
        assertTrue(attachedFilesTab.getText().contains("Прикрепленные файлы"));

        elementVisibility(themeRubricatorTab, driver);
        assertTrue(themeRubricatorTab.getText().contains("Тематический рубрикатор"));

        elementVisibility(relatedMaterialsTab, driver);
        assertTrue(relatedMaterialsTab.getText().contains("Связанные материалы"));

        elementVisibility(serviceInfoTab, driver);
        assertTrue(serviceInfoTab.getText().contains("Служебная информация"));
    }

    public void creationNewPublicationForContentOperator() throws InterruptedException, AWTException {
        //fill name of material level
        elementVisibility(nameOfMaterialInputField, driver).sendKeys("Autotest");

        //fill name of material author
        elementVisibility(authorInputField, driver).sendKeys("Sergey");

        //fill name of material date
        elementVisibility(dateOfSignature, driver).sendKeys("03.05.2017");

        //====================select rubric level for content operator==============================
        elementVisibility(selectOrgObjects, driver).click();
        Thread.sleep(1000);
        elementVisibility(exchangeOfMaterialsInBankOfRussia, driver).click();
        elementVisibility(materialsForGroup, driver).click();
        Thread.sleep(1000);
        elementVisibility(brDispalyedInTable, driver);
        elementVisibility(brDisplayedVheckboxInTable, driver);
        Thread.sleep(1000);
        elementVisibility(saveOrgTemplateButton, driver).click();
        Thread.sleep(1000);
        elementVisibility(materialsForGroupIsDispalyed, driver);

        //  check trash button for org level rubricator
        elementVisibility(materialsForGroupIsDisplayedDeleteButton, driver).click();
        elementInvisibility(By.xpath("//tr/td[2][contains(text(),'Материалы для ГУП')]"), driver);

        // create org objects again
        elementVisibility(selectOrgObjects, driver).click();
        Thread.sleep(1000);
        elementVisibility(exchangeOfMaterialsInBankOfRussia, driver).click();
        elementVisibility(materialsForGroup, driver).click();
        Thread.sleep(1000);
        elementVisibility(brDispalyedInTable, driver);
        elementVisibility(brDisplayedVheckboxInTable, driver);
        Thread.sleep(1000);
        elementVisibility(saveOrgTemplateButton, driver).click();
        Thread.sleep(1000);
        elementVisibility(materialsForGroupIsDispalyed, driver);

        //fill description of material level
        elementVisibility(descriptionOfMaterialInputField, driver).sendKeys("Test material");

        //upload file#1
        elementVisibility(attachedFielsDownloafButton, driver).click();
        Thread.sleep(5000);

        StringSelection ss = new StringSelection("C:\\TestNG\\test_parallel_running\\src\\main\\java\\utils\\docs_and_images\\1.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

        //uploaded file is visible
        elementVisibility(firstuploadedFileIsDisplaed, driver);

        //upload file#2
        elementVisibility(attachedFielsDownloafButton, driver).click();
        Thread.sleep(5000);

        StringSelection s = new StringSelection("C:\\TestNG\\test_parallel_running\\src\\main\\java\\utils\\docs_and_images\\Flow Git.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

        //uploaded file is visible
        elementVisibility(secondUploadedFileIsDisplaed, driver);


        //upload file#3
        elementVisibility(attachedFielsDownloafButton, driver).click();
        Thread.sleep(5000);

        StringSelection str = new StringSelection("C:\\TestNG\\test_parallel_running\\src\\main\\java\\utils\\docs_and_images\\Framework_Documentation.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);
        robo.keyRelease(KeyEvent.VK_V);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

        //uploaded file is visible
        elementVisibility(thirdUploadedFileIsDisplaed, driver);


        //upload file#4
        elementVisibility(attachedFielsDownloafButton, driver).click();
        Thread.sleep(5000);

        StringSelection stringSelection = new StringSelection("C:\\TestNG\\test_parallel_running\\src\\main\\java\\utils\\docs_and_images\\New Text Document.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot rob = new Robot();
        rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);
        rob.keyPress(KeyEvent.VK_CONTROL);
        rob.keyPress(KeyEvent.VK_V);
        rob.keyRelease(KeyEvent.VK_V);
        rob.keyRelease(KeyEvent.VK_CONTROL);
        rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

        //uploaded file is visible
        elementVisibility(fourthUploadedFileIsDisplaed, driver);


        //upload file#5
        elementVisibility(attachedFielsDownloafButton, driver).click();
        Thread.sleep(5000);

        StringSelection stringSel = new StringSelection("C:\\TestNG\\test_parallel_running\\src\\main\\java\\utils\\docs_and_images\\New Text Document (2).txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSel, null);

        Robot ro = new Robot();
        ro.keyPress(KeyEvent.VK_ENTER);
        ro.keyRelease(KeyEvent.VK_ENTER);
        ro.keyPress(KeyEvent.VK_CONTROL);
        ro.keyPress(KeyEvent.VK_V);
        ro.keyRelease(KeyEvent.VK_V);
        ro.keyRelease(KeyEvent.VK_CONTROL);
        ro.keyPress(KeyEvent.VK_ENTER);
        ro.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

        //uploaded file is visible
        elementVisibility(fifthUploadedFileIsDisplaed, driver);

        //select theme rubric button
        Thread.sleep(5000);
        elementVisibility(selectThemeRzubricatorButton, driver).click();
        Thread.sleep(5000);

        elementVisibility(selectRubricatorPlusButton, driver).click();
        elementVisibility(selectRubricatorDisplayed, driver);
        elementVisibility(selectRubricatorSave, driver).click();
        elementVisibility(selectRubricatorDispalyed, driver);
        Thread.sleep(1000);

        //check trash button for theme rubricator
        elementVisibility(trashHolderOFselectRubricatorDispalyed, driver).click();
        elementInvisibility(By.xpath("//div/p[contains(text(),'Рубрика')]"), driver);
        Thread.sleep(1000);

        //select theme rubric button again
        elementVisibility(selectThemeRzubricatorButton, driver).click();
        Thread.sleep(5000);
        elementVisibility(selectRubricatorPlusButton, driver).click();
        elementVisibility(selectRubricatorDisplayed, driver);
        elementVisibility(selectRubricatorSave, driver).click();
        elementVisibility(selectRubricatorDispalyed, driver);

        //create publication
        elementVisibility(savePublicationButton, driver).click();
        Thread.sleep(2000);
    }

    public void creationNewPublicationForAnalitic() throws InterruptedException, AWTException, IOException {
        //fill name of material level
        elementVisibility(nameOfMaterialInputField, driver).sendKeys("Autotest");

        //fill name of material author
        elementVisibility(authorInputField, driver).sendKeys("Sergey");

        //fill name of material date
        elementVisibility(dateOfSignature, driver).sendKeys("03.05.2017");


        //create rubric level for ANALITIC ROLE
        elementVisibility(selectOrgObjects, driver).click();
        Thread.sleep(1000);
        elementVisibility(tuBankOfRussiaTab, driver).click();
        elementVisibility(volgoViatskaMi, driver).click();
        Thread.sleep(1000);
        elementVisibility(miDispalyedInTable, driver);
        elementVisibility(brDisplayedVheckboxInTable, driver);
        Thread.sleep(1000);
        elementVisibility(saveOrgTemplateButton, driver).click();
        elementVisibility(getPublishPage, driver);
        Thread.sleep(1000);

        //  check trash button for org level rubricator
        elementVisibility(materialsForGroupIsDisplayedDeleteButton, driver).click();
        elementInvisibility(By.xpath("//tr/td[2][contains(text(),'МИ по Дальневосточному ФО')]"), driver);

        //create rubric level for ANALITIC ROLE
        elementVisibility(selectOrgObjects, driver).click();
        Thread.sleep(1000);
        elementVisibility(tuBankOfRussiaTab, driver).click();
        elementVisibility(volgoViatskaMi, driver).click();
        Thread.sleep(1000);
        elementVisibility(miDispalyedInTable, driver);
        elementVisibility(brDisplayedVheckboxInTable, driver);
        Thread.sleep(1000);
        elementVisibility(saveOrgTemplateButton, driver).click();
        elementVisibility(getPublishPage, driver);
        Thread.sleep(1000);

        //fill description of material level
        elementVisibility(descriptionOfMaterialInputField, driver).sendKeys("Test material");

        //upload file#1
        elementVisibility(attachedFielsDownloafButton, driver).click();
        Thread.sleep(5000);

        StringSelection s1 = new StringSelection("C:\\TestNG\\test_parallel_running\\src\\main\\java\\utils\\docs_and_images\\1.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);

        Robot r1 = new Robot();
        r1.keyPress(KeyEvent.VK_ENTER);
        r1.keyRelease(KeyEvent.VK_ENTER);
        r1.keyPress(KeyEvent.VK_CONTROL);
        r1.keyPress(KeyEvent.VK_V);
        r1.keyRelease(KeyEvent.VK_V);
        r1.keyRelease(KeyEvent.VK_CONTROL);
        r1.keyPress(KeyEvent.VK_ENTER);
        r1.keyRelease(KeyEvent.VK_ENTER);


        // uploaded file is visible
        elementVisibility(firstuploadedFileIsDisplaed, driver);

        //upload file#2
        elementVisibility(attachedFielsDownloafButton, driver).click();
        Thread.sleep(5000);

        StringSelection s2 = new StringSelection("C:\\TestNG\\test_parallel_running\\src\\main\\java\\utils\\docs_and_images\\Flow Git.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2, null);

        Robot r2 = new Robot();
        r2.keyPress(KeyEvent.VK_ENTER);
        r2.keyRelease(KeyEvent.VK_ENTER);
        r2.keyPress(KeyEvent.VK_CONTROL);
        r2.keyPress(KeyEvent.VK_V);
        r2.keyRelease(KeyEvent.VK_V);
        r2.keyRelease(KeyEvent.VK_CONTROL);
        r2.keyPress(KeyEvent.VK_ENTER);
        r2.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

        //uploaded file is visible
        elementVisibility(secondUploadedFileIsDisplaed, driver);


        //upload file#3
        elementVisibility(attachedFielsDownloafButton, driver).click();
        Thread.sleep(5000);

        StringSelection s3 = new StringSelection("C:\\TestNG\\test_parallel_running\\src\\main\\java\\utils\\docs_and_images\\Framework_Documentation.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s3, null);

        Robot r3 = new Robot();
        r3.keyPress(KeyEvent.VK_ENTER);
        r3.keyRelease(KeyEvent.VK_ENTER);
        r3.keyPress(KeyEvent.VK_CONTROL);
        r3.keyPress(KeyEvent.VK_V);
        r3.keyRelease(KeyEvent.VK_V);
        r3.keyRelease(KeyEvent.VK_CONTROL);
        r3.keyPress(KeyEvent.VK_ENTER);
        r3.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        //uploaded file is visible
        elementVisibility(thirdUploadedFileIsDisplaed, driver);


        //upload file#4
        elementVisibility(attachedFielsDownloafButton, driver).click();
        Thread.sleep(5000);

        StringSelection s4 = new StringSelection("C:\\TestNG\\test_parallel_running\\src\\main\\java\\utils\\docs_and_images\\New Text Document.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s4, null);

        Robot r4 = new Robot();
        r4.keyPress(KeyEvent.VK_ENTER);
        r4.keyRelease(KeyEvent.VK_ENTER);
        r4.keyPress(KeyEvent.VK_CONTROL);
        r4.keyPress(KeyEvent.VK_V);
        r4.keyRelease(KeyEvent.VK_V);
        r4.keyRelease(KeyEvent.VK_CONTROL);
        r4.keyPress(KeyEvent.VK_ENTER);
        r4.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

        //uploaded file is visible
        elementVisibility(fourthUploadedFileIsDisplaed, driver);

        //upload file#5
        elementVisibility(attachedFielsDownloafButton, driver).click();
        Thread.sleep(5000);

        StringSelection s5 = new StringSelection("C:\\TestNG\\test_parallel_running\\src\\main\\java\\utils\\docs_and_images\\New Text Document (2).txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s5, null);

        Robot r5 = new Robot();
        r5.keyPress(KeyEvent.VK_ENTER);
        r5.keyRelease(KeyEvent.VK_ENTER);
        r5.keyPress(KeyEvent.VK_CONTROL);
        r5.keyPress(KeyEvent.VK_V);
        r5.keyRelease(KeyEvent.VK_V);
        r5.keyRelease(KeyEvent.VK_CONTROL);
        r5.keyPress(KeyEvent.VK_ENTER);
        r5.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

        //uploaded file is visible
        elementVisibility(fifthUploadedFileIsDisplaed, driver);

        //select theme rubric button
        elementVisibility(selectThemeRzubricatorButton, driver).click();
        elementVisibility(selectRubricatorPlusButton, driver).click();
        elementVisibility(selectRubricatorDisplayed, driver);
        elementVisibility(selectRubricatorSave, driver).click();
        elementVisibility(selectRubricatorDispalyed, driver);
        Thread.sleep(1000);

        //check trash button for theme rubricator
        elementVisibility(trashHolderOFselectRubricatorDispalyed, driver).click();
        elementInvisibility(By.xpath("//div/p[contains(text(),'Рубрика')]"), driver);
        Thread.sleep(1000);

        //select theme rubric button again
        elementVisibility(selectThemeRzubricatorButton, driver).click();
        Thread.sleep(5000);
        elementVisibility(selectRubricatorPlusButton, driver).click();
        elementVisibility(selectRubricatorDisplayed, driver);
        elementVisibility(selectRubricatorSave, driver).click();
        elementVisibility(selectRubricatorDispalyed, driver);

        //create publication
        elementVisibility(savePublicationButton, driver).click();
        Thread.sleep(2000);
    }
}