package ru.job4j.loop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Assert.assertEquals(120, Factorial.calc(5));
        /* здесь тест, проверяющий, что факториал для числа 5 равен 120. */

        Assert.assertEquals(1, Factorial.calc(0));
        /*  здесь тест проверяющий, что факториал для числа 0 равен 1. */

        Assert.assertEquals(1, Factorial.calc(1));
        /*  здесь тест проверяющий, что факториал для числа 1 равен 1. */
    }
}