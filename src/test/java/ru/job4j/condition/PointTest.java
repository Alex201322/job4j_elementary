package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

    class PointTest {
        @Test
        void when00to20then2() {
            double expected = 2;
            int x1 = 0;
            int y1 = 0;
            int x2 = 2;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }

        @Test
        void when10to10then2() {
            double expected = 12.0;
            int x1 = 1;
            int y1 = 0;
            int x2 = 1;
            int y2 = 12;
            double out = Point.distance(x1, y1, x2, y2);
            assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }

        @Test
        void when50to20then2() {
            double expected = 3.0;
            int x1 = 5;
            int y1 = 0;
            int x2 = 2;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }

        @Test
        void when11to20then2() {
            double expected = 1.41;
            int x1 = 1;
            int y1 = 1;
            int x2 = 2;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }

    }