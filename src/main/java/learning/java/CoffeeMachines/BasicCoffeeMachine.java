package learning.java.CoffeeMachines;

import learning.java.Bean;

import java.util.Set;

public class BasicCoffeeMachine {
    private String name;

    public BasicCoffeeMachine(String name)
    {
        this.name = name;
    }

    public void brewCoffee(Bean bean)
    {
        System.out.println("Brewed basic coffee with bean type of" + bean.getType() + "[" + bean.getStrength() + "]");
    }
}
