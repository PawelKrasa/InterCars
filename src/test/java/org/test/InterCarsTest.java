package org.test;

import org.testng.annotations.Test;

public class InterCarsTest {

    InterCarsTestPage interCars = new InterCarsTestPage();

    @Test (description = "Open browser and website")
    public void openBrowser(){
        interCars.goToIntercarsWebsite();
    }

    @Test (description = "Search and select a tire repair service")
    public void serviceTiresChange(){
        interCars.serviceTiresChange();
    }
}
