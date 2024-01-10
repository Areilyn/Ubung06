package de.hu.se.aufgabe2;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf Coffee";
	}
 
	@Override 
	public double costs() {
		return 1.20;
	}
}