package common;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dOne.pages.LoginPage;

public class BrowserManagement extends DriverFactory {

	/**
	 * Open browser
	 * 
	 * @return WebDriver
	 */
	public void openBrowser(String browser) {
		WebDriver webdriver = null;
			if (browser.equals("ie")) {
				System.setProperty("webdriver.ie.driver", Variable.ieDriverPath);
				DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
				caps.setCapability("ignoreZoomSetting", true);
				// Setting attribute nativeEvents to false enable click button
				// in IE
				caps.setCapability("nativeEvents", false);
				webdriver = new InternetExplorerDriver(caps);
			} else if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", Variable.chromeDriverPath);
				webdriver = new ChromeDriver();
			} else
				webdriver = new FirefoxDriver();
			webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			setDriver(webdriver);
			getDriver().manage().window().maximize();
	}

	/**
	 * Navigate to an URL
	 * 
	 * @param strUrl
	 *            String
	 * @param driver
	 *            WebDriver
	 */
	public void navigateURL(String strUrl) {
		getDriver().get(strUrl);
	}

	public LoginPage openLoginPage(String browser) {
		openBrowser(browser);
		getDriver().get(Variable.urlDOne);
		return new LoginPage();
	}

	/*
	 * Close Browser
	 * 
	 * @param driver WebDriver
	 */
	public void closeBrowser() {
		getDriver().quit();
		if (Variable.grid == "yes")
			setDriver(null);
	}

	/**
	 * Close Alert
	 * 
	 * @param driver
	 *            WebDriver
	 */
	public void closeAlert() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 2);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
	}

}
