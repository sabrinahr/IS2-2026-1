package ejercicio_03.solución;

public class LoggingDecorator extends PaymentDecorator {
    public LoggingDecorator(PaymentProcessor wrapped) {
        super(wrapped);
    }

    @Override
    public void pay(double amount) {
        System.out.println("[LOG] Iniciando pago...");
        super.pay(amount);
        System.out.println("[LOG] Pago completado");
    }
}