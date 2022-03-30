package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_StepDef {

    LoginPage login = new LoginPage();
    DashboardPage dashboard=new DashboardPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }
    @When("user enters username {string}")
    public void user_enters(String username) {
      login.usernameInput.sendKeys(username);

    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        login.passwordInput.sendKeys(password);
    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
       login.loginButton.click();
       dashboard.waitTillLoaderMaskDisappear();
    }
    @Then("user should see {string} title")
    public void user_should_see_dashboard_page(String expectedtitle) {
       String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedtitle,actualTitle);
    }


}
