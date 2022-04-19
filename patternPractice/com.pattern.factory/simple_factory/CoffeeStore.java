package simple_factory;

public class CoffeeStore {

    public Coffee orderCoffee(String  type){
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        //调用咖啡的方法
        Coffee coffee = factory.createCoffee(type);
        coffee.addsugar();
        coffee.addMilk();
        return null;
    }
}
