package com.ulima.is2.ejercicio_01.solucion;

public class DessertCommand implements Command {
    private Kitchen kitchen;
    private String dessert;
    private String decoration;

    public DessertCommand(Kitchen kitchen, String dessert, String decoration) {
        this.kitchen = kitchen;
        this.dessert = dessert;
        this.decoration = decoration;
    }

    @Override
    public void execute() {
        kitchen.prepareDessert(dessert, decoration);
    }
}
