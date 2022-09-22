package ru.netology.sqr.cyclemvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.cyclemvn.services.SQRService;

public class SQRServiceTest {

    @Test
    public void calcSquareNumber() {
        SQRService service = new SQRService();
        int expected = 8;
        int actual = service.calcSqrt(200, 300);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcSameSquareNumber() {
        SQRService service = new SQRService();
        int expected = 5;
        int actual = service.calcSqrt(200, 200);
        Assertions.assertEquals(expected, actual);
    }
}