package ru.job4j.loop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    public void whenSumNumbers() {
        int start = 1;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        Assert.assertEquals(expected, result);
    }

    @Test
        public void whenSumEvenNumbersFromOneToTenThenThirty() {
            int start = 1;
            int finish = 10;
            int result = Counter.sumByEven(start, finish);
            int expected = 30;
            Assert.assertEquals(expected, result);
    }
}