package core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.remote.DesiredCapabilities;
import spark.utils.TestUtils;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by pchien on 10/5/15.
 */
public class SystemPropertiesConfiguration extends net.thucydides.core.webdriver.SystemPropertiesConfiguration{
    public static Properties env = null;
    public static AppiumDriver driver = null;

    public SystemPropertiesConfiguration(EnvironmentVariables environmentVariables) {
        super(environmentVariables);
    }

    public static void loadFile() throws IOException {
        if(SystemPropertiesConfiguration.env == null){
            env = new Properties();
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            env = TestUtils.readUserConfigs(classLoader.getResourceAsStream("config.properties"));
        }
    }
    public static AppiumDriver getDriver() {
        return driver;
    }

    public static void openDriver() {
        try {
            loadFile();
            /*System.out.println("deviceName: "+env.getProperty("axonactive.deviceName")+
                    "\n"+"platformVersion: "+ env.getProperty("axonactive.platformVersion")+"\n--Application info--"+
                    "\n"+"appPackage: "+ env.getProperty("axonactive.appPackage")+"\n"+
                    "appActivity: "+env.getProperty("axonactive.appActivity")
                    +"\n");*/
            driver = new AndroidDriver(new URL(SystemPropertiesConfiguration.getAppiumUrl()), SystemPropertiesConfiguration.getCapabilitiesAndroid());
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeDriver() {
        driver = null;
    }

    public static DesiredCapabilities getCapabilitiesAndroid() throws IOException, InterruptedException {
        //File classpathRoot = new File(System.getProperty("user.dir"));
        //File appDir = new File(classpathRoot, env.getProperty("axonactive.root"));
        //File app = new File(appDir, env.getProperty("axonactive.file"));
        //capabilities.setCapability("application", app.getAbsolutePath());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", env.getProperty("axonactive.deviceName"));
        capabilities.setCapability("platformVersion", env.getProperty("axonactive.platformVersion"));
        capabilities.setCapability("appPackage", env.getProperty("axonactive.appPackage"));
        capabilities.setCapability("appActivity", env.getProperty("axonactive.appActivity")) ;
        return capabilities;
    }

    public static String getAppiumUrl() {
        return String.valueOf(env.getProperty("axonactive.appiumServer"));
    }

}