package com.company;

import java.util.Scanner;

/**
 * Created by Mateusz Kuczyński on 16.07.2017.
 */
public class zad7bpetle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String k = "*";
        for (int i = 1; i<=n; i++){
            System.out.println(k);
            k = k+"*";
        }
    }
}
