package de.telran.homeWork5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        String y = input.nextLine();
        System.out.println(x.substring(0,2) + y.substring(2,4));

    }
}
