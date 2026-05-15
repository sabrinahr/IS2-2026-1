package ejercicio_02.solucion;
import ejercicio_02.problema.MercadoPagoAPI;

public class MercadoPagoAdapter implements PaymentProcessor {
    private MercadoPagoAPI mercadoPagoAPI;

    public MercadoPagoAdapter(MercadoPagoAPI mercadoPagoAPI) {
        this.mercadoPagoAPI = mercadoPagoAPI;
    }

    @Override
    public void pay(double amount) {
        // Traduce a pagar de la API original [cite: 13]
        this.mercadoPagoAPI.pagar(amount);
    }
}