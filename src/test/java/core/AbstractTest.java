package core;

import spark.pages.AbstractPage;

/**
 * Created by pchien on 10/22/15.
 */
public abstract class AbstractTest {
    protected void verifyDisplay(AbstractPage page, boolean halt)
    {
        if (!verifyTrue(page.isDisplayed())) {
            System.out.print("Expected page was not displayed");
        }
    }

    protected void verifyDisplay(AbstractPage page)
    {
        verifyDisplay(page, false);
    }

    protected boolean verifyTrue(boolean condition, boolean halt)
    {
        boolean pass = true;
        if (!halt) {
            try {
                assert condition;
            } catch (Throwable e) {
                pass = false;
            }
        } else {
            assert condition;
        }
        return pass;
    }

    protected boolean verifyTrue(boolean condition)
    {
        return verifyTrue(condition, false);
    }
}
