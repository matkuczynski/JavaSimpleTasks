package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by Mateusz Kuczyński on 16.07.2017.
 */
public class zad5podstawy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        double a = scanner.nextDouble();
        double b = sqrt(a);
        if (a >= 0) {
            System.out.println("Pierwiastek kwadratowy z liczby " + a + " to: " + b);
        } else {
            System.out.println("Nie istnieje pierwiastek z liczby ujemnej");
        }

    }
}
