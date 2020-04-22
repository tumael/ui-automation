package org.framework.pages;

import org.framework.core.ui.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUSPage extends AbstractPage {
    @FindBy(id = "FirstName")
    private WebElement firstNameInput;

    @FindBy(id = "LastName")
    private WebElement lastNameInput;

    @FindBy(id = "Title")
    private WebElement jobTitleInput;

    @FindBy(id = "Company")
    private WebElement companyInput;

    @FindBy(id = "Email")
    private WebElement emailInput;

    @FindBy(id = "Phone")
    private WebElement phoneInput;

    @FindBy(id = "Country")
    private WebElement countrySelect;

    @FindBy(id = "Division_Department__c")
    private WebElement contactDepartmentSelect;

    @FindBy(id = "comment_capture")
    private WebElement commentTextArea;

    @FindBy(css = "button.mktoButton")
//    @FindBy(css = "span.mktoButtonWrap")
    private WebElement submitButton;

    /**
     * This method search a team using the header.
     *
     * @param field Input.
     * @param text refers to text.
     */
    public void fillTextOn(String field, String text) {
        switch (field) {
            case "FirstName":
                action.setValue(firstNameInput, text);
                break;
            case "LastName":
                action.setValue(lastNameInput, text);
                break;
            case "JobTitle":
                action.setValue(jobTitleInput, text);
                break;
            case "Company":
                action.setValue(companyInput, text);
                break;
            case "Business Phone":
                action.setValue(phoneInput, text);
                break;
            case "Email Address":
                action.setValue(emailInput, text);
                break;
            case "Country":
                action.selectOption(countrySelect, text);
                break;
            case "ContactDepartment":
                action.selectOption(contactDepartmentSelect, text);
                break;
            case "Message":
                action.setValue(commentTextArea, text);
                break;
        }
    }

    /**
     * Method for click on Submit button.
     *
     * @return ContactUS PO.
     */
    public ContactUSPage clinkOnSubmit() {
        action.scrollToElement(submitButton);
        action.click(submitButton);

        return this;
    }
}
