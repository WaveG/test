package com.wave.test;

import org.junit.Test;

import java.util.Random;

/**
 * Created by Wave on 2018/12/12.
 */
public class DigitalTest {

    @Test
    public void randomTest() {
        Random generator = new Random();
        System.out.println(generator.nextInt(0));
    }
}
