package com.vytrack.step_definitions;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
@BeforeStep
public void beforestep(){
    BrowserUtils.sleep(1);
}



@After
    public void teardown(){
    Driver.closeDriver();
}

}
