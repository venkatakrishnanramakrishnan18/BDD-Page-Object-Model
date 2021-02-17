package BaseTest;

import Utilities.PropertiesFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class BaseTest {

//    public static WebDriver driver;
//    PropertiesFileReader fileReader = new PropertiesFileReader();
//
//    @Parameters("browserName")
//    @BeforeSuite
//    public void beforeMethodMethod(@Optional("chrome") String browserName){
//        String url = fileReader.getBrowserUrl();
//        setupDriver(browserName);
//        driver.get(url);
//        System.out.println("The url is "+url);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//
//    }

//
//    @AfterSuite
//    public void afterMethodMethod(){
//
//         driver.quit();
//    }

    ///@BeforeSuite
//    public void setupDriver(String browserName){
//        if(browserName.equalsIgnoreCase("chrome")){
//            System.out.println("----"+System.getProperty("user.dir") + File.separator +"drivers"+File.separator+"chromedriver"+File.separator+"chromedriver.exe");
//            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + File.separator +"drivers"+File.separator+"chromedriver"+File.separator+"chromedriver.exe");
//            driver = new ChromeDriver();
//        }
//        else if(browserName.equalsIgnoreCase("firefox")){
//            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + File.separator +"drivers"+File.separator+"chromedriver.exe");
//            ///////driver = new FirefoxDriver();
//        }
//    }
}
