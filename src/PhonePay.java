public class PhonePay implements SwiggyPayment {
    public String swiggypayment( int orderAmount,String nextProcess){
        if (nextProcess.equals("confirm")){
            int remainBal=accountBalance-orderAmount;
            System.out.println(remainBal);
            System.out.println("payed amount:" +orderAmount);
            System.out.println("payment successful remaining amount:" + remainBal );
        }else{
            System.out.println("your total amount  : " +accountBalance);
        }
        return "insufficient  balance";
    }
}