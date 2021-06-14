package DemoApplication.details;

public class MasterCardPaymentDetails implements IPaymentDetails{
    String fromAccountNo;
    String toAccountNo;
    String expirationDate;
    String cvv;

    public String getFromAccountNo() {
        return fromAccountNo;
    }

    public void setFromAccountNo(String fromAccountNo) {
        this.fromAccountNo = fromAccountNo;
    }

    public String getToAccountNo() {
        return toAccountNo;
    }

    public void setToAccountNo(String toAccountNo) {
        this.toAccountNo = toAccountNo;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "MasterCardPaymentDetails{" +
                "fromAccountNo='" + fromAccountNo + '\'' +
                ", toAccountNo='" + toAccountNo + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }

    public MasterCardPaymentDetails(String fromAccountNo, String toAccountNo, String expirationDate, String cvv) {
        this.fromAccountNo = fromAccountNo;
        this.toAccountNo = toAccountNo;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }
}
