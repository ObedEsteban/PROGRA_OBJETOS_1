import Pizzas.*;
import java.util.ArrayList;
import java.util.List;

public class Main { public static void main(String[] args) {
    List<String> ingredientesBase = new ArrayList<>();
    ingredientesBase.add("queso");
    ingredientesBase.add("tomate");

    Pizza pizza1 = new Pizza("Peperonny", 10.99, ingredientesBase);
    pizza1.preparar();
    System.out.println(pizza1);

    List<String> ingredientesItaliana = new ArrayList<>(ingredientesBase);
    PizzaItaliana pizzaItaliana = new PizzaItaliana("Italiana Especial", 14.99, ingredientesItaliana, "tomate", 15);
    pizzaItaliana.preparar();
    System.out.println(pizzaItaliana);

    Topping toppingExtra = new Topping("champiñones");
    toppingExtra.agregar(pizzaItaliana);
    System.out.println(pizzaItaliana);
}
}
