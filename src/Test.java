public class Test {

    public static void main(String[] args) {
        PhonePay phonePay = new PhonePay();
        String result = phonePay.swiggypayment(500);
        System.out.println(result);
    }
}
