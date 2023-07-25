@regression
Feature: home office visa check Test
  As user I want to check  home office  visa test

  @smoke
  Scenario: As a User verify  an Australian Coming To UK For Tourism
    Given I am on gov.uk  page
    When I click  Start new page button
    And I select nationality "Australia"
    And I Click on Continue button
    And I Select reason for travel
    And  I Click on Continue button
    Then  I should  verify message "You will not need a visa to come to the UK"

  @sanity
  Scenario: As a User  a Chilean Coming To Th eUK For Work And Plans On Staying For Longer Than SixMonths()
    Given I am on gov.uk  page
    When I click  Start new page button
    And  I   Select a Nationality "Chile"
    And  I Click on Continue button
    And I select  a reason Work, academic visit or business
    And   I Click on Continue button
    And I select longer than 6 months
    And   I Click on Continue button
    And  I select  have planning to work for Health and care professional
    And   I Click on Continue button
    Then  I verify the message "You need a visa to work in health and care"

  @sanity
 Scenario : As a user a Columbian National Coming To The UK To Join APartner For A Long Stay They Do Have An Article10Or20Card()
    Given I am on gov.uk  page
    When  I  Select a Nationality "Colombia"
    And   I Click on Continue button
    And  I   Select reason Join partner or family for a long stay
    And   I Click on Continue button
    And I Select state My partner of family member have uk immigration status yes
    Then   I Click on Continue button



































#@smoke
#  Scenario: User should navigate to login page successfully
#    Given  I am on homepage
#    When I click on login link
#    Then  I shoid navigate to login page successfully
#
#  Scenario: User should login successfully with valid credentials
#    Given I am on homepage
#    When I click on login link
#    And I enter email "primefivetest@yahoo.com"
#    And I enter password "abc123"
#    And I click on login button
#    Then I should login successfully
#
#  Scenario Outline: verify the error message with invalid credentials
#    Given I am on homepage
#    When  I click on login link
#    And I enter email "<email>"
#    And  I enter password "<password>"
#    And  I click on login button
#    Then  I shoud see the error message "<error message>"
#    Examples:
#      | email              | password | error message                                                                               |
#      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
#      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
#      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |