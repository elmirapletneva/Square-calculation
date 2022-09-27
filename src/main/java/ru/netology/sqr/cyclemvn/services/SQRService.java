package ru.netology.sqr.cyclemvn.services;

public class SQRService {
    public int calcSqrt(int min, int max) {
        int square = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                {
                    if (i * i <= max)
                        square++;
                }
            }
        }
        return square;

    }
}