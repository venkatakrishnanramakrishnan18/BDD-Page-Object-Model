package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class YoutubeLandingPage {
    WebDriver driver;
    /////constructor
    public YoutubeLandingPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    ////we have to add the object locators
    ///driver.findElement(By.id("search")).sendKeys(searchString);
    @FindBy(how = How.ID,using="search")
    private WebElement txtbx_SearchField;

    ///driver.findElement(By.cssSelector("#search-icon-legacy")).click();
    @FindBy(how=How.CSS,using="#search-icon-legacy")
    private WebElement searchIcon;

    ///Assert.assertTrue(driver.findElement(By.xpath("//a[@id='video-title' and contains(@title,'Cucumber BDD')]")).isDisplayed(),"Search result successfully returned.");
    @FindBy(how=How.XPATH,using="//a[@id='video-title' and contains(@title,'Cucumber BDD')]")
    private WebElement searchResult;

    public void performSearchInLandingPage(String searchCriteria){
        txtbx_SearchField.sendKeys(searchCriteria);
    }

    public void clickSearchIcon(){
        searchIcon.click();
    }

    public void verifySearchResult() {
        Assert.assertTrue(searchResult.isDisplayed(),"Search Result is displayed as expected.");
        ///////Assert.assertFalse(searchResult.isDisplayed(),"Search Result is displayed. Expected is no result.");


    }

}
