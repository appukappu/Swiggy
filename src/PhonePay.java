public class PhonePay implements SwiggyPayment {

    @Override
    public String swiggypayment( int orderAmount) {
        if (accountBalance >= orderAmount) {
            int remainBal=accountBalance-orderAmount;
           // System.out.println(remainBal);
            System.out.println("payed amount : " +orderAmount);
            System.out.println("payment successful remaining amount : " + remainBal );
        }
        return "insufficient  balance";

    }
}



