package DemoApplication.gateway;

import DemoApplication.EPaymentMethod;
import DemoApplication.details.IPaymentDetails;
import DemoApplication.processor.IPaymentProcessor;

public class PaymentGateway implements IPaymentGateway{
    IPaymentGateway currentPaymentGateway;
    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod ePaymentMethod) {
        switch (ePaymentMethod){
            case BKASH:
                return currentPaymentGateway = new BkashPaymentGateway();
            case MASTER_CARD:
                return currentPaymentGateway = new MasterCardPaymentGateway();
            default:
                throw new RuntimeException("Invalid Payment Gateway");
        }


    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails paymentDetails) {
        if (currentPaymentGateway != null){
            return this.currentPaymentGateway.withPaymentDetails(paymentDetails);
        }
        else {
            throw new RuntimeException("Invalid Payment Details");
        }
    }
}
