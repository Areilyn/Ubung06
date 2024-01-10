package de.hu.se.aufgabe3;

import com.sun.javafx.UnmodifiableArrayList;

import java.util.Collection;

public interface Visitor {
    public double visitFood(Food f);
    public double visitLuxuryFood(LuxuryFood f);
    public double calculateTotal(Collection<ShoppingItem> items, int foodT, int luxuryFoodT);
}
