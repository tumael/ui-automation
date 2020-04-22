package org.framework.cucumber.steps.ui;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.framework.pages.ContactUSPage;
import org.framework.pages.HomePage;

import java.util.List;
import java.util.Map;

public class ContactSteps {
    private ContactUSPage contactUSPage;
    private HomePage homePage;

    /**
     * Select Board by title.
     *
     * @param pageName input String.
     */
    @Given("I go to {string} page")
    public void iGoToPage(final String pageName) {
        homePage = new HomePage();

        switch (pageName) {
            case "ContactUS":
                homePage.clickOnContactUS();
                break;
            default:
                //ToDo: Add the logger file
                break;
        }
    }

    @And("I fill out the Sales Inquiry form with the following information:")
    public void iFillOutTheSalesInquiryFormWithTheFollowingInformation(DataTable dataTable) {
        contactUSPage = new ContactUSPage();

        List<Map<String, String>> dataTableList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> map : dataTableList) {
            contactUSPage.fillTextOn(map.get("field"), map.get("text"));
        }
    }

    @When("I click on submit button")
    public void iClickOnButton() {
        contactUSPage.clinkOnSubmit();
    }
}
