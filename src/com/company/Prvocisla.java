package com.company;

import java.util.Scanner;

public class Prvocisla {

    public static void main(String[] args) {
        Scanner cislo = new Scanner(System.in);
        System.out.println("Enter number:");
        int MyCislo = cislo.nextInt();
        for (int j = 2; j <= MyCislo; j++) {
            boolean simple = false;

            for (int i = 2; i * i <= j; i++) {
                simple = (j % i == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.println(j + " ");
            }
        }
    }
}
