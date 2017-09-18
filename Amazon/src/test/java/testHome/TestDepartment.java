package testHome;

import base.CommonAPI;
import home.Department;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestDepartment extends CommonAPI {

    @Test
    public void testGoToFireStick(){
        Department amazonHome = PageFactory.initElements(driver, Department.class);
        amazonHome.goToFireTvStick();
    }

    @Test
    public void testSignInFromAccNLists(){
        Department amazonHome = PageFactory.initElements(driver, Department.class);
        amazonHome.signInFromAccNLists();
    }

    @Test
    public void testSearchFor(){
        Department amazonHome = PageFactory.initElements(driver, Department.class);
        amazonHome.searchFor("Java Books");
    }

    @Test
    public void testClickOnShoppingCart(){
        Department amazonHome = PageFactory.initElements(driver, Department.class);
        amazonHome.clickOnShoppingCart();
    }


    @Test
    public void testLogInFromAccNLists() {
        Department amazonHome = PageFactory.initElements(driver, Department.class);
        amazonHome.logInFromAccNLists("sayem991@gmail.com", "Bangla991$");
    }

}
