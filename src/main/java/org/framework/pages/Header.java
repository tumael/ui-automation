package org.framework.pages;

import org.framework.core.ui.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractPage {
    @FindBy(css = "a.header__utility__contact")
    private WebElement contactUS;

    /**
     * Method for go to the Contact US.
     *
     * @return the PO of ContactUS.
     */
    public ContactUSPage clickOnContactUS() {
        action.click(contactUS);

        return new ContactUSPage();
    }
}
