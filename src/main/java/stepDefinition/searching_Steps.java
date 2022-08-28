package stepDefinition;

import PageObjectModel.earch_Product_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileDriver;
import utilities.Driver;

public class searching_Steps {

    private MobileDriver driver;

    search_Product_Page add_to_cart_page = new search_Product_Page();

    @Given("Login to the AliExpress App")
    public void login_aliexpress(){

        driver = Driver.getDriver();

    }
    @And("Tap to the region button")
    public void tap_region_button() throws Throwable{

        search_Product_Page.clickRegionButton();
    }
    @And("Select the United States as the region")
    public void select_region() throws Throwable{

        search_Product_Page.clickTheRegion();

    }
    @And("Tap to the continue button")
    public void tap_continue_button() throws Throwable{
        search_Product_Page.clickContinueBttn();
    }
    @When("Make a search for a product")
    public void search_a_product() throws Throwable{
        search_Product_Page.clickSearchBox();

    }
    @Then("Results must be containing the searched letters")
    public void tap_on_a_product() throws Throwable{
        search_Product_Page.assertIsTheyAreRealeted();
    }
}
