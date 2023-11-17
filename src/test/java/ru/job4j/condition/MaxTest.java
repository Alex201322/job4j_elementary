package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 33;
        int right = 55;
        int result = Max.max(left, right);
        int expected = 55;
        Assert.assertEquals(result, expected);
    }
}