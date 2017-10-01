package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentFactory;

import java.io.*;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static ExtentReports report;
    public static ExtentTest test;

    public static WebDriver driver;

    private String saucelabs_username = "ibrahimkhan1994";
    private String saucelabs_accesskey = "580ce2de-5196-415d-9486-721c3640de74";
    private String browserstack_username = "sayem991";
    private String browserstack_accesskey = "p3yyfzCAhLyz92aajAAK";


    @Parameters({"useCloudEnv", "cloudEnvName", "platform", "platformVersion", "browserName", "browserVersion" , "url", "reportFileName", "testName"})
    @BeforeMethod
    public void setUp(@Optional boolean useCloudEnv,@Optional String cloudEnvName,@Optional String platform,@Optional String platformVersion,
                      @Optional String browserName, @Optional String browserVersion,
                      @Optional String url, @Optional String pathForReports, @Optional String testName) throws Exception {
        if (useCloudEnv == true) {
            if(cloudEnvName.equalsIgnoreCase("Browserstack")) {
                get_Cloud_Driver(cloudEnvName, browserstack_username, browserstack_accesskey, platform, platformVersion, browserName, browserVersion);
            } else if (cloudEnvName.equalsIgnoreCase("Saucelabs")) {
                get_Cloud_Driver(cloudEnvName, saucelabs_username, saucelabs_accesskey, platform, platformVersion, browserName, browserVersion);
            }
        } else{
            report = ExtentFactory.getInstance(pathForReports);
            test = report.startTest(testName);
            get_Local_Driver(platform, browserName);
            driver.manage().window().maximize();
            test.log(LogStatus.INFO, "Browser Maximized.");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.navigate().to(url);
            test.log(LogStatus.INFO, "Web Application Opened.");
        }
    }

    public WebDriver get_Local_Driver(String platform, String browserName) {

        if (platform.contains("macOS")) {
            if (browserName.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/macdriver/geckodriver");
                driver = new FirefoxDriver();
                test.log(LogStatus.INFO, "Firefox Driver For Mac Executed.");
            } else if (browserName.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/macdriver/chromedriver");
                driver = new ChromeDriver();
                test.log(LogStatus.INFO, "Chrome Driver For Mac Executed.");
            } else {
                System.err.println("ERROR: Choose from: Firefox/Chrome.");
            }
        } else if (platform.equalsIgnoreCase("Win")) {
            if (browserName.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver.exe");
                driver = new FirefoxDriver();
                test.log(LogStatus.INFO, "Firefox Driver For Windows Executed.");
            } else if (browserName.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver.exe");
                driver = new ChromeDriver();
                test.log(LogStatus.INFO, "Chrome Driver For Windows Executed.");
            } else if (browserName.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.IE.driver", "../Generic/driver/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                test.log(LogStatus.INFO, "InternetExplorer Driver For Windows Executed.");
            } else if (browserName.equalsIgnoreCase("Opera")) {
                System.setProperty("webdriver.opera.driver", "../Generic/driver/operadriver.exe");
                driver = new OperaDriver();
                test.log(LogStatus.INFO, "Opera Driver For Windows Executed.");
            } else {
                System.err.println("ERROR: Choose from: Firefox/Chrome/IE/Opera.");
                test.log(LogStatus.INFO, "Invalid Choice Of Driver.");
                }
            }
            return driver;
        }


    public WebDriver get_Cloud_Driver(String cloudEnvName, String envUsername, String envAccessKey, String platform,
                                      String platformVersion, String browserName, String browserVersion) throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", browserName);
        cap.setCapability("browserVersion", browserVersion);
        cap.setCapability("platform", platform);
        cap.setCapability("platformVersion", platformVersion);

        if(cloudEnvName.equalsIgnoreCase("Saucelabs")) {
            driver = new RemoteWebDriver(new URL
                    ("http://" + envUsername + ":" + envAccessKey + "@ondemand.saucelabs.com:80/wd/hub"), cap);
        } else if (cloudEnvName.equalsIgnoreCase("Browserstack")) {
            driver = new RemoteWebDriver(new URL
                    ("http://" + envUsername + ":" + envAccessKey + "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
    }

    @Parameters({"directoryPath"})
    @AfterMethod
    public void close_Browser(ITestResult testResult, @Optional String directoryPath) throws IOException {

        String path = null;
        String imagePath = null;

        if(testResult.getStatus() != ITestResult.SUCCESS) {
            path = takeScreenShot(driver, testResult.getName(), directoryPath);
            imagePath = test.addScreenCapture(path);
            test.log(LogStatus.FAIL, "Failed Test Case", imagePath);
            driver.quit();
            report.endTest(test);
            report.flush();
        } else {
            driver.quit();
            report.endTest(test);
            report.flush();
        }
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

    public String takeScreenShot(WebDriver driver, String fileName, String Path) throws IOException {
        fileName = fileName + ".png";
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(Path + fileName));
        String destination = Path + fileName;
        return destination;
    }
}
