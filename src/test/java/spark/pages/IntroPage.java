package spark.pages;

import core.SystemPropertiesConfiguration;
import org.openqa.selenium.*;
import io.appium.java_client.TouchAction;

/**
 * Created by pchien on 10/20/15.
 */

public class IntroPage extends AbstractPage {
    public void click_skip_intro(){
        try {
            if(SystemPropertiesConfiguration.getDriver().findElement(By.id(idSkipButton)) != null)
                SystemPropertiesConfiguration.getDriver().findElement(By.id(idSkipButton)).click();
        } catch (NoSuchElementException e) {
                System.out.print("This is not the first time the user signs in");
        }
    }

    public void view_intro_screen(String screen) throws InterruptedException {
        //Sleep 2 seconds to ignore the Welcome page
        Thread.sleep(2000);

        int n;
        TouchAction touchAction = new TouchAction(SystemPropertiesConfiguration.getDriver());
        if(screen.equals("screen 1"))
            n = 0;
        else if (screen.equals("screen 2"))
            n = 2;
        else
            n = 3;
        for(int i = 1; i<=n; i++) {
            touchAction.press(650, 820);
            touchAction.waitAction(500);
            touchAction.moveTo(130, 820);
            touchAction.release();
            touchAction.perform();
        }
    }

    @Override
    protected String getLoadedLocator() {
        return "//*/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[@resource-id='com.axonvibe.spark.dev:id/pager']";
    }

    String idSkipButton = "com.axonvibe.spark.dev:id/btn_skip";
}