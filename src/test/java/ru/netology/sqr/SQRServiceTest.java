package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "2,100,121",
            "0,0,99",
            "2,9604,9801",
            "0,9802,10000",
            "1,100,100",
            "14,300,1000"
    })
    public void test(int expected, int x, int y) {
        SQRService service = new SQRService();
        int actual = service.calcAmountSqr(x, y);

        Assertions.assertEquals(expected, actual);
    }
}

