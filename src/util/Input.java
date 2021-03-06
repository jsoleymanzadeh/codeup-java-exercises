package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        return yesNo();
    }

    public boolean yesNo() {
        return getString().startsWith("y");
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return getInt(1, 10);
    }

    public int getInt(int min, int max) {
        int userInput = getInt();
        if (userInput < min || userInput > max) {
            System.out.print("Try again: ");
            return getInt(min, max);
        }
        return userInput;
    }

    public int getInt() {
        return Integer.parseInt(getString());
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return getDouble(0, 1);
    }

    public double getDouble(double min, double max) {
        double userInput = getDouble();
        if (userInput < min || userInput > max) {
            System.out.print("Try again: ");
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble() {
        return Double.parseDouble(getString());
    }

    public int getBinary() {
        return Integer.valueOf(getString(), 2);
    }

    public int getHex() {
        return Integer.valueOf(getString(), 16);
    }
}