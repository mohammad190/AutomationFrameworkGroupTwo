package TestMovingFeatures;

import MovingHomePage.MovingHomePageFeatures;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMovingHomePage extends CommonAPI {

    @Test
    public void MovingHomePage()throws InterruptedException{
        MovingHomePageFeatures movingHomePageFeatures= PageFactory.initElements(driver,MovingHomePageFeatures.class);
        movingHomePageFeatures.HomepageFeatures();
    }
}
