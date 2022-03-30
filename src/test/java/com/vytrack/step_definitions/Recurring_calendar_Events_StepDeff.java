package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Recurring_calendar_Events_StepDeff {

    LoginPage login = new LoginPage();
    DashboardPage dashboard=new DashboardPage();
    CalendarPage calendar=new CalendarPage();

    @Given("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        login.usernameInput.sendKeys(username);
        login.passwordInput.sendKeys(password);
        login.loginButton.click();
        dashboard.waitTillLoaderMaskDisappear();

    }
    @When("user clicks the calendar events under the activities")
    public void user_clicks_the_calendar_events_under_the_activities() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(dashboard.activitiesButton).perform();
        dashboard.calendarButton.click();
    }
    @When("user clicks the Create Calendar Event button.")
    public void user_clicks_the_create_calendar_event_button() {
dashboard.createEventButton.click();
    }
    @When("user checks the Repeat checkbox.")
    public void user_checks_the_repeat_checkbox() {
        calendar.repeatCheckBox.click();

    }
    @Then("user verify Repeat Every number is {string} as a default")
    public void user_verify_repeat_every_number_is_as_a_default(String string) {
        String actualNumber= calendar.checkRepeatEvery.getAttribute("value");
        String expectedNumber="1";
        Assert.assertEquals(actualNumber,expectedNumber);
        //aacahnges
    }

    @Then("user delete the value on Repeat every box")
    public void userDeleteTheValueOnRepeatEveryBox() {

        calendar.checkRepeatBox.clear();

    }

    @Then("user should see error message {string}")
    public void userShouldSeeErrorMessage(String expectedErrorMsg) {

        String actualErrorMsg=calendar.errorMessage.getText();

        Assert.assertEquals(expectedErrorMsg,actualErrorMsg);


    }
}
