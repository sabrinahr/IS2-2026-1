package ejercicio_02.solucion;

import ejercicio_02.problema.*;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        //PAYPAL
        PaymentProcessor paypal = new PayPalAdapter(new PayPalAPI());
        service.processPayment(paypal, 100);

        //STRIPE
        PaymentProcessor stripe = new StripeAdapter(new StripeAPI());
        service.processPayment(stripe, 200);

        //MERCADOPAGO
        PaymentProcessor mp = new MercadoPagoAdapter(new MercadoPagoAPI());
        service.processPayment(mp, 300);
    }
}