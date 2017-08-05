package com.company;
import java.util.Random;

/**
 * Created by Mateusz Kuczyński on 16.07.2017.
 */
public class zad3petle {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i=1; i<=10; i++){
            int n = random.nextInt(5);
            System.out.println(n);
        }
    }
}
