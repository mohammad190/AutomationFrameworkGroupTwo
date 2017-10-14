package reporting;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.ITestContext;
import org.testng.Reporter;

import java.io.File;

public class ExtentManager {


    private static ExtentReports extent;
    private static ITestContext context;

    public static ExtentReports getInstance() {

        if(extent == null) {
            File outputDirectory = new File(context.getOutputDirectory());
            File resultDirectory = new File(outputDirectory.getParentFile(), "html");
            extent = new ExtentReports(System.getProperty("user.dir")+"extent-Report/ExtentReport.html", true);
            Reporter.log("Extent Report Directory " + resultDirectory, true);
            extent.addSystemInfo("Host", "Ibrahim Khan").addSystemInfo("Environment", "QA")
                    .addSystemInfo("Framework", "Hybrid");
            extent.loadConfig(new File(System.getProperty("user.dir") + "/report-config.xml"));
        }
        return extent;
    }

    public static void setOutputDirectory(ITestContext context) {
        ExtentManager.context = context;
    }
}
