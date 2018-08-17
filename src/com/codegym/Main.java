package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        do {
            Menu();
            System.out.println("Enter a choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    PrintRectangle();
                    break;
                }
                case 2: {
                    PrintSquareTriangle();
                    break;
                }
                case 3: {
                    PrintIsoscelesTriangle();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
            }
        } while (choice != 4);
    }

    public static void Menu() {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
    }

    public static void PrintRectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width:");
        int width = input.nextInt();
        System.out.println("Enter height:");
        int height = input.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void PrintSquareTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void PrintIsoscelesTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print("* ");
            System.out.println("");
        }
    }
}
