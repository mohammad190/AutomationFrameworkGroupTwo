package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
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
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonAPI {


    /*
    public static ExtentReports extent;

    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for(String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if(result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if(result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
    }

    @AfterSuite
    public void generateReport() {
        extent.close();
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
    */

    public static WebDriver driver;

    private String saucelabs_username = "";
    private String saucelabs_accesskey = "";
    private String browserstack_username = "ibrahimkhan1";
    private String browserstack_accesskey = "p3yyfzCAhLyz92aajAAK";

    @Parameters({"useCloudEnv", "cloudEnvName", "OS", "OS_Version", "Browser_Version", "browser", "url"})
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
            get_Local_Driver(OS, browser);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.navigate().to(url);
            driver.manage().window().maximize();
        }
    }

    public WebDriver get_Local_Driver(String OS, String browser) {

        if (OS.equalsIgnoreCase("MacOS")) {
            if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/macdriver/geckodriver");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/macdriver/chromedriver");
                driver = new ChromeDriver();
            } else {
                System.err.println("ERROR: Choose from: Firefox/Chrome.");
            }
        } else if (OS.equalsIgnoreCase("Win")) {
            if (browser.equalsIgnoreCase("Firefox")) {
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
            }
            return driver;
        }


    public WebDriver get_Cloud_Driver(String envName, String envUsername, String envAccessKey, String OS,
                                      String OS_Version, String browser, String Browser_Version) throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("Browser", browser);
        cap.setCapability("Browser_Version", Browser_Version);
        cap.setCapability("OS", OS);
        cap.setCapability("OS_Version", OS_Version);

        if(envName.equalsIgnoreCase("Saucelabs")) {
            driver = new RemoteWebDriver(new URL
                    ("http://" + envUsername + ":" + envAccessKey + "@ondemand.saucelabs.com:80/wd/hub"), cap);
        } else if (envName.equalsIgnoreCase("Browserstack")) {
            driver = new RemoteWebDriver(new URL
                    ("http://" + browserstack_username + ":" + browserstack_accesskey + "@hub-cloud.browserstack.com/wd/hub"), cap);
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

    public void takeScreenShot(String screenShotName, String Path) throws IOException {
        String fileName = screenShotName + ".png";
        String directory = Path;
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(directory + fileName));
    }
}
