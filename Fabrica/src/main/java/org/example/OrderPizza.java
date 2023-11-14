package org.example;

public class OrderPizza {
    private final PizzaFactory pizzaFactory;
   public OrderPizza(PizzaFactory pizzaFactory) {
       this.pizzaFactory = pizzaFactory;
   }

   public Pizza orderPizza(EnumPizza type) {
       Pizza pizza = PizzaFactory.createPizza(type);
       pizza.rollingOutPizza();
       pizza.fillingPizza();
       pizza.bakingPizza();

       System.out.println("Ваша пицца сэр!");

       return pizza;
   }
}
