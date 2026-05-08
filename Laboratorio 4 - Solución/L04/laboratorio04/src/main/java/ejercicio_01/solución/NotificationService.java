package ejercicio_01.solución;
import ejercicio_01.solución.PaymentValidator;
import ejercicio_01.solución.PaymentGateaway;
import ejercicio_01.solución.NotificationService;

public class NotificationService {
    public void sendReceipt(double amount) {
        System.out.println("Enviando comprobante por el monto de: " + amount);
    }
}