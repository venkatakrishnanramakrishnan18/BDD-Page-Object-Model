package Managers;

import org.openqa.selenium.WebDriver;
import pageObjects.YoutubeLandingPage;

public class PageObjectManager {
    private WebDriver driver;

    private YoutubeLandingPage youtubeLandingPage;

//    private CartPage cartPage;
//
//    private HomePage homePage;
//
//    private CheckoutPage checkoutPage;
//
//    private ConfirmationPage confirmationPage;



//    This constructor is asking for parameter of type WebDriver. As to create an object of the Pages, this class requires a driver. Now who so ever will create the object of this class needs to provide the driver like :
//
//    PageObjectManager pageObjectManager = new PageObjectManager(driver);


    public PageObjectManager(WebDriver driver) {

        this.driver = driver;

    }
//
//
//
//    Page Object Creation Method
//    public HomePage getHomePage() {
//        return (homePage == null) ? new HomePage(driver) : homePage;
//    }
//    This method has two responsibilities:
//
//    To create an Object of Page Class only if the object is null.
//    To supply the already created object if it is not null


    public YoutubeLandingPage getYoutubeLandingPage(){

        return (youtubeLandingPage == null) ? youtubeLandingPage = new YoutubeLandingPage(driver) : youtubeLandingPage;

    }
}
