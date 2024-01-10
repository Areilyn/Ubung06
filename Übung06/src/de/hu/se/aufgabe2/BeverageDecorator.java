package de.hu.se.aufgabe2;

public class BeverageDecorator extends Beverage {

    protected Beverage wrappedBeverage;

    public BeverageDecorator(Beverage b) {
        this.wrappedBeverage = b;
    }

    @Override
    public double costs() {
        return wrappedBeverage.costs();
    }
}
