public class PhonePay implements SwiggyPayment {

    @Override
    public String swiggypayment(int fromAccount, int orderAmount) {
        if (fromAccount >= orderAmount) {
            int remainBal=fromAccount-orderAmount;
            System.out.println(remainBal);

            return "Order successful";
        } else {
            return "Ins ufficient balance";
        }
    }
}



