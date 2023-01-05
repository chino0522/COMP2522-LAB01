package org.bcit.comp2522.labs.lab01;

public class Main {

    public int factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.factorial(5));
        System.out.println("Hello World");
        System.out.println("Hello 2522");
    }
}
