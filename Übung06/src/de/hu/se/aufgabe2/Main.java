package de.hu.se.aufgabe2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Beverage b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Coffee Shop! Please pick your beverage type by typing its respective number:" +
                "\n1-) House Blend Coffee" +
                "\n2-) Decaf Coffee");

        while (true) {
            try {
                switch (scanner.nextInt()) {
                    case 1:
                        b = new Coffee();
                        break;
                    case 2:
                        b = new Decaf();
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please try again.");
                scanner.nextLine();
                continue;
            }
            System.out.println("Picked \"" + b.getDescription() + "\"");
            break;
        }

        System.out.println("\nPlease pick your additional items by typing their respective numbers. " +
                "You can pick any of the items as much as you want. Please type \"0\" when you are finished.");
        System.out.println("\n1-) Milk" +
                "\n2-) Soy Milk" +
                "\n3-) Sugar" +
                "\n4-) Cream" +
                "\n0-) DONE");

        while (true) {
            try {
                switch (scanner.nextInt()) {
                    case 0:
                        System.out.println("Redirecting to payment screen...\n");
                        System.out.println(b.getDescription());
                        System.out.println("\nTotal price: " + String.format("%.2f", b.costs()));
                        break;
                    case 1:
                        b = new MilkDecorator(b);
                        continue;
                    case 2:
                        b = new SoyMilkDecorator(b);
                        continue;
                    case 3:
                        b = new SugarDecorator(b);
                        continue;
                    case 4:
                        b = new CreamDecorator(b);
                        continue;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please try again.");
                scanner.nextLine();
                continue;
            }
            break;
        }
    }
}
