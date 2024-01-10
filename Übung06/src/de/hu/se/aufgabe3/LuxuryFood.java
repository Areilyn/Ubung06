package de.hu.se.aufgabe3;

public class LuxuryFood extends ShoppingItem {

	public LuxuryFood(double price) {
		super(price);
	}

	@Override
	public double acceptVisitor(Visitor v) {
		return v.visitLuxuryFood(this);
	}

}