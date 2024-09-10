package StepDefinations;

import Pages.Scenarios;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public  class ScenariosStepDefinations {


    @Given("user on the login page")
    public void user_on_the_login_page() {
        Scenarios.launchApp();
    }

    @Given("user enters  {string} and password")
    public void user_enters_with_and_password(String string1) {
        Scenarios.enterCreds(string1);

    }

    @When("user click {string} button")
    public void user_click_button(String string) {
        Scenarios.clickOnLoginButton();
    }

    @Then("user should see {string}")
    public void user_should_see(String string) {

    }

    @Then("error message displayed with {string}")
    public void error_message_displayed_with(String string) {
    Scenarios.checkErrorMesasge(string);
    }






}