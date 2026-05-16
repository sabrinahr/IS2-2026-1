package com.ulima.is2.ejercicio_01.solución;

public class Main {
    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen();

        Waiter waiter = new Waiter();

        Command mainDish = new MainDishCommand(kitchen, new String[]{"Pollo", "papas"}, 25);
        waiter.setCommand(mainDish);
        waiter.executeOrder();
        System.out.println("-----------------------------------");

        Command hotDrink = new HotDrinkCommand(kitchen, "Café", 70);
        waiter.setCommand(hotDrink);
        waiter.executeOrder();
        System.out.println("-----------------------------------");

        Command dessert = new DessertCommand(kitchen, "Cheesecake", "Fresas");
        waiter.setCommand(dessert);
        waiter.executeOrder();
    }
}
