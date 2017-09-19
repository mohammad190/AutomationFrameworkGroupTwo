package BHTest;

import BH.Photography;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BHTest extends CommonAPI {
    @Test
    public void photography_page() throws InterruptedException {
        Photography bhphotography = PageFactory.initElements(driver, Photography.class);
        bhphotography.photographypage();

    }

    @Test
    public void Digital_Cameras() throws InterruptedException {
        Photography dCameras = PageFactory.initElements(driver, Photography.class);
        dCameras.DigitalCameras();
    }

    @Test
    public void C_Lances() throws InterruptedException {
        Photography lanses = PageFactory.initElements(driver, Photography.class);
        lanses.Lenses();
    }

    @Test
    public void Drones() throws InterruptedException {
        Photography drones = PageFactory.initElements(driver, Photography.class);
        drones.Drones_Aerial_Imaging();
    }

    @Test
    public void CMemoryCards() throws InterruptedException {
        Photography cmemorycards = PageFactory.initElements(driver, Photography.class);
        cmemorycards.Memory_Cards_Accessories();
    }


}