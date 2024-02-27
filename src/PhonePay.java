public class PhonePay implements SwiggyPayment {
    int accountBalance =10000;
    int remaingBal;
    public String swiggypayment(Coupons coupons, String nextProcess){

        if (nextProcess.equals("confirm")){

            remaingBal=accountBalance- coupons.amount;

            System.out.println("payed amount :  " + coupons.amount +
                    "  payment successful remaining amount : " + remaingBal );
        }
        else{

            System.out.println("your cancellation is sucessfull");

            int newaccountBalance = remaingBal + coupons.amount;

            System.out.println("your total amount  : " +newaccountBalance);
        }
        return "insufficient  balance";
    }
 }