package com.wave.test;

import org.joda.time.DateTime;
import org.junit.Test;

/**
 * @author Wave
 * @version v 0.1 2018/11/28 11:17
 */
public class DateTest {

    @Test
    public void dateTest() {
        DateTime now = new DateTime("2019-04-19T15:30:00");

        System.out.println(now.getMillis());
    }

    @Test
    public void millisToDate() {
        DateTime date = new DateTime(1557711364000L);
        System.out.println(date.toString());
    }

}
