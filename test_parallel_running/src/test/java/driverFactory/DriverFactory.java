package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergey_Potapov
 */

public class DriverFactory {

    private static final String FIREFOX = "Firefox";
    private static final String CHROME = "Chrome";
    private static final String IE = "Ie";
    private static final String DRIVER_NAME_IE= "webdriver.ie.driver";
    private static final String PATH_TO_DRIVER_IE = "driver\\IEDriverServer.exe";
    private static final String DRIVER_NAME_CHROME= "webdriver.chrome.driver";
    private static final String PATH_TO_DRIVER_CHROME = "driver\\chromedriver.exe";
    private static final String DRIVER_NAME_FIREFOX= "webdriver.gecko.driver";
    private static final String PATH_TO_DRIVER_FIREFOX = "driver\\geckodriver.exe";

    static {System.setProperty(DRIVER_NAME_CHROME, PATH_TO_DRIVER_CHROME);}
    private static Map<String, WebDriver> drivers = new HashMap<>();

    public static WebDriver getDriver(String driverName) {
        WebDriver driver = drivers.get(driverName);
        if(driver == null) {
            switch (driverName) {
                case FIREFOX: {
                    DesiredCapabilities ffCapabilities = DesiredCapabilities.firefox();
                    driver = new FirefoxDriver(ffCapabilities);
                    drivers.put(FIREFOX, driver);
                    break;
                }
                case CHROME: {
                    DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
                    driver = new ChromeDriver(chromeCapabilities);
                    drivers.put(CHROME, driver);
                    break;
                }
                case IE: {
                    DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
                    driver = new InternetExplorerDriver(ieCapabilities);
                    drivers.put(IE, driver);
                    break;
                }
                default: {
                    break;
                }
            }
        }
        assert driver != null;
     // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}