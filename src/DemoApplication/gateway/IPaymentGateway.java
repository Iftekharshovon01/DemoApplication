package DemoApplication.gateway;

import DemoApplication.EPaymentMethod;
import DemoApplication.details.IPaymentDetails;
import DemoApplication.processor.IPaymentProcessor;

public interface IPaymentGateway {
    IPaymentGateway withPaymentMethod(EPaymentMethod ePaymentMethod);

   IPaymentProcessor withPaymentDetails(IPaymentDetails paymentDetails);
}