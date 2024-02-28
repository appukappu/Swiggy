public class Delivery {
    String localStatus = "delivered";

    int venderAmount = 5000;

    public  String delivaryStatus(String status,PhonePay phonePay){
      if  (phonePay.statusCode.equals("200")){

            if (localStatus.equals(status)) {
              //  venderAmount = venderAmount +

                System.out.println("your Swiggy order is successful delivered ");

            } else
                System.out.println(" your order is failed to delivered ");
        }
        return "provide your Payment Status  ";
    }
}
