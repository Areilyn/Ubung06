package de.hu.se.aufgabe3;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, int[]> foodTaxMap = new HashMap<>();

        foodTaxMap.put("Germany", new int[]{7, 19});
        foodTaxMap.put("Italy", new int[]{10, 22});

        System.out.println("Welcome to the tax inclusive price calculator! Please type your country to get started.");
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        if (!foodTaxMap.containsKey(country)) {
            int foodTax;
            int luxuryFoodTax;
            System.out.println("Country not found! Redirecting to manual tax rate entry...");
            System.out.println("Food Tax Rate: ");

            while (true) {
                try {
                    foodTax = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please try again.");
                    scanner.nextLine();
                    continue;
                }
                break;
            }

            System.out.println("Luxury Food Tax Rate: ");

            while (true) {
                try {
                    luxuryFoodTax = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please try again.");
                    scanner.nextLine();
                    continue;
                }
                break;
            }
            foodTaxMap.put(country, new int[]{foodTax, luxuryFoodTax});
        }

        ShoppingCart cart = new ShoppingCart();

        System.out.println("Please enter the net prices of the food items one by one. " +
                "The program will skip to the next step when you enter an input other than a positive number.");
        while (true) {
            try {
                double price = scanner.nextDouble();
                if (price > 0) {
                    cart.addItem(new Food(price));
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Input complete. Skipping to the next step...");
                scanner.nextLine();
                break;
            }
        }

        System.out.println("Please enter the net prices of the luxury food items one by one. " +
                "The program will skip to the next step when you enter an input other than a positive number.");
        while (true) {
            try {
                double price = scanner.nextDouble();
                if (price > 0) {
                    cart.addItem(new LuxuryFood(price));
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Input complete. Skipping to the next step...");
                scanner.nextLine();
                break;
            }
        }

        Visitor v = new CartVisitor();
        System.out.println("\nTotal amount (tax inclusive): " + v.calculateTotal(cart.getItems(),
                foodTaxMap.get(country)[0], foodTaxMap.get(country)[1]));
    }
}
