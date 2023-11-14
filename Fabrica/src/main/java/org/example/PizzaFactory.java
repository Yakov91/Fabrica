package org.example;

public class PizzaFactory {
    public static Pizza createPizza(EnumPizza type) {
        Pizza pizza = null;


        switch (type) {
            case CHICKEN:
                pizza = new Chicken();
                break;
            case HAMBYRGER:
                pizza = new Hambyrger();
                break;
            case PEPERONI:
                pizza =  new Peperoni();
                break;
            case CHEESE:
                pizza = new Cheese();
                break;
        }
        return pizza;
    }
}
