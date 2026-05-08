package ejercicio_03.solucion;

public class DiscountDecorator extends PaymentDecorator {
    private double discountRate = 0.9; // 10% de descuento

    public DiscountDecorator(PaymentProcessor wrapped) {
        super(wrapped);
    }

    @Override
    public void pay(double amount) {
        double discountedAmount = amount * discountRate;
        System.out.print("(Aplicando descuento) ");
        super.pay(discountedAmount);
    }
}