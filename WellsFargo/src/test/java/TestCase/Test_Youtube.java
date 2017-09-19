package TestCase;

import WellsFargo_BankFeatures.Click_youtube_Features;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Youtube extends CommonAPI {

    @Test
    public static void youtube() throws InterruptedException {
        Click_youtube_Features click_youtube_features = PageFactory.initElements(driver,Click_youtube_Features.class);
        click_youtube_features.Features_youtube();
    }
}
