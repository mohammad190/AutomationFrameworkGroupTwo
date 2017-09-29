package Test_Check_Box;


import Check_Box.Atm_Loaction_check_Box;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test_CHeckBox extends CommonAPI {

    @Test
    public void Check_Box_example() throws InterruptedException, IOException {
        Atm_Loaction_check_Box Atm = PageFactory.initElements(driver, Atm_Loaction_check_Box.class);
        Atm.Check_Box_Option();
    }
}
