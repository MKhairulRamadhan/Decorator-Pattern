package starbuzz;
public abstract class Beverage {
    String description = "Unknown Beverage";
    double cost = 0;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
