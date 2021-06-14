package DemoApplication;

import DemoApplication.details.BkashPaymentDetails;
import DemoApplication.details.IPaymentDetails;
import DemoApplication.details.MasterCardPaymentDetails;

import java.util.Scanner;

public class Application extends AbstractPaymentProcessor{
    @Override
    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select payment method");
        System.out.println("1=Bkash");
        System.out.println("2=MasterCard");
        int i=scanner.nextInt();
        IPaymentDetails paymentDetails;

        switch (i){
            case 1:
                System.out.println("Enter fromMobileNo");
                String fromMobileNo = scanner.next();
                System.out.println("Enter toMobileNo");
                String toMobileNo = scanner.next();
                System.out.println("Enter pin");
                String pin = scanner.next();
                paymentDetails = new BkashPaymentDetails(fromMobileNo, toMobileNo, pin);
                break;
            default:
                System.out.println("Enter fromCardNo");
                String fromCardNo = scanner.next();
                System.out.println("Enter toAccountNo");
                String toAccountNo = scanner.next();
                System.out.println("Enter expireDate");
                String expireDate = scanner.next();
                System.out.println("Enter cvv");
                String cvv = scanner.next();
                paymentDetails = new MasterCardPaymentDetails(fromCardNo, toAccountNo, expireDate, cvv);
                break;

        }
        this.setPaymentDetails(paymentDetails);
        this.process(i);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }
}
