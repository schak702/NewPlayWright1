package StepDefinations;

import Pages.PlaywrightScenarios;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaywrightStepDefinations {

    @Given("User launches the Chrome browser")
    public void user_launches_the_chrome_browser() {
    }

    @When("User opens the URL {string}")
    public void user_opens_the_url(String url) {
        PlaywrightScenarios.launchUrl();
    }

    @Given("User hovers over {string} in the taskbar and selects Java")
    public void userHoverAndSelectsJava(String arg0) {
        PlaywrightScenarios.SelectElementFromDropDown();
    }

    @When("User clicks on the search icon")
    public void user_clicks_on_the_search_icon() {
        PlaywrightScenarios.searchElement();
    }

    @And("User enters {string} in the search input")
    public void userEntersInTheSearchInput(String arg0) {
        PlaywrightScenarios.enterValue();
    }

    @Then("the element should open on a new page")
    public void the_element_should_open_on_a_new_page() {
        PlaywrightScenarios.quitBrowser();
    }
}
