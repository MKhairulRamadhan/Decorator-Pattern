package starbuzz;
public class StarbuzzCoffee {

    public static void main(String args[]) {
      
        // ini single espresso
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        // ini double esspresso
        beverage = new Espresso(beverage);
        System.out.println("Double " + beverage.getDescription()
                + " $" + beverage.cost());


        // ini triple espresso
        beverage = new Espresso(beverage);
        System.out.println("Triple " + beverage.getDescription()
                + " $" + beverage.cost()); 



        // single espresso with milk
        Beverage beverage2 = new Espresso();
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        // double espresso with double milk
        beverage2 = new Espresso();
        beverage2 = new Milk(beverage2);
        System.out.println("Double " + beverage2.getDescription()
                + " $" + beverage2.cost()); 


        // single espresso dengan whip dan milk
        Beverage beverage3 = new Espresso();
        beverage3 = new Milk(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost()); 

        // single espresso dengan whip dan milk
        Beverage beverage4 = new Espresso();
        beverage4 = new Milk(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4 = new Oreo(beverage4);

        System.out.println(beverage4.getDescription()
                + " $" + beverage4.cost()); 
    }
}
