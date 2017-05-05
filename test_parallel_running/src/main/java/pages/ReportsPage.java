package pages;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Constants.REPORTS_PAGE;

/**
 * Created by Sergey_Potapov
 */
public class ReportsPage extends BasePage {
    public ReportsPage(WebDriver driver) {
        super(driver);
    }

    //======================REPORT PAGE TAB
    @FindBy(xpath = REPORTS_PAGE)
    private WebElement reportPage;


    public void reportPageIsDisplayed() {
        //logger.info("Report Page Is Displayed");
        elementVisibility(reportPage, driver).click();
    }
}
