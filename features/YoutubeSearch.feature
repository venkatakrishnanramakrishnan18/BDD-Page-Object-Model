@Test1
Feature: Youtube Search
  Scenario Outline: Test
  Given User launches browser and launches app
  When User enters search criteria "<SearchData>"
  When User clicks on search button
  Then User finds search results

    Examples:
    |SearchData|
    |TestNG annotations in Cucumber|

