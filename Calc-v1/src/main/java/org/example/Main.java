package org.example;

import java.util.Scanner;

public class Main {

    private static void calculateFractionResult(Fraction firstFraction, Fraction secondFraction, String sign) {
        switch (sign) {
            case ("+"):
                Fraction.sum(firstFraction, secondFraction);
                break;
            case("-"):
                Fraction.diff(firstFraction, secondFraction);
                break;
            case ("*"):
                Fraction.mul(firstFraction, secondFraction);
                break;
            case ("/"):
                Fraction.div(firstFraction, secondFraction);
                break;
            default:
                System.out.println("Вы ввели неправильный знак");
                break;
        }
    }
    public static void main(String[] args) {
        String sign, str;
        Scanner in = new Scanner(System.in);
        String[] firstValue, secondValue, data = new String[0];
        try {
            if (args.length != 0) {
                firstValue = args[0].split("/");
                sign = args[1];
                secondValue = args[2].split("/");
            } else {
                str = in.nextLine();
                data = str.split(" ");
                firstValue = data[0].split("/");
                sign = data[1];
                secondValue = data[2].split("/");
            }
            if (firstValue.length == 1) firstValue = new String[]{firstValue[0], "1"};
            if (secondValue.length == 1) secondValue = new String[]{secondValue[0], "1"};
            if (firstValue[1].equals("0") || secondValue[1].equals("0")) throw new ArrayIndexOutOfBoundsException();
            Fraction firstFraction = new Fraction(Integer.parseInt(firstValue[0]), Integer.parseInt(firstValue[1]));
            Fraction secondFraction = new Fraction(Integer.parseInt(secondValue[0]), Integer.parseInt(secondValue[1]));
            calculateFractionResult(firstFraction, secondFraction, sign);
        } catch(ArrayIndexOutOfBoundsException err) {
            System.out.println("Ваш ввод ошибочный!");
        }
    }
}