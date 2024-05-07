package com.icarro.stepdefinitions;

import com.icarro.pages.CarSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.icarro.pages.BasePage.driver;

public class CarSearchPageSteps {
    @And("User enters valid city name")
    public void enter_valid_city_name() {
        new CarSearchPage(driver).fillCityName("Tel Aviv");
    }
    @And("User clicks on Dates input")
    public void click_in_dates_input() {
        new CarSearchPage(driver).clickDatesInput();
    }
    @And("User clicks on Start-Day on Calendar")
    public void click_start_day_in_calendar() {
        new CarSearchPage(driver).clickOnStartDayInCalendar();
    }

    @And("User clicks on End-Day on Calendar")
    public void click_end_day_in_calendar() {
        new CarSearchPage(driver).clickOnEndDayInCalendar();
    }

    @Then("User verifies any Car Card is displayed")
    public void verify_search_result() {
        new CarSearchPage(driver).isCarCardDisplayed();
    }
}
