package main.java.com.ulima.is2.ejercicio_02.solucion;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Procesando pago en efectivo");
        System.out.println("Monto recibido: S/ " + amount);
        System.out.println("Calculando cambio...");
    }
}