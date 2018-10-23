package common;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutomationActions extends DriverFactory {

	/**
	 * Find element
	 * 
	 * @param control
	 *            By
	 * @return WebElement
	 */
	public WebElement findElement(By control) {
		return getDriver().findElement(control);
	}
	public List<WebElement> findElements(By control) {
		return getDriver().findElements(control);
	}

	public WebElement findElement(Element control, String... strValue) {
		String valueAttribute;
		if (control.getDynamic()) {
			valueAttribute = String.format(control.getValue(), strValue);
		} else {
			valueAttribute = control.getValue();
		}

		if (control.getType() == "id") {
			return findElement(By.id(valueAttribute));
		} else if (control.getType() == "name") {
			return findElement(By.name(valueAttribute));
		} else if (control.getType() == "xpath") {
			return findElement(By.xpath(valueAttribute));
		} else if (control.getType() == "className") {
			return findElement(By.className(valueAttribute));
		} else if (control.getType() == "cssSelector") {
			return findElement(By.cssSelector(valueAttribute));
		} else if (control.getType() == "linkText") {
			return findElement(By.linkText(valueAttribute));
		} else if (control.getType() == "tagName") {
			return findElement(By.tagName(valueAttribute));
		} else {
			return findElement(By.partialLinkText(valueAttribute));
		}
	}

	
	public List<WebElement> findElements(Element control, String... strValue) {
		String valueAttribute;
		if (control.getDynamic()) {
			valueAttribute = String.format(control.getValue(), strValue);
		} else {
			valueAttribute = control.getValue();
		}

		if (control.getType() == "id") {
			return findElements(By.id(valueAttribute));
		} else if (control.getType() == "name") {
			return findElements(By.name(valueAttribute));
		} else if (control.getType() == "xpath") {
			return findElements(By.xpath(valueAttribute));
		} else if (control.getType() == "className") {
			return findElements(By.className(valueAttribute));
		} else if (control.getType() == "cssSelector") {
			return findElements(By.cssSelector(valueAttribute));
		} else if (control.getType() == "linkText") {
			return findElements(By.linkText(valueAttribute));
		} else if (control.getType() == "tagName") {
			return findElements(By.tagName(valueAttribute));
		} else {
			return findElements(By.partialLinkText(valueAttribute));
		}
	}
	
	
	/**
	 * Type text into control
	 * 
	 * @param strText
	 *            String
	 * @param control
	 *            Element
	 * @param strValue
	 *            String
	 */
	public void type(Element control, String strText, String... strValue) {
		WebElement element = findElement(control, strValue);
		element.clear();
		element.sendKeys(strText);
	}

	/**
	 * Click on control
	 * 
	 * @param control
	 *            Element
	 * @param strValue
	 *            String
	 */

	public void click(Element control, String... strValue) {
		waitForControl(control, Variable.objectWait, strValue);
		findElement(control, strValue).click();

	}

	/**
	 * Verify control displayed
	 * 
	 * @param control
	 *            Element
	 * @param strValue
	 *            String
	 * @return true/false
	 */
	public boolean doesControlExist(Element control, String... strValue) {
		try {
			findElement(control, strValue);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/**
	 * Verify control presence
	 * 
	 * @param control
	 *            Element
	 * @param strValue
	 *            String
	 * @return true/false
	 */
	public void waitControlPresence(String strXpathAttribulte) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(strXpathAttribulte)));

	}

	/**
	 * Verify control exist
	 *
	 * @param control
	 *            Element
	 * @param strValue
	 *            String
	 * @return true/false
	 */
	public void checkControlExist(Element control, String... strValue) {
		Boolean check = false;
		sleep(1);
		waitForControl(control, Variable.objectWait, strValue);
		check = findElement(control, strValue).isDisplayed();
		AbstractTest.verifyTrue(check);

	}

	/**
	 * Verify control does not exist
	 *
	 * @param control
	 *            Element
	 * @param strValue
	 *            String
	 * @return true/false
	 */
	public void checkControlNotExist(Element control, String... strValue) {
		Boolean check;
		try {
			check = findElement(control, strValue).isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
			check = false;
		}
		AbstractTest.verifyFalse(check);
	}

	/**
	 * Verify control enable
	 *
	 * @param control
	 *            Element
	 * @param strValue
	 *            String
	 * @return true/false
	 */
	public boolean isControlEnable(Element control, String... strValue) {
		boolean isEnable = false;
		try {
			isEnable = findElement(control).isDisplayed();
			return isEnable;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/**
	 * Select item from the dropdown list that contains text
	 * 
	 * @param control
	 *            Element
	 * @param strValue
	 *            String
	 * @param ValueToSelect
	 *            String
	 */

	public void select(Element Control, String ValueToSelect, String... strValue) {
		Select select = new Select(findElement(Control, strValue));
		select.selectByVisibleText(ValueToSelect);
	}

	/**
	 * Wait for control
	 * 
	 * @param control
	 *            Element
	 * @param timeWait
	 *            int
	 * @param strValue
	 *            String
	 */
	public void waitForControl(Element control, int timeWait, String... strValue) {
		WebDriverWait wait = new WebDriverWait(getDriver(), timeWait);
		sleep(1);
		wait.until(ExpectedConditions.elementToBeClickable(findElement(control, strValue)));
	}

	/**
	 * Sleep
	 * 
	 * @param seconds
	 *            int
	 */
	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


public void checkAlert(String strMessenger) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 5);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = getDriver().switchTo().alert();
		String alertText = alert.getText().trim();
		AbstractTest.verifyEquals(alertText, strMessenger);

	}

}
