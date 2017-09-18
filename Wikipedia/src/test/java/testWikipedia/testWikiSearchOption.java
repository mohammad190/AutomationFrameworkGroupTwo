package testWikipedia;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import wikiPedia.WikiSearchOption;

public class testWikiSearchOption extends CommonAPI {

    @Test
    public void searchOption() throws InterruptedException {
        WikiSearchOption wikiSearchOption = PageFactory.initElements(driver, WikiSearchOption.class);
        wikiSearchOption.searchFor("Java language");
        Thread.sleep(1000);
    }
}
