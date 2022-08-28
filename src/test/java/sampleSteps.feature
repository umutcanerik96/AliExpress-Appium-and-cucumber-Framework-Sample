Feature: Search function verification

  Scenario: Add a product to the cart
    Given Login to the AliExpress App
    And Tap to the region button
    And Select the United States as the region
    And Tap to the continue button
    When Make a search for a product
    Then Results must be containing the searched letters