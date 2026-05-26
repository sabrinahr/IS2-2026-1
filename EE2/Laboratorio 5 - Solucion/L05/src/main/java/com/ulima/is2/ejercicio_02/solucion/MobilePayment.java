package main.java.com.ulima.is2.ejercicio_02.solucion;

public class MobilePayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Procesando pago móvil");
        System.out.println("Validando aplicación...");
        System.out.println("Verificando número telefónico...");
    }
}
