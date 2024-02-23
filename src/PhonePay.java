

public class PhonePay implements SwiggyPayment {

    @Override
    public String swiggypayment(int orderAmount) {
        if (accountBalance >= orderAmount) {
            int remainBal = accountBalance - orderAmount;
            return "Payment successful. Remaining amount: " + remainBal;
        } else {
            return "Insufficient balance";
        }
    }
}