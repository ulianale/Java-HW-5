package ru.netology.sqr;

public class SQRService {
    public int calcAmountSqr(int x, int y) {
        int amount = 0; //  счетчик

        for (int i = 10; i <= 99; i++) {
            if (i * i >= x) {
                if (i * i <= y) {
                    amount++;
                } else {
                    break;
                }
            }
        }
        return amount;

    }
}
