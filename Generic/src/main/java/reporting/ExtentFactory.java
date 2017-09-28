package reporting;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {

    public static ExtentReports getInstance(String reportFileName) {
        ExtentReports extent;
        String Path = reportFileName + ".html";
        extent = new ExtentReports(Path, false);
        extent.addSystemInfo("Platform", "Mac").addSystemInfo("Environment", "QA")
                .addSystemInfo("UserName", "Ibrahim Khan");
        return extent;
    }
}
