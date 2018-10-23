package common;

import org.testng.*;

public class AbstractTest extends BrowserManagement {
	/**
	 * Verify True
	 * 
	 * @param expected
	 *            true/false
	 */
	public static boolean verifyTrue(boolean condition, boolean halt) {
		boolean pass = true;
		if (halt == false) {
			try {
				Assert.assertTrue(condition);
			} catch (Throwable e) {
				pass = false;
			}
		} else {
			Assert.assertTrue(condition);
		}
		return pass;
	}

	public static boolean verifyTrue(boolean condition) {
		return verifyTrue(condition, false);
	}

	/**
	 * Verify Fail
	 * 
	 * @param expected
	 *            true/false
	 */
	public static boolean verifyFalse(boolean condition, boolean halt) {
		boolean pass = true;
		if (halt == false) {
			try {
				Assert.assertFalse(condition);
			} catch (Throwable e) {
				pass = false;
			}
		} else {
			Assert.assertFalse(condition);
		}
		return pass;
	}

	public static boolean verifyFalse(boolean condition) {
		return verifyFalse(condition, false);
	}

	/**
	 * Verify Equals
	 * 
	 * @param actual
	 *            true/false
	 * 
	 * @param expected
	 *            true/false
	 * 
	 * @param halt
	 *            true/false
	 */
	public static boolean verifyEquals(Object actual, Object expected, boolean halt) {
		boolean pass = true;
		if (halt == false) {
			try {
				Assert.assertEquals(actual, expected);
			} catch (Throwable e) {
				Assert.assertEquals(actual, expected);
				pass = false;
			}
		} else {
			Assert.assertEquals(actual, expected);
		}
		return pass;
	}

	public static boolean verifyEquals(Object actual, Object expected) {
		return verifyEquals(actual, expected, false);
	}

	/**
	 * Verify NotEquals
	 * 
	 * @param actual
	 *            true/false
	 * 
	 * @param expected
	 *            true/false
	 * 
	 * @param halt
	 *            true/false
	 */
	public static boolean verifyNotEquals(Object actual, Object expected, boolean halt) {
		boolean pass = false;
		if (halt == false) {
			try {
				Assert.assertNotEquals(actual, expected);
			} catch (Throwable e) {
				Assert.assertNotEquals(actual, expected);
				pass = false;
			}
		} else {
			Assert.assertNotEquals(actual, expected);
		}
		return pass;
	}

	public static boolean verifyNotEquals(Object actual, Object expected) {
		return verifyNotEquals(actual, expected, false);
	}

	/**
	 * Verify Contains
	 * 
	 * @param actual
	 *            true/false
	 * 
	 * @param expected
	 *            true/false
	 * 
	 * @param halt
	 *            true/false
	 */

	public static boolean verifyContains(String actual, String expected, boolean halt) {
		boolean pass = true;
		if (halt == false) {
			try {
				Assert.assertTrue(actual.contains(expected));
			} catch (Throwable e) {
					pass = false;
			}
		} else {
			Assert.assertTrue(actual.contains(expected));
		}
		return pass;
	}

	public static boolean verifyContains(String actual, String expected) {
		return verifyContains(actual, expected, false);
	}
}
