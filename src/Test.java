public class Test {
    public static void main(String[] args) {
        LoginProcess loginProcess=new LoginProcess("vipteam","vip");
        OrderProcess orderProcess = new OrderProcess(3,"birani","Chicken65");
        orderProcess.processOrderTest(loginProcess);
        Coupons coupons = new Coupons();
        coupons.Couponsprocess(orderProcess);
        PhonePay phonePay= new PhonePay();
        phonePay.swiggypayment(coupons,"confirm"); // if you want to cancel type cancel
    }

}

