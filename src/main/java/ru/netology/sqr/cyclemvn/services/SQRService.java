package ru.netology.sqr.cyclemvn.services;

public class SQRService {
    public int calcSqrt(int a, int b) {
        int square = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= a) ;
            if (i * i <= b) {
                square++;
            }

        }
        return square;
    }
}
