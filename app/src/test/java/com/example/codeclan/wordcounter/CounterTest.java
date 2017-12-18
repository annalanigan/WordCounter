package com.example.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by annalanigan on 18/12/2017.
 */

public class CounterTest {

    Counter counter;

    @Before
    public void before(){
        counter = new Counter();
    }

    @Test
    public void canAddInput(){
        counter.setInput("Hello");
        assertEquals("Hello", counter.getInput());
    }

    @Test
    public void canCountWords(){
        counter.setInput("Hello, and how are you today?");
        assertEquals(6, counter.countWords());
    }

}
