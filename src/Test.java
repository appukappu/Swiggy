public class Test {
    public static void main(String[] args) {
        LoginProcess loginProcess = new LoginProcess("vipteam","vip");

        OrderProcess orderProcess = new OrderProcess(4,"biryani","Chicken65",loginProcess);

        OrderProcess orderProcess1 = new OrderProcess(15,null,"Chicken65",loginProcess);

        orderProcess.processOrderTest();
        orderProcess1.processOrderTest();

        Coupons coupons = new Coupons();

         coupons.Couponsprocess(orderProcess);
         coupons.Couponsprocess(orderProcess1);

        PhonePay phonePay= new PhonePay();

        phonePay.swiggypayment(coupons,"confirm"); // if you want to cancel type cancel
        Delivery delivery = new Delivery();
        delivery.delivaryStatus("delivered",phonePay);
    }

}

