import ejercicio_01.solución.NotificationService;
import ejercicio_01.solución.PaymentGateaway;
import ejercicio_01.solución.PaymentValidator;

public class PaymentGateway {
    public void process(double amount) {
        System.out.println("Procesando pago de: " + amount);
    }
}