package testWikipedia;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import wikiPedia.WikiHome;

public class TestWikiHome extends CommonAPI {

    @Test
    public void testEng(){
        WikiHome wikiHome = PageFactory.initElements(driver,WikiHome.class);
        wikiHome.clickEng();
    }
    @Test
    public void testJpn(){
        WikiHome wikiHome = PageFactory.initElements(driver,WikiHome.class);
        wikiHome.clickJpn();
    }
    @Test
    public void testRus(){
        WikiHome wikiHome = PageFactory.initElements(driver,WikiHome.class);
        wikiHome.clickRus();
    }
    @Test
    public void testIta(){
        WikiHome wikiHome = PageFactory.initElements(driver,WikiHome.class);
        wikiHome.clickItaly();
    }
    @Test
    public void testPor(){
        WikiHome wikiHome = PageFactory.initElements(driver,WikiHome.class);
        wikiHome.clickPor();
    }
    @Test
    public void testEsp(){
        WikiHome wikiHome = PageFactory.initElements(driver,WikiHome.class);
        wikiHome.clickSpain();
    }
    @Test
    public void testGrmn(){
        WikiHome wikiHome = PageFactory.initElements(driver,WikiHome.class);
        wikiHome.clickGerman();
    }
    @Test
    public void testFrnch(){
        WikiHome wikiHome = PageFactory.initElements(driver,WikiHome.class);
        wikiHome.clickFrench();
    }
    @Test
    public void testChn(){
        WikiHome wikiHome = PageFactory.initElements(driver,WikiHome.class);
        wikiHome.clickChins();
    }
    @Test
    public void testPol(){
        WikiHome wikiHome = PageFactory.initElements(driver,WikiHome.class);
        wikiHome.clickPolish();
    }
    @Test
    public void testLangList(){
        WikiHome wikiHome = PageFactory.initElements(driver,WikiHome.class);
        wikiHome.clickLanguageList();
    }



}
