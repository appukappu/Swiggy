public class Delivery {
    String localStatus = "delivered";
    public  String delivaryStatus(String status,PhonePay phonePay){
        phonePay.swiggypayment(new Coupons(),"con");
        if(localStatus.equals(status)){
            System.out.println("your swiggy order is sucessfull delvered  ");
        }else
            System.out.println( " your order is faild to delivered");
        return "provide your delivary ststus ";
    }

}
