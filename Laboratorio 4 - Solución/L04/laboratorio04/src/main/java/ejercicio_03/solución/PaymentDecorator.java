// PaymentDecorator.java
package ejercicio_03.solucion;

public abstract class PaymentDecorator implements PaymentProcessor {
    protected PaymentProcessor wrapped;

    public PaymentDecorator(PaymentProcessor wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void pay(double amount) {
        wrapped.pay(amount);
    }
}