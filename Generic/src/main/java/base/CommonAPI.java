package base;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver;

    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;

    private String saucelabs_username = "";
    private String saucelabs_accesskey = "";
    private String browserstack_username = "";
    private String browserstack_accesskey = "";

    @Parameters({"useCloudEnv", "cloudEnvName", "OS", "OS_Version", "Browser_Version", "browser","url"})
    @BeforeMethod
    public void setUp(@Optional boolean useCloudEnv,@Optional String cloudEnvName,@Optional String OS,@Optional String OS_Version,
                      @Optional String Browser_Version, String browser, String url) throws Exception {
        if (useCloudEnv == true) {
            if(cloudEnvName.equalsIgnoreCase("Browserstack")) {
                get_Cloud_Driver(cloudEnvName, browserstack_username, browserstack_accesskey, OS, OS_Version, browser, Browser_Version);
            } else if (cloudEnvName.equalsIgnoreCase("Saucelabs")) {
                get_Cloud_Driver(cloudEnvName, saucelabs_username, saucelabs_accesskey, OS, OS_Version, browser, Browser_Version);
            }
        } else{
            get_Local_Driver(browser);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.navigate().to(url);
            driver.manage().window().maximize();
        }
    }

    public WebDriver get_Local_Driver(String browser) {

        if(browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.IE.driver", "../Generic/driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("Opera")) {
            System.setProperty("webdriver.opera.driver", "../Generic/driver/operadriver.exe");
            driver = new OperaDriver();
        } else {
            System.err.println("ERROR: Choose from: Firefox/Chrome/IE/Opera.");
        }
        return driver;
    }

    public WebDriver get_Cloud_Driver(String envName, String envUsername, String envAccessKey, String OS,
                                      String OS_Version, String Browser_Name, String Browser_Version) throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("Browser", Browser_Name);
        cap.setCapability("Browser_Version", Browser_Version);
        cap.setCapability("OS", OS);
        cap.setCapability("OS_Version", OS_Version);

        if(envName.equalsIgnoreCase("Saucelabs")) {
            driver = new RemoteWebDriver(new URL
                    ("http://" + envUsername + ":" + envAccessKey + "@ondemand.saucelabs.com:80/wd/hub"), cap);
        } else if (envName.equalsIgnoreCase("Browserstack")) {
            driver = new RemoteWebDriver(new URL
                    ("http://" + envUsername + ":" + envAccessKey + "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
    }

    @AfterMethod
    public void close_Browser() {
        driver.quit();
    }

    public void okAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void cancelAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void goBackToHomeWindow() {
        driver.switchTo().defaultContent();
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void navigateForward() {
        driver.navigate().forward();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void iFrameHandle(WebElement element) {
        driver.switchTo().frame(element);
    }

    public void sleep(int seconds) throws InterruptedException {
        Thread.sleep(1000*seconds);
    }

    public void waitUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitUntilClickable(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitUntilSelectable(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }
}
