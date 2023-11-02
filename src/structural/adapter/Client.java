package structural.adapter;

public class Client {
    public static void main(String[] args) {
        FlipKart flipKart = new FlipKart(new RazorPayPaymentGatewayAdapter());
    }
}
