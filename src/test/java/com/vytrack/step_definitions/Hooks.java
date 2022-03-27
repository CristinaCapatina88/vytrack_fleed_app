package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void setup(){

    }

    @After
    public void tearDown() throws Exception {
        Driver.closeDriver();
    }


}
