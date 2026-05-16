package com.ulima.is2.ejercicio_01.solucion;

public class MainDishCommand implements Command {
    private Kitchen kitchen;
    private String[] ingredients;
    private int time;

    public MainDishCommand(Kitchen kitchen, String[] ingredients, int time) {
        this.kitchen = kitchen;
        this.ingredients = ingredients;
        this.time = time;
    }

    @Override
    public void execute() {
        kitchen.cookMainDish(ingredients, time);
    }
}