package structural.adapter.razorpay;

public class RazorPayGateway {
    public String payByCreditCard(String creditCard,
                                  String cvv,
                                  String expiry) {
        System.out.println("Payment Done by RazorPay");
        return "123";
    }

    public boolean checkPaymentStatus(String id) {
        return false;
    }
}
