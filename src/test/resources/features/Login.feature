Feature: Get In Touch


  #Empty Fields
  @SmokeTest @RegressionTest
  Scenario: Data Driven Empty Fields
    Given I Launch Chrome Browser
    When A user is in the homepage "https://decemberlabs.com/"
    Then Click on Login
    And User leaves fields empty
    And close browser


  #Fill Fields Correctly
  @SmokeTest @RegressionTest
  Scenario Outline: Data Driven
    Given I Launch Chrome Browser
    When A user is in the homepage "https://decemberlabs.com/"
    And Click on Login
    And User fill the fields "<name>" and "<email>" and "<company>" and "<message>"
    Then Page Should send correctly
    And close browser

    Examples:
      |name|email|company|message|
      |Test|test@decemberlabs.com|Test|Test|





