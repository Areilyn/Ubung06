package de.hu.se.aufgabe2;

public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage b) {
        super(b);
    }

    @Override
    public String getDescription() {
        return wrappedBeverage.getDescription() + "\nAdded \"Sugar\" for 0.10";
    }

    @Override
    public double costs() {
        return super.costs() + 0.10;
    }
}
