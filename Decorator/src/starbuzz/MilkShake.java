package starbuzz;
public class MilkShake extends Beverage {
    @Override
    public String getDescription() {
        return "Milk Shake";
    }

    @Override
    public double cost() {
        return 1.25;
    }
}
