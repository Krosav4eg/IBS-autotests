package pages;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Constants.*;

/**
 * Created by Sergey_Potapov
 */

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    //========================MAIN PAGE TAB=============================================

    @FindBy(xpath = MAIN_PAGE)
    protected WebElement mainPageTab;

    //========================Organizational level SECTION=============================================

    @FindBy(xpath = ORG_LEVEL_BLOCK)
    protected WebElement orgBlock;

    //========================THEME RUBRICS SECTION=============================================

    @FindBy(xpath = THEME_RUBRIC_BLOCK)
    protected WebElement themeRibricBlock;

    //========================TEST DATA RIGHT SECTION=============================================

    @FindBy(xpath = TEST_DATA_RIGHT_SECTION)
    protected WebElement testDataRightSection;

    //--------------------------------------------------------------------------------------------

    @FindBy(xpath = CREATED_RUBRIC_ASSERTION)
    private WebElement createdRubricAssertion;

    @FindBy(xpath = DATE_OF_SIGNATURE_NEWCREATED_RUBRIC)
    private WebElement dateOfSignatureNewCreatedRubric;

    @FindBy(xpath = PUBLISED_NEWCREATED_RUBRIC)
    private WebElement publishedNewCreatedRubric;

    @FindBy(xpath = PUBLISED_NEWCREATED_AUTHOR)
    private WebElement publishedNewCreatedAuthor;

    @FindBy(xpath = PUBLISED_PERSON_NEWCREATED_RUBRIC)
    private WebElement publishedNewCreatedRUBRIC;

    @FindBy(xpath = PUBLISED_PERSON_NEWCREATED_RUBRIC_FOR_ANALITIC)
    private WebElement publishedNewCreatedRUBRICForAnalitic;

    @FindBy(xpath = BR)
    private WebElement br;

    @FindBy(xpath = MI)
    private WebElement mi;

    @FindBy(xpath = RUBRICS)
    private WebElement rubrics;

    @FindBy(xpath = TEMPLATE_BUTTON)
    private WebElement templateButton;

    @FindBy(xpath = EDIT_BUTTON)
    private WebElement editButto;

    @FindBy(xpath = DELETE_BUTTON)
    private WebElement deleteButton;

    @FindBy(xpath = DELETE_NEW_RUBRIC_BUTTON)
    private WebElement deleteNewRubricButton;


    public void mainPageIsDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        elementVisibility(mainPageTab, driver).click();
    }

    public void allNeededSectionAreDisplayed() {
        //logger.info("Assertion All needed section");
        elementVisibility(orgBlock, driver);
        elementVisibility(themeRibricBlock, driver);
        elementVisibility(testDataRightSection, driver);
    }

    public void assertionOFCreatedPublicationForContentOperator() {
        elementVisibility(createdRubricAssertion, driver);
        elementVisibility(dateOfSignatureNewCreatedRubric, driver);
        elementVisibility(publishedNewCreatedRubric, driver);
        elementVisibility(publishedNewCreatedAuthor, driver);
        elementVisibility(publishedNewCreatedRUBRIC, driver);
        elementVisibility(br, driver);
        elementVisibility(rubrics, driver);
        elementVisibility(templateButton, driver);
        elementVisibility(editButto, driver);
    }

    public void assertionOFCreatedPublicationForAnalitic() {
        elementVisibility(createdRubricAssertion, driver);
        elementVisibility(dateOfSignatureNewCreatedRubric, driver);
        elementVisibility(publishedNewCreatedRubric, driver);
        elementVisibility(publishedNewCreatedAuthor, driver);
        elementVisibility(publishedNewCreatedRUBRICForAnalitic, driver);
        elementVisibility(mi, driver);
        elementVisibility(rubrics, driver);
        elementVisibility(templateButton, driver);
        elementVisibility(editButto, driver);
    }

    public void deleteNewCreatedPublication() {
        elementVisibility(deleteButton, driver).click();
        elementVisibility(deleteNewRubricButton, driver).click();
        elementInvisibility(By.xpath("//div/a[contains(text(),'Autotest')]"), driver);
    }
}