package Patterns.FabricaAbstractPizza;

public class ClamPizza extends Pizza {

    PizzalngredientFactory ingredientFactory;

    public ClamPizza(PizzalngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
            System.out.println("Preparing " + name);
//            dough = ingredientFactory.createDough();
//            sauce = ingredientFactory.createSauce();
             cheese = ingredientFactory.createCheese();
             clam = ingredientFactory.createClam();
        }


    }
