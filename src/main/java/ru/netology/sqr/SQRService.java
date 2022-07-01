package ru.netology.sqr;

public class SQRService {
    public int calcAmountSqr(int min, int max) {
        int amount = 0; //  счетчик

        for (int i = 10; i <= 99; i++) {
            if (min > 99 * 99 || max < 10 * 10) {
                break;                    // прерываю цикл, чтобы исключить бесполезные итерации
            } else {
                if (i * i >= min && i * i <= max) {
                    amount++;
                }
            }
        }
        return amount;
    }
}


