package common;

import org.openqa.selenium.WebDriver;
/**
 * Created by pTrieu on 2018/10/18.
 */
public class DriverFactory {
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	// call this method to get the driver object and launch the browser
	public WebDriver getDriver() {
		return driver.get();
	}

	// call this method to get the driver object and launch the browser
	public void setDriver(WebDriver webdriver) {
		driver.set(webdriver);
	}

	// Quits the driver and closes the browser
	public void removeDriver() {
		getDriver().quit();
		// driver.set(null);
	}

	public DriverFactory() {
	}
}