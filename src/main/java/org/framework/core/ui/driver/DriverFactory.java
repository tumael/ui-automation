package org.framework.core.ui.driver;

import org.framework.core.ui.browser.Browser;
import org.framework.core.ui.browser.Chrome;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Class created in order to recognize the org.framework.core.ui.driver type.
 */
public class DriverFactory {
    private static final Map<DriverType, Supplier<Browser>> BROWSERS = new EnumMap<>(DriverType.class);
    static {
        BROWSERS.put(DriverType.CHROME, Chrome::new);
    }

    /**
     * Private Constructor for the DriverFactory utility class.
     */
    private DriverFactory() {
    }

    /**
     * Return the WebDriver instance specified by the environment properties.
     *
     * @param driverType Enum value specified from DriverType.
     * @return a WebDriver instance.
     */
    public static WebDriver getDriverManager(final DriverType driverType) {
        return BROWSERS.getOrDefault(driverType, Chrome::new).get().getBrowser();
    }
}
