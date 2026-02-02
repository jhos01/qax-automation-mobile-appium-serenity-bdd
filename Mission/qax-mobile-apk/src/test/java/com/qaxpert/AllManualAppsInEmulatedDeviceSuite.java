package com.qaxpert;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AndroidAppiumDemoTest.class,
        AptoideTest.class,
        AutomationSamplePureTest.class,
        FDroidTest.class,
        GroceryDemoTest.class,
        MyCurrencyTest.class,
})
public class AllManualAppsInEmulatedDeviceSuite {
}
