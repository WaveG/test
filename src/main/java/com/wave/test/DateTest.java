package com.wave.test;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Test;

/**
 * @author Wave
 * @version v 0.1 2018/11/28 11:17
 */
public class DateTest {

    @Test
    public void dateTest() {
        DateTime now = new DateTime("2019-07-09T20:00:00", DateTimeZone.UTC);

        System.out.println(now.getMillis());
    }

    @Test
    public void millisToDate() {
        DateTime date = new DateTime(1555328906000L);
        System.out.println(date.toString());
    }

}
