package pages;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Constants.USERS_TEMPLATES_PAGE;

/**
 * Created by Sergey_Potapov
 */
public class UserTemplatePage extends BasePage {

    //===============================USER TEMPLATE PAGE
    @FindBy(xpath = USERS_TEMPLATES_PAGE)
    private WebElement userTemplatePage;

    public UserTemplatePage(WebDriver driver) {
        super(driver);
    }

    public void userTemplatePageIsDisplayed() {
        // logger.info("User Template Page Is Displayed");
        elementVisibility(userTemplatePage, driver).click();
    }

}
