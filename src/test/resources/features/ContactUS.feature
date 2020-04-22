
Feature: Fill Contact US
  Scenario: Fill all information for contact to NiceInContact.
    Given I go to "ContactUS" page
    And I fill out the Sales Inquiry form with the following information:
      | field              | text                             |
      | FirstName          | Automation                       |
      | LastName           | Guy                              |
      | JobTitle           | Tester                           |
      | Company            | NiceInContact                    |
      | Business Phone     | 44249355                         |
      | Email Address      | test@niceincontact.com           |
      | Country            | Bolivia, Plurinational State of  |
      | ContactDepartment  | Sales                            |
      | Message            | This is a test by automation     |
    When I click on submit button
#    Then I validate the request was sent