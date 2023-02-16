package ru.netology.sqr;
public class SQRService {
    public int calc(int max, int min) {

        int amountSQR = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i < max) {
                if (i * i > min) {
                    amountSQR++;
                }
            }
        }
        return amountSQR;
    }
}