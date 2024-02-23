

public class PhonePay implements SwiggyPayment {

    private int accountBalance;

    public PhonePay(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String swiggypayment(int orderAmount) {
        if (accountBalance >= orderAmount) {
            int remainBal = accountBalance - orderAmount;
            accountBalance = remainBal;
            return "Payment successful. Remaining amount: " + remainBal;
        } else {
            return "Insufficient balance";
        }
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String cancelOrder(int orderAmount) {
        if (accountBalance >= orderAmount) {
            accountBalance += orderAmount;
            return "Order cancelled. Refund successful. New balance: " + accountBalance;
        } else {
            return "Insufficient balance for refund";
        }
    }
}