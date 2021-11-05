package api.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class poststeps {

    @Given("^User should be logged in and should be present on his wall$")
    public void user_should_be_logged_in_and_should_be_present_on_his_wall() throws Throwable {

        System.out.println("User should be logged in and should be present on his wall");
    }

    @When("^I type the message in the box$")
    public void i_type_the_message_in_the_box() throws Throwable {
        System.out.println("I type the message in the box");
    }

    @Then("^the message should get posted$")
    public void the_message_should_get_posted() throws Throwable {
        System.out.println("the message should get posted");
    }

    @And("^Click on the Post button$")
    public void click_on_the_post_button() throws Throwable {
        System.out.println("Click on the Post button");
    }
    }
