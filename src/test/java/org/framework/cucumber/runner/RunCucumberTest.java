package org.framework.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import org.framework.core.ui.driver.DriverManager;

/**
 * Class which runs all features.
 */
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.framework.cucumber"},
        plugin = {"pretty"},
        tags = {"@bvt"}
)
public class RunCucumberTest {

    /**
     * this method close the browser after the features finish.
     */
    @After
    public void close() {
        DriverManager.getInstance().getDriver().quit();
    }
}
