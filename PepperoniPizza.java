package Patterns.FabricaAbstractPizza;

public class PepperoniPizza extends Pizza {

    PizzalngredientFactory ingredientFactory;

    public PepperoniPizza(PizzalngredientFactory ingredientFactory) {
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
