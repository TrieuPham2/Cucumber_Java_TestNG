package spark.pages;

import core.SystemPropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by pchien on 10/5/15.
 */

public class LoginPage extends AbstractPage {

    //User clicks Sign-in on Sign-in screen
    public void click_sign_in() throws InterruptedException {
        WebElement btnSignin = SystemPropertiesConfiguration.getDriver().findElement(By.id(idSignInButton));
        btnSignin.click();
        Thread.sleep(2000);
    }

    public void login(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
        SystemPropertiesConfiguration.getDriver().tap(1,345,250,2);

        WebElement txtUsername = SystemPropertiesConfiguration.getDriver().findElement(By.xpath(xpathUsername));
        txtUsername.sendKeys(username);

        WebElement txtPassword = SystemPropertiesConfiguration.getDriver().findElement(By.xpath(xpathPassword));
        txtPassword.sendKeys(password);
    }

    //User clicks Login on Facebook overlay
    public void click_log_in() throws InterruptedException {
        WebElement btnLogin = SystemPropertiesConfiguration.getDriver().findElement(By.xpath(xpathLoginButton));
        btnLogin.click();
        Thread.sleep(2000);
    }

    public void authorize_facebook() throws InterruptedException {
        WebElement btnOK = SystemPropertiesConfiguration.getDriver().findElement(By.xpath(xpathOkButton));
        btnOK.click();
    }

    public void cancel_authorize() throws InterruptedException {
        WebElement btnCancel = SystemPropertiesConfiguration.getDriver().findElement(By.xpath(xpathCancelButton));
        btnCancel.click();
    }

    public void verify_wrong_user_error(){
        boolean isErrorPresent = SystemPropertiesConfiguration.getDriver().findElements(By.xpath("//*/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[@content-desc='"+wrongUserVnese+"']")).size() > 0;
        boolean isErrorPresent1 = SystemPropertiesConfiguration.getDriver().findElements(By.xpath("//*/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[@content-desc='"+wrongUserEng+"']")).size() > 0;
        if(isErrorPresent|isErrorPresent1)
            assert true;
        else
            assert false;
    }

    @Override
    protected String getLoadedLocator()
    {
        return "//*/android.widget.LinearLayout[1]/android.widget.RelativeLayout[@resource-id='com.axonvibe.spark.dev:id/layout_fb_connection']";
    }

    String xpathOkButton = "//*/android.view.View[8]/android.widget.Button[1]";
    String xpathCancelButton = "//*/android.view.View[7]/android.widget.Button[1]";
    String xpathLoginButton = "//*/android.view.View[3]/android.widget.Button[1]";
    String xpathPassword = "//*/android.widget.EditText[2]";
    String xpathUsername = "//*/android.widget.EditText[1]";
    String idSignInButton = "com.axonvibe.spark.dev:id/layout_fb_connection";
    String wrongUserVnese = "Chúng tôi không nhận dạng được địa chỉ email hoặc số điện thoại của bạn.";
    String wrongUserEng = "We didn't recognise your email address or phone number.";
    String wrongPasswordVnese = "Mật khẩu của bạn không chính xác.";
    String wrongPasswordEng = "Your password was incorrect.";
}