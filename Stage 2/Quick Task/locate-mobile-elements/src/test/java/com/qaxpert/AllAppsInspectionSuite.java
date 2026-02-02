package com.qaxpert;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        // Apps nativas
        MessagesTest.class,
        CameraTest.class,
        CalendarTest.class,
        GmailTest.class,
        YoutubeTest.class,
        CalculatorTest.class,
        CallsTest.class,
        ContactsTest.class

})
public class AllAppsInspectionSuite {

}
