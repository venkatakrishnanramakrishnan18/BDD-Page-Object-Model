$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("YoutubeSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Youtube Search",
  "description": "",
  "id": "youtube-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test1"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Test",
  "description": "",
  "id": "youtube-search;test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User launches browser and launches app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters search criteria \"\u003cSearchData\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on search button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User finds search results",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "youtube-search;test;",
  "rows": [
    {
      "cells": [
        "SearchData"
      ],
      "line": 10,
      "id": "youtube-search;test;;1"
    },
    {
      "cells": [
        "TestNG annotations in Cucumber"
      ],
      "line": 11,
      "id": "youtube-search;test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Test",
  "description": "",
  "id": "youtube-search;test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User launches browser and launches app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters search criteria \"TestNG annotations in Cucumber\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on search button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User finds search results",
  "keyword": "Then "
});
formatter.match({
  "location": "YouTubeSearchStepDef.launchBrowserAndApp()"
});
formatter.result({
  "duration": 17274012100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestNG annotations in Cucumber",
      "offset": 29
    }
  ],
  "location": "YouTubeSearchStepDef.enterSearchCriteria(String)"
});
formatter.result({
  "duration": 384822700,
  "status": "passed"
});
formatter.match({
  "location": "YouTubeSearchStepDef.clickSearchIcon()"
});
formatter.result({
  "duration": 98850300,
  "status": "passed"
});
formatter.match({
  "location": "YouTubeSearchStepDef.validateSearchResult()"
});
formatter.result({
  "duration": 1726122700,
  "status": "passed"
});
});