package spark.pages;

import core.SystemPropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by pchien on 10/7/15.
 */

public class OptionsPage extends AbstractPage {
    public void sign_out() throws InterruptedException{
        WebElement btnSignOut = SystemPropertiesConfiguration.getDriver().findElement(By.xpath(xpathSignOutButton));
        btnSignOut.click();
        WebElement btnYes = SystemPropertiesConfiguration.getDriver().findElement(By.id(idYesButton));
        btnYes.click();
    }

    public void go_to_language_screen() throws InterruptedException{
        WebElement btnLanguage = SystemPropertiesConfiguration.getDriver().findElement(By.id(idLanguageButton));
        btnLanguage.click();
    }

    public void click_invite() throws InterruptedException{
        WebElement btnInvite = SystemPropertiesConfiguration.getDriver().findElement(By.id(idInviteButton));
        btnInvite.click();
    }

    public void go_to_preferences_screen() throws InterruptedException{
        WebElement btnPreferences = SystemPropertiesConfiguration.getDriver().findElement(By.id(idPreferencesButton));
        btnPreferences.click();
    }

    public void go_to_app_info_screen() throws InterruptedException{
        WebElement btnAppInfo = SystemPropertiesConfiguration.getDriver().findElement(By.id(idAppInfoButton));
        btnAppInfo.click();
    }

    public void verify_language(String language){
        final boolean isPresent = SystemPropertiesConfiguration.getDriver().findElements(By.xpath("//*/android.widget.RelativeLayout[3]/android.widget.TextView[@text='"+language+"']")).size() > 0;
        if(isPresent)
            assert true;
        else
            assert false;
    }

    @Override
    protected String getLoadedLocator() {
        return "//*/android.widget.LinearLayout[2]/android.widget.RelativeLayout[@resource-id='com.axonvibe.spark.dev:id/button_signout']";
    }

    String idAppInfoButton = "com.axonvibe.spark.dev:id/app_info";
    String idPreferencesButton = "com.axonvibe.spark.dev:id/preferences";
    String idInviteButton = "com.axonvibe.spark.dev:id/button_invite";
    String idLanguageButton = "com.axonvibe.spark.dev:id/languague_nav";
    String idYesButton = "com.axonvibe.spark.dev:id/dialogButtonYES";
    String xpathSignOutButton = "//*//android.widget.RelativeLayout[5]";
}
