package wikiPedia;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WikiHome extends CommonAPI {

    @FindBy(how = How.XPATH , using = ".//*[@id='js-link-box-en']/strong")
    public static WebElement engBtn;
    @FindBy(how = How.XPATH , using = ".//*[@id='js-link-box-ja']/strong")
    public static WebElement jpnBtn;
    @FindBy(how = How.XPATH , using = ".//*[@id='js-link-box-ru']/strong")
    public static WebElement rusBtn;
    @FindBy(how = How.XPATH , using = ".//*[@id='js-link-box-it']/strong")
    public static WebElement itlBtn;
    @FindBy(how = How.XPATH , using = ".//*[@id='js-link-box-pt']/strong")
    public static WebElement porBtn;
    @FindBy(how = How.XPATH , using = ".//*[@id='js-link-box-es']/strong")
    public static WebElement espBtn;
    @FindBy(how = How.XPATH , using = ".//*[@id='js-link-box-de']/strong")
    public static WebElement grmnBtn;
    @FindBy(how = How.XPATH , using = ".//*[@id='js-link-box-fr']/strong")
    public static WebElement frnchBtn;
    @FindBy(how = How.XPATH , using = ".//*[@id='js-link-box-zh']/strong")
    public static WebElement chnBtn;
    @FindBy(how = How.XPATH , using = ".//*[@id='js-link-box-pl']/strong")
    public static WebElement plndBtn;
    @FindBy(how = How.ID , using = "js-lang-list-button")
    public static WebElement langLstBtn;


    public void clickEng(){ 
        engBtn.click();
            }
    public void clickJpn(){
        jpnBtn.click();
                  }

    public void clickRus(){
        rusBtn.click();
    }

    public void clickItaly(){
        itlBtn.click();
    }

    public void clickPor(){
        porBtn.click();
    }

    public void clickSpain(){
        espBtn.click();
    }

    public void clickGerman(){
       grmnBtn.click();
    }

    public void clickFrench(){
        frnchBtn.click();
    }

    public void clickChins(){
        chnBtn.click();
    }
    public void clickPolish(){
        plndBtn.click();
    }
    public void clickLanguageList(){
        langLstBtn.click();
    }

}


