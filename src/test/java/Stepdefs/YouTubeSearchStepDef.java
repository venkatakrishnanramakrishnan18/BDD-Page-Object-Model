package Stepdefs;

import Managers.PageObjectManager;
import Managers.WebDriverManager;
import Utilities.PropertiesFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.YoutubeLandingPage;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class YouTubeSearchStepDef {

    PropertiesFileReader fileReader;
    public static WebDriver driver;
    WebDriverManager webDriverManager;
    PageObjectManager pageObjectManager;
    YoutubeLandingPage youtubeLandingPage;


    @Given ("^User launches browser and launches app$")
    public void launchBrowserAndApp() throws Exception{
        fileReader = new PropertiesFileReader();
        System.out.println("Driver path :: "+fileReader.getDriverPath());
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        pageObjectManager=new PageObjectManager(driver);
//        System.setProperty("webdriver.chrome.driver",fileReader.getDriverPath());
//        driver = new ChromeDriver();
        ///System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + File.separator +"drivers"+File.separator+"chromedriver"+File.separator+"chromedriver.exe");
        ////driver = new ChromeDriver();
        driver.get(fileReader.getBrowserUrl());
        System.out.println("The url is "+fileReader.getBrowserUrl());
        driver.manage().timeouts().implicitlyWait(fileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        ///driver.manage().window().maximize();
        fileReader.getBrowserWindowSize();
        Thread.sleep(10000);
    }

    @When("^User enters search criteria \"(.*)\"$")
    public void enterSearchCriteria(String searchString) throws Exception{
        //////driver.findElement(By.id("search")).sendKeys(searchString);
        pageObjectManager = new PageObjectManager(driver);
        youtubeLandingPage = pageObjectManager.getYoutubeLandingPage();
        youtubeLandingPage.performSearchInLandingPage(searchString);
        Thread.sleep(200);
    }

    @When("^User clicks on search button$")
    public void clickSearchIcon() throws Exception{
        /////driver.findElement(By.cssSelector("#search-icon-legacy")).click();
        pageObjectManager = new PageObjectManager(driver);
        youtubeLandingPage = pageObjectManager.getYoutubeLandingPage();
        youtubeLandingPage.clickSearchIcon();
        fileReader.getImplicitlyWait();
        ////Thread.sleep(10000);
        ///driver.quit();
    }

    @Then("^User finds search results$")
    public void validateSearchResult() throws Exception{
        //////////if(driver.findElement(By.xpath("//a[@id='video-title' and contains(@title,'Cucumber BDD')]")).isDisplayed()){
        pageObjectManager = new PageObjectManager(driver);
        youtubeLandingPage = pageObjectManager.getYoutubeLandingPage();
        fileReader.getImplicitlyWait();
        youtubeLandingPage.verifySearchResult();
        ///driver.quit();
        Thread.sleep(2000);
        webDriverManager.closeDriver();

//        Thread.sleep(8000);
//        Assert.assertTrue(driver.findElement(By.xpath("//a[@id='video-title' and contains(@title,'Cucumber BDD')]")).isDisplayed(),"Search result successfully returned.");
        ///}
    }
}
