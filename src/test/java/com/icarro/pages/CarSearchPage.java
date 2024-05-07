package com.icarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class CarSearchPage extends BasePage{

    Actions builder = new Actions(driver);
    public CarSearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "city")
    WebElement inputCity;

    @FindBy(id = "dates")
    WebElement inputDates;
    @FindBy(xpath = "//div[@class='mat-calendar-body-cell-content' and text()='10']")
    WebElement startDay;

    @FindBy(xpath = "//div[@class='mat-calendar-body-cell-content' and text()='15']")
    WebElement endDay;

    @FindBy(xpath = "//div[@class = 'car-card']")
    WebElement carCard;

    public CarSearchPage fillCityName(String city) {
        type(inputCity, city);
        builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
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
