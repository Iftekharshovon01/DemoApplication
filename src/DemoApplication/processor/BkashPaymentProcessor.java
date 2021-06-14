package DemoApplication.processor;

import DemoApplication.details.IPaymentDetails;

public class BkashPaymentProcessor implements IPaymentProcessor{
    private final IPaymentDetails paymentDetails;

    public BkashPaymentProcessor(IPaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @Override
    public void process() {
        System.out.println("Bkash Payment Successfull");
        System.out.println(paymentDetails.toString());
    }
}
