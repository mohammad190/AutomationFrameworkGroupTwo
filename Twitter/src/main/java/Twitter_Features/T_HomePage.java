package Twitter_Features;


import WellsFargo_BankFeatures.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class T_HomePage extends CommonAPI {

    @FindBy(how = How.LINK_TEXT,using = "Sports")
    public static WebElement Sports;

    @FindBy(how = How.LINK_TEXT,using = "News")
    public static WebElement News;

    @FindBy(how = How.LINK_TEXT,using = "Music")
    public static WebElement Music;

    @FindBy(how = How.LINK_TEXT,using = "Entertainment")
    public static WebElement Entertainment;

    @FindBy(how = How.PARTIAL_LINK_TEXT,using = "Lifestyle")
    public static WebElement Lifestyle;

    @FindBy(how = How.CSS,using = ".StreamsCategoryBar-itemName")
    public static WebElement More;

    public void HomePage1() throws InterruptedException {
        Sports.click();
        Thread.sleep(3000);
    }
    public void HomePage2() throws InterruptedException {
        News.click();
        Thread.sleep(3000);

    }
    public void HomePage3() throws InterruptedException {
        Music.click();
        Thread.sleep(3000);
    }
    public void HomePage4() throws InterruptedException {
        Entertainment.click();
        Thread.sleep(3000);
    }
    public void HomePage5() throws InterruptedException {
        Lifestyle.click();
        Thread.sleep(3000);
    }
    public void HomePage6() throws InterruptedException {
        More.click();
        Thread.sleep(3000);
    }
}
