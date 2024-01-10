package de.hu.se.aufgabe3;

public class Food extends ShoppingItem {

	public Food(double price) {
		super(price);
	}

	@Override
	public double acceptVisitor(Visitor v) {
		return v.visitFood(this);
	}
} 