public class Test {
    public static void main(String[] args){
        LoginProcess loginProcess=new LoginProcess("vipteam","vip");
        OrderProcess orderProcess = new OrderProcess(2,"birani","Chicken65");
         orderProcess.processOrderTest(loginProcess);
        Coupons coupons = new Coupons();
        coupons.Couponsprocess(orderProcess);


    }

}
