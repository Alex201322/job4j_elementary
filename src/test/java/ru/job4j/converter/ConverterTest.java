package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert1000TengeThen2Euro() {
        double income = 800;
        double expected = 1.5996800639872024;
        double result = Converter.tengeToEuro(income);
        double delta = 0.0001f;
        assertThat(result).isEqualTo(expected, withPrecision(delta));

    }

    @Test
    void whenConvert800TengeThen2Dollar() {
        double income = 400;
        double expected = 0.7998400319936012;
        double result = Converter.tengeToEuro(income);
        double eps = 0.0001f;
        assertThat(result).isEqualTo(expected, withPrecision(eps));

    }
}