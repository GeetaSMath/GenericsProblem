package com.bridgelabz;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaxTest<max> {
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
    @Test
    public void givenFirstFloatNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Float max = findMax.findMaxValue(350f, 110f, 215f);
        Assertions.assertEquals((Float) 350f, max);
    }

    @Test
    public void givenSecondFloatNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
        Float max = findMax.findMaxValue(35f, 110f, 25f);
        Assertions.assertEquals((Float) 110f, max);
    }

    @Test
    public void givenThirdFloatNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
        Float max = findMax.findMaxValue(350f, 110f, 450f);
        Assertions.assertEquals((Float) 450f, max);
    }
    @Test
    public void givenFirstStringAsLarge_ShouldReturn_FirstStringAsMax() {
        String max = findMax.findMaxValue("350", "110", "215");
        Assertions.assertEquals((String)"350", max);
    }

    @Test
    public void givenSecondStringAsLarge_ShouldReturn_ThirdStringAsMax() {
        String max = findMax.findMaxValue("350", "450", "215");
        Assertions.assertEquals((String)"450", max);
    }

    @Test
    public void givenThirdStringAsLarge_ShouldReturn_ThirdStringAsMax() {
        String max = findMax.findMaxValue("350", "110", "400");
        Assertions.assertEquals((String)"400", max);
    }


}
