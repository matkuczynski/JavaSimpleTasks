package com.company;

import java.util.Scanner;
import java.lang.Math;

/**
 * Created by Mateusz Kuczyński on 16.07.2017.
 */
public class zad4podstawy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a, b i h ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();
        double c;
        double d;

        System.out.println("Pole kwadratu o boku "+a+" równa się: "+a*a+", a jego obwód to: "+4*a);
        System.out.println("Pole prostokąta o bokach "+a+" i "+b+" równa się: "+a*b+", a jego obwód to: "+(a+b)*2);
        if (a>b){
            d = h*h+(a-b)*(a-b);
            System.out.println(d);
            c = Math.sqrt(d);
            System.out.println(c);
        }
        else if (b>a){
            c = Math.sqrt(h*h+(b-a)*(b-a));
        }
        else{
            c=h;
        }

        System.out.println("Pole trapezu o bokach "+a+" i "+b+" oraz wysokości "+h+" równa się: "+(a+b)*0.5*h+", a jego obwód to: "+(a+b+h+c));

    }
}
