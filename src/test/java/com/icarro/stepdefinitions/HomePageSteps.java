package com.icarro.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.icarro.pages.HomePage;

import static com.icarro.pages.BasePage.driver;

public class HomePageSteps {

    @Given("User launches Chrome browser")
    public void launch_browser() {
        new HomePage(driver).init();
    }
    @When("User opens ilCarro HomePage")
    public void openIcarroHomePage() {
        new HomePage(driver).navigateToMainPage();
    }
    @Then("User verifies HomePage title is displayed")
    public void veryfy_title_displayed() {
        new HomePage(driver).isHomePageTitleDisplayed();
    }
    @And("User quites browser")
    public void quit_browser() {
    new HomePage(driver).tearDown();
    }
}
