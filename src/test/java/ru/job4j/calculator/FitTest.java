package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short income = 180;
        double expected = 92;
        double out = Fit.manWeight(income);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
    short income = 170;
    double expected =   69.0;
    double out = Fit.womanWeight(income);
    assertThat(out).isEqualTo(expected, withPrecision(0.01));

    }

}

