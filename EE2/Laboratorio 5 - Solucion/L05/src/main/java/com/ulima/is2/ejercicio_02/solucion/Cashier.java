package main.java.com.ulima.is2.ejercicio_02.solucion;

public class Cashier {
    private PaymentStrategy strategy;

    // Permite cambiar dinámicamente la estrategia de pago
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            System.out.println("Método de pago no válido o no configurado");
        }
    }
}
