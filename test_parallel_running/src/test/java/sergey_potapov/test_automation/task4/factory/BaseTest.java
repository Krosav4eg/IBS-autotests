package sergey_potapov.test_automation.task4.factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by Sergey_Potapov
 */
public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected static final String URL = "http://www.johnlewis.com/";

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }

    @AfterClass
    public void close() {
        driver.quit();
       // driver.close();


    }
}