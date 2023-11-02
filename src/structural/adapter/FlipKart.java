package structural.adapter;

public class FlipKart {
    private PaymentGateway paymentGateway;

    public FlipKart(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePaymentViaCC(String cardNumber,
                                 int cvv,
                                 int expiryMonth,
                                 int expiryYear) {
        Long transactionId = paymentGateway.payViaCC(cardNumber,
                cvv,
                expiryMonth,
                expiryYear);

        while (!paymentGateway.getStatus(transactionId).equals(PaymentStatus.SUCCESS)) {

        }
    }
}
