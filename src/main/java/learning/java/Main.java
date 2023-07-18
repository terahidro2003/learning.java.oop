package learning.java;

import learning.java.CoffeeMachines.AdvancedCoffeeMachine;
import learning.java.CoffeeMachines.BasicCoffeeMachine;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Coffee Machinery | OOP Principles revision (Sprint #1)");

        // let's make collection of coffee beans that we will brew coffees with
        var beans = new HashSet<Bean>(Arrays.asList(
                new Bean(CoffeeTypes.EXCELSA, 0),
                new Bean(CoffeeTypes.LIBERICA, 1),
                new Bean(CoffeeTypes.LIBERICA, 2),
                new Bean(CoffeeTypes.ARABICA, 3)
        ));

        for(var bean : beans)
        {
            System.out.println("Brewing Your Coffee by accessing by superclass (nothing fancy yet)");
            var machine1 = new BasicCoffeeMachine("Coffeine");
            machine1.brewCoffee(bean);

            System.out.println("Brewing Your Coffee by accessing by subclass");
            var machine2 = new AdvancedCoffeeMachine("Coffeine", "Juozas Skarbalius");
            machine2.brewCoffee(bean, "Cappuchino");

            System.out.println("Brewing Your Coffee by accessing by referrencing superclass from subclass");
            BasicCoffeeMachine machine3 = new AdvancedCoffeeMachine("Coffeine", "Juozas Skarbalius");
            machine3.brewCoffee(bean);
        }


    }
}