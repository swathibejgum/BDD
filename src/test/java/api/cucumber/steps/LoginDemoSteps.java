/*package api.cucumber.steps;

import api.cucumber.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertTrue;

public class LoginDemoSteps {
    WebDriver driver = null;
    LoginPage login;

    @Given("browser is open")
    public void browser_is_open() {

        System.out.println("   ===I am inside browser_is_open  ===");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @And("^user is on login page$")
    public void user_is_on_login_page() {
        driver.navigate().to("https://example.testproject.io/web/");
    }


    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
        login = new LoginPage(driver);
        login.enterUsername(username);
        login.enterpassword(password);
        Thread.sleep(2000);

    }

    @And("^user clicks on login$")
    public void user_clicks_on_login() {
        login.Click();

    }

    @Then("^user is navigated to the home page$")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
      //  home = new HomePage_PF(driver);
        //home.checkLogoutIsDisplayed();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}

*/


