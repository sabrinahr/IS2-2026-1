package ejercicio_03.solucion;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Pago 1: Básico ---");
        PaymentProcessor p1 = new BasicPayment();
        p1.pay(100);

        System.out.println("\n--- Pago 2: Con Logging y Descuento (Combinado dinámicamente) ---");
        PaymentProcessor p2 = new LoggingDecorator(new DiscountDecorator(new BasicPayment()));
        p2.pay(100);

        System.out.println("\n--- Pago 3: Todo junto (Fraude + Logging + Descuento) ---");
        PaymentProcessor p3 = new FraudCheckDecorator(
                                new LoggingDecorator(
                                    new DiscountDecorator(new BasicPayment())
                                )
                              );
        p3.pay(1500);
    }
}