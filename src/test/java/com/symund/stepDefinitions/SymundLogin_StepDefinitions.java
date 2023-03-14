package com.symund.stepDefinitions;


import com.symund.pages.SymundLoginPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SymundLogin_StepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.symund.com/index.php/login");
    }

    SymundLoginPage symundLoginPage= new SymundLoginPage();
    @When("user enters valid username and valid password")
    public void user_enters_valid_username_and_valid_password() {

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {


    }
    @When("user enters invalid username or invalid password")
    public void user_enters_invalid_username_or_invalid_password() {

    }
    @Then("user can not login and should see the {string} message.")
    public void user_can_not_login_and_should_see_the_message(String string) {

    }


    @When("user enters empty username or empty password")
    public void user_enters_empty_username_or_empty_password() {

    }
    @Then("user can not login and should see {string} message.")
    public void user_can_not_login_and_should_see_message(String string) {

    }


}
