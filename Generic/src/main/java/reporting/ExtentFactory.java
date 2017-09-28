package reporting;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {

    public static ExtentReports getInstance(String reportFileName) {
        ExtentReports extent;
        String Path = reportFileName + ".html";
        extent = new ExtentReports(Path, false);
        extent.addSystemInfo("Host", "Ibrahim Khan").addSystemInfo("Environment", "QA")
                .addSystemInfo("Framework" , "Hybrid");
        return extent;
    }
}
