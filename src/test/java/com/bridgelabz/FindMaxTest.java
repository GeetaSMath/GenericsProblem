package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaxTest {
    /* Test Cases For Integer Array */
    @Test
    public void givenFirstIntegerNumberAsLarge_ShouldReturn_FirstNumberAsMax() throws FindMaxException {
        Integer max = new FindMax<>(200,150,100).findMaxValue();
        Assertions.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenSecondIntegerNumberAsLarge_ShouldReturn_SecondNumberAsMax() throws FindMaxException {
        Integer max = new FindMax<>(100,150,50).findMaxValue();
        Assertions.assertEquals((Integer) 150, max);
    }

    @Test
    public void givenThirdIntegerNumberAsLarge_ShouldReturn_ThirdNumberAsMax() throws FindMaxException {
        Integer max = new FindMax<>(100,500,1000).findMaxValue();
        Assertions.assertEquals((Integer) 1000, max);
    }

    @Test
    public void givenForthIntegerNumberAsLarge_ShouldReturn_ForthNumberAsMax() throws FindMaxException {
        Integer max = new FindMax<>(100,500,1000,5000).findMaxValue();
        Assertions.assertEquals((Integer) 5000, max);
    }

    /* Test Cases For Float Array */
    @Test
    public void givenFirstFloatNumberAsLarge_ShouldReturn_FirstNumberAsMax() throws FindMaxException {
        Float max = new FindMax<>(200f,100f,150f).findMaxValue();
        Assertions.assertEquals((Float) 200f, max);
    }

    @Test
    public void givenSecondFloatNumberAsLarge_ShouldReturn_SecondNumberAsMax() throws FindMaxException {
        Float max = new FindMax<>(100f,150f,50f).findMaxValue();
        Assertions.assertEquals((Float) 150f, max);
    }

    @Test
    public void givenThirdFloatNumberAsLarge_ShouldReturn_ThirdNumberAsMax() throws FindMaxException {
        Float max = new FindMax<>(100f,500f,1000f).findMaxValue();
        Assertions.assertEquals((Float) 1000f, max);
    }

    @Test
    public void givenForthFloatNumberAsLarge_ShouldReturn_ForthNumberAsMax() throws FindMaxException {
        Float max = new FindMax<>(100f,500f,1000f,5000f).findMaxValue();
        Assertions.assertEquals((Float) 5000f, max);
    }

    /* Test Cases For String Array */
    @Test
    public void givenFirstStringAsLarge_ShouldReturn_FirstStringAsMax() throws FindMaxException {
        String max = new FindMax<>("Morning", "Hello", "GM").findMaxValue();
        Assertions.assertEquals("Morning", max);
    }

    @Test
    public void givenSecondStringAsLarge_ShouldReturn_ThirdStringAsMax() throws FindMaxException {
        String max = new FindMax<>("Good", "Morning", "All").findMaxValue();
        Assertions.assertEquals("Morning", max);
    }

    @Test
    public void givenThirdStringAsLarge_ShouldReturn_ThirdStringAsMax() throws FindMaxException {
        String max = new FindMax<>("All", "Good", "Morning").findMaxValue();
        Assertions.assertEquals("Morning", max);
    }
    @Test
    public void givenForthStringAsLarge_ShouldReturn_ForthStringAsMax() throws FindMaxException {
        String max = new FindMax<>("All", "Good", "Morning","You").findMaxValue();
        Assertions.assertEquals("You", max);
    }

    @Test
    public void givenEmpty_ShouldReturn_AnException() {
        try{
            new FindMax<>().findMaxValue();
        }catch (FindMaxException e){
            Assertions.assertEquals("No Elements to Compare",e.getMessage());
        }
    }
}
