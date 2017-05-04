package pages;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Constants.MY_RIGHTS_PAGE;

/**
 * Created by Sergey_Potapov
 */
public class MyRightsPage extends BasePage {

    public MyRightsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = MY_RIGHTS_PAGE)
    private WebElement myRightsPage;


    public void myRightsPageIsDisplayed() throws InterruptedException {
        //logger.info("MyRights Page Is Displayed");
        Thread.sleep(5000);
        elementVisibility(myRightsPage, driver).click();
    }


}
