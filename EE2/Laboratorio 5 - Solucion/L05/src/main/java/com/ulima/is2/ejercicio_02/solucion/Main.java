package main.java.com.ulima.is2.ejercicio_02.solucion;

public class Main {

    public static void main(String[] args) {
        Cashier cashier = new Cashier();

        // 1. Procesar pago con Efectivo
        cashier.setStrategy(new CashPayment());
        cashier.processPayment(150);
        System.out.println("-----------------------------------");

        // 2. Procesar pago con Tarjeta
        cashier.setStrategy(new CardPayment());
        cashier.processPayment(320);
        System.out.println("-----------------------------------");

        // 3. Procesar pago Móvil
        cashier.setStrategy(new MobilePayment());
        cashier.processPayment(89);
    }
}
