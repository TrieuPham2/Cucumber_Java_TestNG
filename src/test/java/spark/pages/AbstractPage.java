package spark.pages;

import core.SystemPropertiesConfiguration;
import org.openqa.selenium.By;

/**
 * Created by pchien on 10/22/15.
 */

public abstract class AbstractPage {

	public boolean isDisplayed() {
		final String locator = getLoadedLocator();
		final boolean isPresent = SystemPropertiesConfiguration.getDriver().findElements(By.xpath(locator)).size() > 0;
		if (!isPresent) {
			System.out.print("Login page identifier " + locator + " was not found.\n");
		}
		return isPresent;
	}

	protected abstract String getLoadedLocator();
}