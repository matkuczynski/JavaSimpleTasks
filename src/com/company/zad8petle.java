package com.company;

/**
 * Created by Mateusz Kuczyński on 16.07.2017.
 */
public class zad8petle {
    public static void main(String[] args) {

        pierwsza:
        for (int i = 10; i <= 30; i++) {
            System.out.println("Pierwsza: " + i);
            druga:
            for (int j = 1; j <= 10; j++) {
                System.out.println("Druga: " + j);

                if (i == 15 && j == 3) {
                    break pierwsza;
                }
            }
        }
    }
}
