Feature: Search feature in Magneto shopping

  @smoke
  Scenario: Positive scenario
    Given user should be in home page
    And enter the product in search tab as <"tshirt">
    When user should be in product page
    When scroll down the product page
