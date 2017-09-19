package BH;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Photography extends CommonAPI {
    @FindBy(how = How.XPATH, using = "html/body/div[1]/div[1]/header/section[3]/div[1]/ul/li[1]/a/span")
    WebElement bPhotography;

    public void photographypage() {
        bPhotography.click();

    }

    @FindBy(how = How.XPATH, using = "id(\"cat989\")/a[1]/span[1]")
    WebElement Digital_Cameras;

    public void DigitalCameras() {
        Digital_Cameras.click();

    }

    @FindBy(how = How.LINK_TEXT, using = "Lenses")
    WebElement Lenses;

    public void Lenses() {
        Lenses.click();
    }

    @FindBy(how = How.CSS, using = "#Drones   Aerial Imaging")
    WebElement Drones_Aerial_Imaging;

    public void Drones_Aerial_Imaging() {
        Drones_Aerial_Imaging.click();

    }

    @FindBy(how = How.CSS, using = "#Memory Cards Accessories")
    WebElement Memory_Cards;

    public void  Memory_Cards_Accessories () {
        Memory_Cards.click();
    }
}