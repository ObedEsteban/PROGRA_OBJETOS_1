package Pizzas;

import java.util.List;

public class PizzaItaliana extends Pizza {
    private String salsa;
    private int tiempoHorno;

    public PizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa, int tiempoHorno) {
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
        this.tiempoHorno = tiempoHorno;
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Añadiendo la salsa " + salsa + " y horneando durante " + tiempoHorno + " minutos");
    }

    @Override
    public String toString() {
        return super.toString() + ", salsa: " + salsa + ", tiempo en horno: " + tiempoHorno + " minutos";
    }
}
