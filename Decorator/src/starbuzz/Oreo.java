package starbuzz;
public class Oreo extends CondimentDecorator{

    Beverage beverage;

    public Oreo(Beverage b) {
        beverage = b;
    }

    @Override
    public double cost() {
        return 0.22 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Oreo!";
    }
}
