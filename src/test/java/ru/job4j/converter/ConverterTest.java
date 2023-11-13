package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert1000TengeThen2Euro() {
        double e = 1000;
        double sum1 = 2;
        double euro = Converter.tengeToEuro(e);
        double eps = 0.0001f;
        assertThat(euro).isEqualTo(sum1, withPrecision(eps));

    }

    @Test
    void whenConvert800TengeThen2Dollar() {
        double e = 800;
        double sum2 = 2;
        double dollar = Converter.tengeToEuro(e);
        double eps = 0.0001f;
        assertThat(dollar).isEqualTo(sum2, withPrecision(eps));

    }
}