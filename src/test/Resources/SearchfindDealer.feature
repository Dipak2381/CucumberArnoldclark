Feature:66
  Background: opreating system :window 7
               Browser version: chrome 55.0
  @Testraja
    Scenario: user can find nearest car dealer
      Given I am  on already homepage
      When I click on find a dealer
      Then I See find a dealer page load sucessfully
      And I enter location or postcode
      And I enter car name
      When I click on find a dealer button
      Then I see all nearest dealer  sucessfully

