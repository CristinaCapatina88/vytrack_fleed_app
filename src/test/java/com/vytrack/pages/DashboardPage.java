package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {


    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //click on Activities button
    @FindBy(xpath = "//span[normalize-space()='Activities' and contains(@class, 'title title-level-1')]")
    public WebElement activitiesButton;


    //click to Calendar Events
    @FindBy(xpath = "//span[normalize-space()='Calendar Events' and contains(@class, 'title title-level-2')]")
    public WebElement calendarButton;

    //click to create calendar event button
    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createEventButton;

    public  void waitForPresenceOfElement(By by, long time){
        new WebDriverWait(Driver.getDriver(), time).until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
