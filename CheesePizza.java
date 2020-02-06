package Patterns.FabricaAbstractPizza;

public class CheesePizza extends Pizza {

    PizzalngredientFactory ingredientFactory;

    public CheesePizza(PizzalngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);

//        dough = ingredientFactory.createDough();
//        sauce = ingredientFactory.createSauce();

        cheese = ingredientFactory.createCheese();
    }


    }
