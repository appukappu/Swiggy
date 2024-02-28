public class PhonePay implements SwiggyPayment {
    int accountBalance =10000;
    double remaingBal = accountBalance;
    String  localnextProcess ="confirm";
    String statusCode ;
    String paymentStatus = "success";
    public String swiggypayment(Coupons coupons, String nextProcess){

        if (nextProcess.equals(localnextProcess)){

            remaingBal= accountBalance - coupons.finalAmount;

            System.out.println("payed amount :  " + coupons.amount +

                    "  payment successful remaining amount : " + remaingBal );
        }
        else{


            double newAccountBalance = remaingBal + coupons.finalAmount;

            System.out.println("your total amount  : " +newAccountBalance);
        }
        System.out.println("your cancellation is successful ");


        return "insufficient  balance";
    }
    public  String  paymentStatus(String paymentStatus){

        if (paymentStatus.equals(this.paymentStatus)){

            System.out.println(" your payment is successfully its ready to delver ");
            return statusCode = "200";
        }else {

            System.out.println("your payment is failed try different method ");
        }
        return  statusCode = "404";


        }
 }