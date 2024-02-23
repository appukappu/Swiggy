public class Test {
    public static void main(String[] args){
        LoginProcess loginProcess=new LoginProcess("vipteam","vip");
       // loginProcess.login();
        OrderProcess orderProcess = new OrderProcess(3,"birani","Chicken65");
        System.out.println(orderProcess.processOrderTest(loginProcess));

    }

    public static void main(String[] args) {
        Coupons coupons = new Coupons();
        coupons.amount=600;
        coupons.Couponsprocess();


    }

}
