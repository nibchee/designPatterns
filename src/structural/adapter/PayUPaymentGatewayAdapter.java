package structural.adapter;

import structural.adapter.payumoney.PayUGateway;
import structural.adapter.payumoney.PayUPaymentStatus;

public class PayUPaymentGatewayAdapter implements PaymentGateway {

    PayUGateway payUGateway = new PayUGateway();

    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        Long credit = Long.parseLong(cardNumber);
        Long cvv1 = (long) cvv;
        Long expiry = Long.parseLong(String.valueOf(expiryMonth + expiryYear));
        String answer = payUGateway.makeCCPayment(credit, cvv1, expiry);
        return Long.parseLong(answer);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        if (payUGateway.checkPaymentStatus(id.toString()) == PayUPaymentStatus.SUCCESS)
            return PaymentStatus.SUCCESS;
        return PaymentStatus.FAILURE;
    }
}
