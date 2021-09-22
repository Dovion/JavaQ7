package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {
            "200,300,3"
    }
    )
    void ShouldCalculateSQR(int squareUnder, int squareOver, int expected) {
        SQRService service = new SQRService();
        int actual = service.SQRCalc(squareUnder, squareOver);
        assertEquals(expected, actual);
    }
}