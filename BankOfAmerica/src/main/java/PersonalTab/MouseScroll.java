package PersonalTab;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;

public class MouseScroll extends CommonAPI {

    static JavascriptExecutor jse = (JavascriptExecutor) driver;

    public static void mouseScroll(int x, int y) {
        String script = "window.scrollBy(" + x + "," + y + ")";
        jse.executeScript(script);
    }
}
