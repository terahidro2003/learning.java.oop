package learning.java.CoffeeMachines;

import learning.java.Bean;

public class AdvancedCoffeeMachine extends BasicCoffeeMachine{

    private String owner;

    public AdvancedCoffeeMachine(String name, String owner) {
        super(name);
        this.owner = owner;
    }

    public void brewCoffee(Bean bean, String coffeeType) {
        System.out.println("Made custom " + coffeeType + " for you!");
        super.brewCoffee(bean);
    }
}
