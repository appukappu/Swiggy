public class Test {
    public static void main(String[] args) {

        LoginProcess loginProcess = new LoginProcess("vipteam","vip");

        OrderProcess orderProcess = new OrderProcess(loginProcess,4,"biryani","Chicken65");


        orderProcess.processOrderTest();

        Coupons coupons = new Coupons();

        coupons.couponsprocess(orderProcess);


        PhonePay phonePay= new PhonePay();

        phonePay.swiggypayment(coupons,"confir"); // if you want to cancel type cancel

        phonePay.paymentStatus("success");

        Delivery delivery = new Delivery();

        delivery.delivaryStatus("delivered",phonePay);
    }

}

