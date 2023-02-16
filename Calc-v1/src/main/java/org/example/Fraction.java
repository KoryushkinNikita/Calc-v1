package org.example;

public class Fraction {
    int numerator;
    int denominator;

    Fraction() {
        numerator = 0;
        denominator = 0;
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static void sum(Fraction a, Fraction b) {
        int finalNumerator = (a.numerator * b.denominator + a.denominator * b.numerator);
        int finalDenumerator = a.denominator * b.denominator;
        if (finalNumerator % finalDenumerator == 0) {
            System.out.println(finalNumerator / finalDenumerator);
        }
        else {
            System.out.println(finalNumerator+ "/" + finalDenumerator );
        }
    }

    public static void diff(Fraction a, Fraction b) {
        int finalNumerator = (a.numerator * b.denominator - a.denominator * b.numerator);
        int finalDenumerator = a.denominator * b.denominator;
        if (finalNumerator % finalDenumerator == 0) {
            System.out.println(finalNumerator / finalDenumerator);
        }
        else {
            System.out.println(finalNumerator+ "/" + finalDenumerator );
        }
    }

    public static void mul(Fraction a, Fraction b) {
        int finalNumerator = (a.numerator * b.numerator);
        int finalDenumerator = a.denominator * b.denominator;
        if (finalNumerator % finalDenumerator == 0) {
            System.out.println(finalNumerator / finalDenumerator);
        }
        else {
            System.out.println(finalNumerator+ "/" + finalDenumerator );
        }
    }
    public static void div(Fraction a, Fraction b) {
        int finalNumerator = (a.numerator * b.denominator);
        int finalDenumerator = a.denominator * b.numerator;
        if (finalNumerator % finalDenumerator == 0) {
            System.out.println(finalNumerator / finalDenumerator);
        }
        else {
            System.out.println(finalNumerator+ "/" + finalDenumerator );
        }
    }
}
