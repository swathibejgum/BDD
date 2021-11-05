package api.cucumber.hooks;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class CucumberHooks {
    @Before
    public void setUp(){
        System.out.println("--------Before hook------");
    }
    @After
    public void tearDown(){
        System.out.println("---------After hook -----");
    }
    @BeforeStep
    public void setUpSteps(){
        System.out.println("--------BeforeStep hook------");
    }
    @AfterStep
    public void tearDownSteps(){
        System.out.println("---------AfterStep hook -----");
    }
}
