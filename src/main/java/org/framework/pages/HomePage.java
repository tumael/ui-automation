package org.framework.pages;

public class HomePage {
    private Header header;

    /**
     * Method for go to the Contact US.
     *
     * @return the PO of ContactUS.
     */
    public ContactUSPage clickOnContactUS() {
        return new Header().clickOnContactUS();
    }
}
