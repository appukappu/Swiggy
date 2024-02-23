public class PhonePay implements SwiggyPayment {
    public String swiggypayment(Coupons coupons, String nextProcess){
        if (nextProcess.equals("confirm")){
            int remainBal=accountBalance- coupons.amount;
            System.out.println("payed amount : " + coupons.amount);
            System.out.println("payment successful remaining amount : " + remainBal );
        }else{
            System.out.println("your cancellation is sucessfull");
            System.out.println("your total amount  : " +accountBalance);
        }
        return "insufficient  balance";
    }
//    public  String payment (OrderProcess orderProcess){
//        orderProcess.totalAmount = this.swiggypayment()
//    }
}