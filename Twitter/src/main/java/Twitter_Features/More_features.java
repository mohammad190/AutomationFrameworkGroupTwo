package Twitter_Features;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class More_features extends CommonAPI {

    @FindBy(how = How.XPATH,using = ".//*[@id='doc']/div[1]/div/div[2]/div/div[2]/span")
    public static WebElement More;

    @FindBy(how = How.XPATH,using = ".//span[@class='StreamsCategoryBar-moreIcon Icon Icon--caretDown']")
    public static WebElement dropdown;

//    @FindBy(how = How.XPATH,using = ".//span[@class='StreamsCategoryBar-moreIcon Icon Icon--caretDown']")
//    public static List<WebElement> dropDownOption;

    @FindBy(how = How.LINK_TEXT,using = "Arts & Culture")
    public static WebElement Click_Arts_culture_2;

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

    public void More_option_features()throws InterruptedException{
        More.click();
        Thread.sleep(3000);
        //Select sel = new Select(dropdown);
        dropdown.click();
        Click_Arts_culture_2.click();

        Thread.sleep(3000);
//
//        for(int i = 0; i<dropDownOption.size();i++){
//            dropDownOption.get(i).click();
//            Thread.sleep(3000);
//        }
    }

//    public void verifyoption()throws InterruptedException{
//        String actualURL=""
//    }
}
