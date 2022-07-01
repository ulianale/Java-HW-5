package ru.netology.sqr;

public class SQRService {
    public int calcAmountSqr(int x, int y) {
        int amount = 0; //  счетчик

        for (int i = 10; i <= 99; i++) {
            if (x > 99 * 99 || y < 10 * 10) {
                break;                    // прерываю цикл, чтобы исключить бесполезные итерации
            } else {
                if (i * i >= x && i * i <= y) {
                    amount++;
                }
            }
        }
        return amount;
    }
}


