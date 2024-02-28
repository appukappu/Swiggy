public class Delivery {
    String localStatus = "delivered";

    double venderAmount = 5000;
    Coupons coupons ;
    public  Delivery (Coupons coupons){
        this.coupons = coupons;

    }

    public  String delivaryStatus(String status,PhonePay phonePay){


      if  (phonePay.statusCode.equals("200")){
          venderAmount = venderAmount +coupons.finalAmount;


            if (localStatus.equals(status)) {
                System.out.println(" vender total amount after delvary " + venderAmount);

                System.out.println("your Swiggy order is successful delivered ");

            } else


                System.out.println(" your order is failed to delivered ");
        }
        return "provide your Payment Status  ";
    }
}
