package DemoApplication;

import java.util.stream.Stream;

public enum EPaymentMethod {
    BKASH(1),
    MASTER_CARD(2);

    int paymentMethodType;
    EPaymentMethod(int i){
        this.paymentMethodType=i;

    }
 static public EPaymentMethod getValue(int i){
      return Stream.of(EPaymentMethod.values()).filter(x->x.paymentMethodType==i).findFirst().get();
    }
}
