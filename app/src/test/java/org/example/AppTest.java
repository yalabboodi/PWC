package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    TriangleNumberCalculator calculator = new TriangleNumberCalculator();


    @Test
    void valueReturnsFirstTriangularNumber() {
        assertEquals(1, calculator.value(1));
    }

    @Test
    void valueReturnsSecondTriangularNumber() {
        assertEquals(3, calculator.value(2));
    }

    @Test
    void valueReturnsFourthTriangularNumber() {
        assertEquals(10, calculator.value(4));
    }


    @Test
    void addReturnsSumOfFirstAndFirst() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void addReturnsSumOfSecondAndThird() {
        assertEquals(9, calculator.add(2, 3));
    }

    @Test
    void addReturnsSumOfFourthAndSecond() {
        assertEquals(13, calculator.add(4, 2));
    }


    @Test
    void subtractReturnsZeroWhenSame() {
        assertEquals(0, calculator.subtract(1, 1));
    }

    @Test
    void subtractReturnsNegativeWhenSmaller() {
        assertEquals(-3, calculator.subtract(2, 3));
    }

    @Test
    void subtractReturnsPositiveWhenLarger() {
        assertEquals(7, calculator.subtract(4, 2));
    }
}
