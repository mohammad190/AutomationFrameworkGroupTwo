package TestHome;

import Twitter_Features.More_features;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_More_features extends CommonAPI {

    @Test
    public void  More_option_features()throws InterruptedException{
        More_features more_features = PageFactory.initElements(driver,More_features.class);
        more_features.More_option_features();
    }
}
