package simple_factory;

import simple_factory.Coffee;
import simple_factory.CoffeeStore;

public class Clinet1 {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
