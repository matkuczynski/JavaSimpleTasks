package com.company;

import java.util.Scanner;

/**
 * Created by Mateusz Kuczyński on 16.07.2017.
 */
public class zad3podstawy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę a ");
        int a = scanner.nextInt();
        System.out.println("Wprowadź liczbę b ");
        int b = scanner.nextInt();
        System.out.println("Suma liczb a i b to: "+(a + b));
        if (a!=b) {
            System.out.println("Różnica liczb a i b to: " + (a - b));
        }
        else {
            System.out.println(a);
        }
        System.out.println("Iloczyn liczb a i b to: "+a * b);
        if (b != 0) {
            System.out.println("Iloraz liczb a i b to: "+a / b);
        } else {
            System.out.println("Nie dziel przez zero");
        }
        if (b!=0) {
            System.out.println("Reszta z dzielenia liczby " + a + " przez " + b + " to: " + a % b);
        }
        else {
            System.out.println("Reszta z dzielenia liczby "+a+" przez "+b+" to: "+a);
        }
        if (a > b) {
            System.out.println("Liczba a jest większa od b");
        } else if (a < b) {
            System.out.println("Liczba b jest większa od a");
        } else {
            System.out.println("Liczby a i b są równe");
        }


    }
}
