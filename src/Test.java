


public class Test {

    public static void main(String[] args) {
        PhonePay phonePay = new PhonePay(1000);
        String result = phonePay.swiggypayment(500);
        System.out.println(result);
        result = phonePay.cancelOrder(500);
        System.out.println(result);
    }
}