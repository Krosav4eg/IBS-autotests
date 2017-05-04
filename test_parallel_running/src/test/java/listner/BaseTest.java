package listner;


import driverFactory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by Sergey_Potapov
 */
public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = DriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}