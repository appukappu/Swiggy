public class Delivery {
    String localStatus = "delivered";

    double venderAmount = 5000;
    double newAccountBalance;
    Coupons coupons ;
    public  Delivery (Coupons coupons){
        this.coupons = coupons;

    }

    public  String delivaryStatus(String status,PhonePay phonePay){
        System.out.println("vendor amount : " +venderAmount);

      if  (phonePay.statusCode.equals("200")){

          venderAmount = venderAmount +coupons.finalAmount;

            if (localStatus.equals(status)) {
                System.out.println(" amount from swigy is : " +coupons.finalAmount);

                System.out.println(" vendor total amount after delivery " + venderAmount );

                System.out.println("your Swigy order is successful delivered ");

            } else

             System.out.println(" your bank balance " + 10000);



          System.out.println(" your order is failed to delivered ");
        }
        return "provide your Payment Status  ";
    }
}
