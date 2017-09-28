package Test_FAQ_s;

import Features_Frequently_Ask_question.FAQ_s;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test_frequently_ask_question_Features extends CommonAPI {

    @Test
    public void Features_FAQ_s() throws InterruptedException, IOException {
        FAQ_s faq_s = PageFactory.initElements(driver,FAQ_s.class);
        faq_s.Features_FAQ_s();
    }
}
