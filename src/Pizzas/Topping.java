
package Pizzas;

import java.util.List;

public class Topping {
    private String nombre;

    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Pizza pizza) {
        pizza.getIngredientes().add(nombre);
        System.out.println("Agregando topping: " + nombre + " a la pizza " + pizza.getNombre());
    }
}

