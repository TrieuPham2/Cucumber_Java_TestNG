package spark.pages;

import core.SystemPropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by pchien on 10/7/15.
 */

public class MainPage extends AbstractPage {
    public void click_menu() throws InterruptedException{
        WebElement mnuMenu = SystemPropertiesConfiguration.getDriver().findElement(By.id(idMenuButton));
        mnuMenu.click();
    }

    @Override
    protected String getLoadedLocator()
    {
        return "//*/android.widget.FrameLayout[1]/android.view.View[@content-desc='Google Map']";
    }

    String idMenuButton = "com.axonvibe.spark.dev:id/button_menu";
}
