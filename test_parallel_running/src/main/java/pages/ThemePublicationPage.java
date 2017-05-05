package pages;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Constants.*;

/**
 * Created by Sergey_Potapov
 */
public class ThemePublicationPage extends BasePage {

    public ThemePublicationPage(WebDriver driver) {
        super(driver);
    }

    //================================THEME RUBRIC PAGE
    @FindBy(xpath = THEME_RUBRIC_PAGE)
    private WebElement themeRubricTab;

    //================================THEME RUBRIC TABLE SECTION
    @FindBy(xpath = THEME_RUBRIC_TABLE)
    private WebElement themeRubricTable;

    @FindBy(xpath = NAME_COLUMN_OF_TABLE)
    private WebElement nameColumnTable;

    @FindBy(xpath = DESCRIPTION_COLUMN_OF_TABLE)
    private WebElement descriptionColumnTable;


    //====================================
    public void themeRubricPageDisplayed() {
        //logger.info("Theme Rubric Page Displayed");
        elementVisibility(themeRubricTab, driver).click();
    }

    public void themeRubricTableIsVisible() {
        // logger.info("Theme Rubric Table Is Visible");
        elementVisibility(themeRubricTable, driver);
        elementVisibility(nameColumnTable, driver);
        elementVisibility(descriptionColumnTable, driver);
    }
}
