package com.company;

import java.util.Scanner;

/**
 * Created by Mateusz Kuczyński on 16.07.2017.
 */
public class zad6petle {
    public static void main(String[] args) {

        int i = 0;
        int number;
        do {
            System.out.println("Podaj liczbę: ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            i = i + number;
            System.out.println("Suma to: "+i);

        }
        while (i<31);
            System.out.println("OK");
        }
    }

