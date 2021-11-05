package api.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginwithexamplesteps {
    private WebDriver driver;

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("^User Navigate to Login page$")
    public void user_Navigate_to_Login_page() throws Throwable {
        System.out.println("User Navigate to Login page");
    }

    @When("^User enters\"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        System.out.println("Username is  "+username  +  "password is"+password);
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Successfully logged in");
        Thread.sleep(2000);
        driver.close();
    }

}
