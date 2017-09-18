package wikiPedia;

import base.CommonAPI;
import javafx.beans.value.WeakChangeListener;

import org.apache.bcel.generic.Visitor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class WikiSearchOption extends CommonAPI {

    @FindBy(how = How.ID , using = "searchInput")
    public static WebElement searchBox;

    @FindBy(how = How.ID , using = "searchLanguage")
    public static WebElement searchLangBtn;

    @FindBy(how = How.XPATH , using = ".//*[@id='search-form']/fieldset/button")
    public static WebElement searchBtn;

        public void searchFor(String keyWord){
            searchBox.sendKeys(keyWord);
            Select select = new Select(searchLangBtn) ;
            select.selectByValue("en");
            searchBtn.click();
        }

 }
