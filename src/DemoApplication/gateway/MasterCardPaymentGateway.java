package DemoApplication.gateway;

import DemoApplication.EPaymentMethod;
import DemoApplication.details.IPaymentDetails;
import DemoApplication.processor.IPaymentProcessor;
import DemoApplication.processor.MasterCardPaymentProcessor;

public class MasterCardPaymentGateway implements IPaymentGateway{
    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod ePaymentMethod) {
        System.out.println("MasterCardPaymentGateway Selected");
        return this;
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails paymentDetails) {
        return new MasterCardPaymentProcessor(paymentDetails);
    }
}
