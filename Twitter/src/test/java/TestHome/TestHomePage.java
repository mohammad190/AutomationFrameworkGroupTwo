package TestHome;

import Twitter_Features.T_HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    @Test
    public void TwitterHomePage1() throws InterruptedException {
        T_HomePage page = PageFactory.initElements(driver, T_HomePage.class);
        page.HomePage1();
    }
    @Test
    public void TwitterHomePage2() throws InterruptedException {
        T_HomePage page = PageFactory.initElements(driver, T_HomePage.class);
        page.HomePage2();
    }
    @Test
    public void TwitterHomePage3() throws InterruptedException {
        T_HomePage page = PageFactory.initElements(driver, T_HomePage.class);
        page.HomePage3();
    }
    @Test
    public void TwitterHomePage4() throws InterruptedException {
        T_HomePage page = PageFactory.initElements(driver, T_HomePage.class);
        page.HomePage4();
    }
    @Test
    public void TwitterHomePage5() throws InterruptedException {
        T_HomePage page = PageFactory.initElements(driver, T_HomePage.class);
        page.HomePage5();
    }
    @Test
    public void TwitterHomePage6() throws InterruptedException {
        T_HomePage page = PageFactory.initElements(driver, T_HomePage.class);
        page.HomePage6();
    }
}
