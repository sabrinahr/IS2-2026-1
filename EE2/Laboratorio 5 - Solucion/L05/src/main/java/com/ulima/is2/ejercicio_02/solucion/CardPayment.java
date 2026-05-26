package main.java.com.ulima.is2.ejercicio_02.solucion;
public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Procesando pago con tarjeta");
        System.out.println("Validando tarjeta...");
        System.out.println("Conectando con el banco...");
    }
}
