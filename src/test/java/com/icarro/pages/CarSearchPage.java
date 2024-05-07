package com.icarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarSearchPage extends BasePage{
    public CarSearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "city")
    WebElement inputCity;

    @FindBy(id = "dates")
    WebElement inputDates;
    @FindBy(xpath = "//td[@aria-label='June 15, 2024']")
    WebElement startDay;

    @FindBy(xpath = "//td[@aria-label='June 20, 2024']")
    WebElement endDay;

    @FindBy(xpath = "//div[@class = 'car-card']")
    WebElement carCard;
    public CarSearchPage fillCityName(String city) {
        type(inputCity, city);
        return this;
    }

    public CarSearchPage clickDatesInput() {
        click(inputDates);
        return this;
    }

    public CarSearchPage clickOnStartDayInCalendar() {
        click(startDay);
        return this;
    }

    public CarSearchPage clickOnEndDayInCalendar() {
        click(endDay);
        return this;
    }

    public CarSearchPage isCarCardDisplayed() {
        assert isElementDisplayed(carCard);
        return this;
    }
}
