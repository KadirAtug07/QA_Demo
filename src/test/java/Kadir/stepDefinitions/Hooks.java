package Kadir.stepDefinitions;

import Kadir.utils.BrowserUtils;
import Kadir.utils.ConfigurationsReader;
import Kadir.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BrowserUtils{

    @Before
    public void instantiateDriver() {
        Driver.getDriver();
        BrowserUtils.setWaitTime();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(ConfigurationsReader.getProperties("url"));

    }

    @After
    public void TearDown(Scenario scenario) {
        System.out.println("=========================================");
        try {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            }
        } finally {
            //driver.close();
            System.out.println("Browser successfully closed");
        }
    }
}
