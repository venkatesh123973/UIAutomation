Feature: This feature is to login to the orange hrm page

  Scenario Outline: Verify whether user can login to the Orange HRM application
    Given the user is login to the application
    When the user is entering the "<Username>" and "<Password>" in the fields
    Then user is clicking the submit button
    Then user should navigate to the Dashboard page
    Then user clicks on the Directory link
    And user navigated to the Directory page and click on the Job title drop down
    Then user clicks on the "<DropDown>" value from the Job title
    And user clicks on the "<Location>" value from the Location option
    Then user clicks on the search button


    Examples:
    |Username|Password|DropDown               |Location|
    |Admin   |admin123|Chief Executive Officer|Canadian Regional HQ|