package ejercicio_03.solucion;

public class FraudCheckDecorator extends PaymentDecorator {
    public FraudCheckDecorator(PaymentProcessor wrapped) {
        super(wrapped);
    }

    @Override
    public void pay(double amount) {
        if (amount > 1000) {
            System.out.println("⚠ Revisando posible fraude para monto: " + amount);
        }
        super.pay(amount);
    }
}