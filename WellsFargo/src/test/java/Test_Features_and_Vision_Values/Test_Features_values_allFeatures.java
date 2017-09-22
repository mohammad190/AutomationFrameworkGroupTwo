package Test_Features_and_Vision_Values;

import Vision_Values_Wellfergo.Features_Vision_values;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Features_values_allFeatures extends CommonAPI{

    @Test
    public void Features_vision()throws InterruptedException{
        Features_Vision_values FVS  = PageFactory.initElements(driver,Features_Vision_values.class);
        FVS.Features_vision();
    }


}
