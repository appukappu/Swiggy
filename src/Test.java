public class Test {
    public static void main(String[] args)  {

        LoginProcess loginProcess = new LoginProcess("vipteam","vip");

        OrderProcess orderProcess = new OrderProcess(loginProcess,5,null,"Chicken65");

        try {
            orderProcess.processOrderTest();
        } catch (SwiggyException e) {
            System.out.println(" " + e.getMessage());
        }

        Coupons coupons = new Coupons();

        coupons.couponsprocess(orderProcess);

        PhonePay phonePay= new PhonePay();

        try {
            phonePay.swiggypayment(coupons,"conf"); // if you want to cancel type cancel
        } catch (SwiggyException e) {
            System.out.println(" " + e.getMessage()+e.code);
        }

        Delivery delivery = new Delivery(coupons);

        delivery.delivaryStatus("delivered",phonePay);
    }

}

