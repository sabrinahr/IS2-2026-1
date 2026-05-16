package com.ulima.is2.ejercicio_01.solución;

public class HotDrinkCommand implements Command {
    private Kitchen kitchen;
    private String drink;
    private int temperature;

    public HotDrinkCommand(Kitchen kitchen, String drink, int temperature) {
        this.kitchen = kitchen;
        this.drink = drink;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        kitchen.prepareHotDrink(drink, temperature);
    }
}
