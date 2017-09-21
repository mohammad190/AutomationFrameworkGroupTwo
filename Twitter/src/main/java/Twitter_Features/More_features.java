package Twitter_Features;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class More_features extends CommonAPI {

    @FindBy(how = How.XPATH,using = ".//*[@id='doc']/div[1]/div/div[2]/div/div[2]/span")
    public static WebElement More;

    @FindBy(how = How.LINK_TEXT,using = "Arts & Culture")
    public static WebElement Click_Arts_culture_2;

    @FindBy(how = How.XPATH,using = ".//div[@class='dropdown-menu StreamsCategoryBar-dropdownMenu']")
    public static WebElement dropdown;

    @FindBy(how = How.LINK_TEXT,using = "Government & Politics")
    public static WebElement Click_Goverment_politics_3;

    @FindBy(how = How.LINK_TEXT,using = "Gaming")
    public static WebElement Click_Gaming_4;

    @FindBy(how = How.LINK_TEXT,using = "Nonprofits")
    public static WebElement Click_Nonprofit_5;

    @FindBy(how = How.LINK_TEXT,using = "Fun")
    public static WebElement Click_fun_6;

    @FindBy(how = How.LINK_TEXT,using = "Science")
    public static WebElement Click_Science_7;

    @FindBy(how = How.LINK_TEXT,using = "Technology")
    public static WebElement Click_Technology_8;

    public static void More_option_features()throws InterruptedException{
        More.click();
        //driver.navigate().forward();
        Thread.sleep(3000);

        dropdown.click();

//
//        Select artsCulture = new Select(Click_Arts_culture_2);
//        Select goverment_Politics = new Select(Click_Goverment_politics_3);
//        Select Gaming = new Select(Click_Gaming_4);
//        Select NonProfit = new Select(Click_Nonprofit_5);
//        Select Fun = new Select(Click_fun_6);
//        Select Science = new Select(Click_Science_7);
//        Select Technology = new Select(Click_Technology_8);


        Click_Arts_culture_2.click();
       //driver.navigate().back();
        Thread.sleep(3000);

        Click_Goverment_politics_3.click();
        driver.navigate().back();
        Thread.sleep(3000);

        Click_Gaming_4.click();
        //driver.navigate().back();
        Thread.sleep(3000);

        Click_Nonprofit_5.click();
        //driver.navigate().back();
        Thread.sleep(3000);

        Click_fun_6.click();
        //driver.navigate().back();
        Thread.sleep(3000);

        Click_Science_7.click();
        //driver.navigate().back();
        Thread.sleep(3000);

        Click_Technology_8.click();
        //driver.navigate().back();
        Thread.sleep(3000);

    }
}
