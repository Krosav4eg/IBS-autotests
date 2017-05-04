package basePage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by Sergey_Potapov
 */

public abstract class BasePage {

    protected WebDriver driver;

    private static final int WAITING_TIMEOUT = 20000;
    //  protected static final Logger logger = LogManager.getLogger(basePage.BasePage.class);

    //========================AUTHORIZATIONS CONSTANTS=============================================

    protected static final String URL = "https://172.28.246.76:10029/wps/portal";
    public static final String CONTENT_OPERATOR_LOGIN = "dbn_content_operator";
    public static final String ANALITIC_LOGIN = "dbn_analyst_ca";
    public static final String COORDINATOR_LOGIN = "dbn_coordinator";
    protected static final String PASSWORD = "2wsx2WSX";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //========================CUSTOM METHODS=============================================

    protected WebElement elementVisibility(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, WAITING_TIMEOUT);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected Boolean elementInvisibility(By locator, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, WAITING_TIMEOUT);
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }


    protected WebElement elementIsClicable(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, WAITING_TIMEOUT);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void fillInputField(WebElement element, WebDriver driver, String message) {
        elementVisibility(element, driver).clear();
        elementVisibility(element, driver).sendKeys(message);
        element.sendKeys(Keys.ENTER);
    }

    protected void moveMouseTo(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        elementVisibility(element, driver).click();
    }

    protected void moveMouseAndClickOnVisibleElementByJS(WebDriver driver, WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    protected void waitingCustomForElement() throws InterruptedException {
        Thread.sleep(5000);

    }

    protected void scrollDown() {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
            LOGGER.log(Level.WARNING, "AWT Exception occurs, see message for details: %s", e.getMessage());
        }
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    }


}
