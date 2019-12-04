package starbuzz;
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
        cost = 1.99;
    }

    public Espresso(Beverage data){
        description = "Espresso";
        cost = 1.99;
    	cost += data.cost();
    }

    public double cost() {

        return cost;
    }
}
