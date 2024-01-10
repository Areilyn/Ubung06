package de.hu.se.aufgabe2;

public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage b) {
        super(b);
    }

    @Override
    public String getDescription() {
        return wrappedBeverage.getDescription() + "\nAdded \"Milk\" for 0.15";
    }

    @Override
    public double costs() {
        return super.costs() + 0.15;
    }
}
