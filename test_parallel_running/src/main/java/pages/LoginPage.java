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

public class LoginPage extends BasePage {
    public static String role;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //========================LOGIN PAGE=============================================
    @FindBy(id = LOGIN_FIELD)
    private WebElement loginField;

    @FindBy(id = PASSWORD_FIELD)
    private WebElement passwordField;

    @FindBy(xpath = AUTHORIZATION_BUTTON)
    private WebElement authorizationButton;

    @FindBy(xpath = CONTENT_OPERATOR_ROLE_INDICATOR)
    private WebElement contentOperatorRoleIndicator;

    @FindBy(xpath = ANALITIC_ROLE_INDICATOR)
    private WebElement analiticRoleIndicator;

    @FindBy(xpath = COORDINATOR_ROLE_INDICATOR)
    private WebElement cordinatorRoleIndicator;

    //========================

    public void loginIntoSite(String userLogin) {
        //logger.info("Start authorization");
        driver.get(URL);
        loginField.clear();
        loginField.sendKeys(userLogin);
        passwordField.clear();
     //   elementVisibility(passwordField, driver).sendKeys(PASSWORD);
        passwordField.sendKeys(PASSWORD);
        authorizationButton.click();
//        if (userLogin.equalsIgnoreCase("dbn_content_operator")) {
//            role = "Оператор контента";
//        } else if (userLogin.equalsIgnoreCase("dbn_analyst_ca")) {
//            role = "Аналитик";
//        } else if (userLogin.equalsIgnoreCase("dbn_coordinator")) {
//            role = "Координатор";
//        }
    }
public void authorization(String login, String pass) throws InterruptedException {
    driver.get(URL);
    loginField.clear();
    loginField.sendKeys(login);
    Thread .sleep(2000);
    elementVisibility(passwordField, driver);
    passwordField.clear();
    passwordField.sendKeys(pass);
    authorizationButton.click();
    if (login.equalsIgnoreCase("dbn_content_operator")) {
        role = "Оператор контента";
    } else if (login.equalsIgnoreCase("dbn_analyst_ca")) {
        role = "Аналитик";
    } else if (login.equalsIgnoreCase("dbn_coordinator")) {
        role = "Координатор";
    }
}

    public void checkContentOperatorRoleName() {
        //logger.info("Check Content Operator Role");
        elementVisibility(contentOperatorRoleIndicator, driver);
        assertTrue(contentOperatorRoleIndicator.getText().contains("Оператор Контента ДБН"));
    }

    public void checkAnaliticRoleName() {
       // logger.info("Check Analitic Role");
        elementVisibility(analiticRoleIndicator, driver);
        assertTrue(analiticRoleIndicator.getText().contains("Аналитик ЦА ДБН"));
    }

    public void checkCordinatorRoleName() {
      //  logger.info("Check Cordinator Role");
        elementVisibility(cordinatorRoleIndicator, driver);
        assertTrue(cordinatorRoleIndicator.getText().contains("Координатор ДБН"));
    }
}