package Patterns.FabricaAbstractPizza;

public class VeggiePizza extends Pizza{
    PizzalngredientFactory ingredientFactory;

    public VeggiePizza(PizzalngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
//        dough = ingredientFactory.createDough();
//        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }


}
