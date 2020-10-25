package co.edu.unicauca.builder;

/**
 * Ciente main
 *
 * @author Libardo, Julio
 */
public class ClientMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DishDirector director = new DishDirector();
        DishBuilder orientalBuilder = new OrientalDishBuilder();
        director.setDishBuilder(orientalBuilder);
        director.buildDish();
        Dish dish = director.getDish();
        System.out.println("Oriental dish:" + dish);
        System.out.println("Sus partes: " + dish.getParts().toString());
        System.out.println("Precio de las partes: " + dish.calculatePriceParts());
        
        DishBuilder ItalianBuilder = new ItalianDishBuilder();
        director.setDishBuilder(ItalianBuilder);
        director.buildDish();
        dish = director.getDish();
        System.out.println("Italian dish:" + dish);
        System.out.println("Sus partes: " + dish.getParts().toString());
        System.out.println("Precio de las partes: " + dish.calculatePriceParts());
        
    }

  /*  Cocina cocina = new Cocina();
 PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
 cocina.setPizzaBuilder(hawai_pizzabuilder);
 cocina.construirPizza();
 Pizza pizza = cocina.getPizza();
 Console.WriteLine("Pizza:" + pizza);
 PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();
 cocina.setPizzaBuilder(picante_pizzabuilder);
 cocina.construirPizza();
 pizza = cocina.getPizza();
 Console.WriteLine("Pizza:" + pizza);
 Console.ReadKey();*/

}
