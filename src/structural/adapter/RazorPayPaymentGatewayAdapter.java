package structural.adapter;

import structural.adapter.razorpay.RazorPayGateway;

public class RazorPayPaymentGatewayAdapter implements PaymentGateway {
    private RazorPayGateway razorPayGateway = new RazorPayGateway();

    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String cvvString = String.valueOf(cvv);
        String expiry = String.valueOf(expiryMonth) + "/" + String.valueOf(expiryYear);
        String answer = razorPayGateway.payByCreditCard(cardNumber, cvvString, expiry);
        return Long.parseLong(answer);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        boolean status = razorPayGateway.checkPaymentStatus(String.valueOf(id));
        if (status == true) {
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }
}
