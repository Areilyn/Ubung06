package de.hu.se.aufgabe2;

public class CreamDecorator extends BeverageDecorator {
    public CreamDecorator(Beverage b) {
        super(b);
    }

    @Override
    public String getDescription() {
        return wrappedBeverage.getDescription() + "\nAdded \"Cream\" for 0.30";
    }

    @Override
    public double costs() {
        return super.costs() + 0.30;
    }
}
