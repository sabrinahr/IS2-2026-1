package ejercicio_02.solucion;
import ejercicio_02.problema.PayPalAPI;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalAPI payPalAPI;

    public PayPalAdapter(PayPalAPI payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public void pay(double amount) {
        this.payPalAPI.sendPayment(amount);
    }
}