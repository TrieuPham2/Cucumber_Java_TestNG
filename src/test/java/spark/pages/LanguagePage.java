package spark.pages;

import core.SystemPropertiesConfiguration;
import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebElement;

/**
 * Created by pchien on 10/21/15.
 */

public class LanguagePage extends AbstractPage {
    public void change_language(String language){
        if(language.equals("Vietnamese")){
            WebElement btnVietnamese = SystemPropertiesConfiguration.getDriver().findElement(By.id(idVietnameseButton));
            btnVietnamese.click();
        }
        else {
            WebElement btnEnglish = SystemPropertiesConfiguration.getDriver().findElement(By.id(idEnglishButton));
            btnEnglish.click();
        }

        WebElement btnBack = SystemPropertiesConfiguration.getDriver().findElement(By.id(idBackbutton));
        btnBack.click();

        WebElement btnYes = SystemPropertiesConfiguration.getDriver().findElement(By.id(idYesButton));
        btnYes.click();
    }

    @Override
    protected String getLoadedLocator() {
        return "//*/android.widget.RadioGroup[1]/android.widget.RadioButton[@resource-id='com.axonvibe.spark.dev:id/radio_english']";
    }

    String idNoButton = "com.axonvibe.spark.dev:id/dialogButtonNO";
    String idYesButton = "com.axonvibe.spark.dev:id/dialogButtonYES";
    String idBackbutton = "com.axonvibe.spark.dev:id/imageview_back";
    String idEnglishButton = "com.axonvibe.spark.dev:id/radio_english";
    String idVietnameseButton = "com.axonvibe.spark.dev:id/radio_vietnamese";
}