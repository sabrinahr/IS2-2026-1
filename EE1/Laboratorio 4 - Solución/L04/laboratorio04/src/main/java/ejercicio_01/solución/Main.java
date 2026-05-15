package ejercicio_01.solución;
import ejercicio_01.solución.PaymentValidator;
import ejercicio_01.solución.PaymentGateaway;
import ejercicio_01.solución.NotificationService;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== PRUEBA FACADE ===");
        PaymentFacade facade = new PaymentFacade();
        
        facade.pay(100);    
        facade.pay(1500);   
        facade.pay(-10);    
        
    }
}