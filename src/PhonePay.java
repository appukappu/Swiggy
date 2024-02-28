public class PhonePay implements SwiggyPayment {
    int accountBalance =10000;
    double remaingBal ;
    String  localnextProcess ="confirm";
    String statusCode ;
    String paymentStatus = "success";
    public String swiggypayment(Coupons coupons, String nextProcess){

        remaingBal= accountBalance - coupons.finalAmount;

        if (nextProcess.equals(localnextProcess)){


            System.out.println("payed amount :  " + coupons.finalAmount +
                    "  payment successful remaining amount : " + remaingBal );
            System.out.println("-- your payment is success fully completed and moved to vendor for delivery");
            return statusCode = "200";
        }
        else{
            double newAccountBalance = remaingBal + coupons.finalAmount;

            System.out.println("your total amount  : " +newAccountBalance);
            System.out.println("your cancellation is successful ");
        }

        return  statusCode = "404";
    }

 }