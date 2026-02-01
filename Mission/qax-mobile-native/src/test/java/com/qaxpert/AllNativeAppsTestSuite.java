package com.qaxpert;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BrowserTest.class,
        CalculatorTest.class,
        CalendarTest.class,
        CallsTest.class,
        CameraTest.class,
        ClockTest.class,
        ContactsTest.class,
        MessagesTest.class,
        SettingsTest.class,
        YoutubeTest.class
})
public class AllNativeAppsTestSuite {
    // No necesitas implementar ningún método
}
