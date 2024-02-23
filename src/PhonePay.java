public class PhonePay implements SwiggyPayment {
    public String swiggypayment(OrderProcess orderProcess, String nextProcess){
        if (nextProcess.equals("confirm")){
            int remainBal=accountBalance- orderProcess.totalAmount;
            System.out.println(remainBal);
            System.out.println("payed amount : " +orderProcess.totalAmount);
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