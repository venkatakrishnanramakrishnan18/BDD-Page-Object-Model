package TestRunner;

import BaseTest.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner; ///imports testNGCucumberRunner
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(
        features = "./features",
        glue = {"Stepdefs"},
        tags = {"@Test1"},
        plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"},
        monochrome = true)

public class TestRunnerClass {
    private TestNGCucumberRunner testNGCucumberRunner;
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception{
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
///////all the feature files within the feature folder are passed as parameter
    ///to this @Test
    @Test(dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature){
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    ///////////this 'features' method -->> finds all the feature files present in features folder and feeds the @Test
    @DataProvider
    public Object[][] features(){
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
      public void tearDownClass() throws Exception{
        testNGCucumberRunner.finish();
    }




}
