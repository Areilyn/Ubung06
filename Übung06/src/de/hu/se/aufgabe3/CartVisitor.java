package de.hu.se.aufgabe3;

import java.util.Collection;

public class CartVisitor implements Visitor {

    int foodT;
    int luxuryFoodT;

    @Override
    public double calculateTotal(Collection<ShoppingItem> a, int foodT, int luxuryFoodT) {
        this.foodT = foodT;
        this.luxuryFoodT = luxuryFoodT;
        double total = 0;

        for (ShoppingItem item : a) {
            total += item.acceptVisitor(this);
        }
        return total;
    }

    @Override
    public double visitFood(Food f) {
        return (f.getPrice() * (foodT / 100.0)) + f.getPrice();
    }

    @Override
    public double visitLuxuryFood(LuxuryFood f) {
        return (f.getPrice() * (luxuryFoodT / 100.0)) + f.getPrice();
    }
}