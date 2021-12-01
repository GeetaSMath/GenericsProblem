package com.bridgelabz;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaxTest {
    FindMax findMax;

    @Before
    public void initData() {
        findMax = new FindMax();
    }

    @Test
    public void givenFirstNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Integer max = findMax.findMaxValue(200, 25, 105);
        Assertions.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenSecondNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
        Integer max = findMax.findMaxValue(35, 110, 105);
        Assertions.assertEquals((Integer) 110, max);
    }

    @Test
    public void givenThirdNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
        Integer max = findMax.findMaxValue(35, 110, 215);
        Assertions.assertEquals((Integer) 215, max);
    }
}
