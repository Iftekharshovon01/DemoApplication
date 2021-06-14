package DemoApplication.gateway;

import DemoApplication.AbstractPaymentProcessor;
import DemoApplication.EPaymentMethod;
import DemoApplication.details.IPaymentDetails;
import DemoApplication.processor.BkashPaymentProcessor;
import DemoApplication.processor.IPaymentProcessor;

public class BkashPaymentGateway implements IPaymentGateway{

    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod ePaymentMethod) {
        System.out.println("BkashPaymentGateway selected");
        return this;
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails paymentDetails) {
        return new BkashPaymentProcessor(paymentDetails);
    }
}
