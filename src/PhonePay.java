public class PhonePay implements SwiggyPayment {
    int accountBalance =10000;
    int remaingBal = accountBalance;
    String  localnextProcess ="confirm";
    String statusCode ;
    String paymentStatus = "success";
    public String swiggypayment(Coupons coupons, String nextProcess){

        if (nextProcess.equals(localnextProcess)){

            remaingBal= accountBalance - coupons.amount;

            System.out.println("payed amount :  " + coupons.amount +

                    "  payment successful remaining amount : " + remaingBal );
        }
        else{

            System.out.println("your cancellation is successful ");

            int newAccountBalance = remaingBal + coupons.amount;

            System.out.println("your total amount  : " +newAccountBalance);
        }

        return "insufficient  balance";
    }
    public  String  paymentStatus(String nextProcess){
        if (nextProcess.equals(paymentStatus)){
            statusCode = "200";
            System.out.println(" your payment is successfully its ready to delver ");
            return statusCode;
        }else {
            statusCode = "404";
            System.out.println("your payment is failed try different method ");
        }
        return  statusCode;


        }
 }