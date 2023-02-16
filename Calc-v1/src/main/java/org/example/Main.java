package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sign = "";
        int firstNumber = 0, secondNumber = 0;
        try {
            Scanner in = new Scanner(System.in);
            firstNumber = in.nextInt();
            sign = in.next();
            secondNumber = in.nextInt();
        } catch (InputMismatchException error) {
            System.out.println("Неверный формат числа");
            return;
        }
        switch (sign) {
            case ("+"):
                System.out.println(firstNumber + secondNumber);
                break;
            case("-"):
                System.out.println(firstNumber - secondNumber);
                break;
            case ("*"):
                System.out.println(firstNumber * secondNumber);
                break;
            case ("/"):
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Вы ввели неправильный знак");
                break;
        }
    }
}