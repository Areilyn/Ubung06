package de.hu.se.aufgabe3;

public abstract class ShoppingItem {

	private double price;

	public ShoppingItem(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract double acceptVisitor(Visitor v);
}