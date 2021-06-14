package DemoApplication;

import DemoApplication.details.IPaymentDetails;
import DemoApplication.gateway.PaymentGateway;
import DemoApplication.processor.IPaymentProcessor;

import java.util.Scanner;

public abstract class AbstractPaymentProcessor{
    IPaymentDetails iPaymentDetails;
    void setPaymentDetails(IPaymentDetails paymentDetails){
        this.iPaymentDetails = paymentDetails;
    }

    protected void process(int i) {
        EPaymentMethod ePaymentMethod = EPaymentMethod.getValue(i);
    PaymentGateway paymentGateway= new PaymentGateway();
    paymentGateway.withPaymentMethod(ePaymentMethod).withPaymentDetails(iPaymentDetails).process();
    }
    abstract void run();
}
