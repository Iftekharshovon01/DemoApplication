package DemoApplication.processor;

import DemoApplication.details.IPaymentDetails;

public class MasterCardPaymentProcessor implements IPaymentProcessor{

    private final IPaymentDetails paymentDetails;

    public MasterCardPaymentProcessor(IPaymentDetails paymentDetails) {
        this.paymentDetails=paymentDetails;
    }

    @Override
    public void process() {
        System.out.println("MasterCard Payment Successfull");
        System.out.println(paymentDetails.toString());
    }
}
