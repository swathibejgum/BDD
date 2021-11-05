package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class loginwithmultipledatasteps {
    @Given("^User is at the login page of the application$")
    public void user_is_at_the_login_page_of_the_application() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is at the login page of the application");;
    }

    @When("^User logs in with following username and password$")
    public void user_logs_in_with_following_username_and_password(DataTable dataTable) throws Throwable {
     List< List<String>>   list_of_rows = dataTable.raw();
     for(List<String> row :list_of_rows){
         for(String str: row){
             System.out.println("Data   :"+str);
         }
     }
    }

    @Then("^user should be able to login with correct username and password$")
    public void user_should_be_able_to_login_with_correct_username_and_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should be able to login with correct username and password");
    }
}
