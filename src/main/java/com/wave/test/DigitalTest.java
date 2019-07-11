package com.wave.test;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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

    @Test
    public void rateConvertTest() {
        BigDecimal rate = new BigDecimal("0.005");
        System.out.println(convertRate(rate));
    }

    private String convertRate(BigDecimal rate) {
        DecimalFormat decimalFormat = new DecimalFormat("###.###");

        return decimalFormat.format(rate.multiply(new BigDecimal(100))) + "%";
    }

}
