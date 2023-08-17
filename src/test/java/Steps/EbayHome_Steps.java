package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EbayHome_Steps {
    @Given("I am on Ebay Home Page")
    public void i_am_on_ebay_home_page() {
        System.out.println("I am on Ebay Home Page");
    }
    @When("I click an Advance Search Link")
    public void i_click_an_advance_search_link() {
        System.out.println("I click an Advance Search Link");
    }
    @Then("I navigate to Advance Search Page")
    public void i_navigate_to_advance_search_page() {
        System.out.println("I navigate to Advance Search Page");
    }


}
