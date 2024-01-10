package de.hu.se.aufgabe2;

public class SoyMilkDecorator extends BeverageDecorator {
    public SoyMilkDecorator(Beverage b) {
        super(b);
    }

    @Override
    public String getDescription() {
        return wrappedBeverage.getDescription() + "\nAdded \"Soy Milk\" for 0.20";
    }

    @Override
    public double costs() {
        return super.costs() + 0.20;
    }
}
