public class Coupons {
    public int amount;
    public  double discount;;


    public String Couponsprocess(OrderProcess orderProcess){
        amount = orderProcess.totalAmount;

        if(amount>500 && amount<1000){

            discount = amount* 0.2;

            amount= (int) (amount-discount);

            System.out.println("your 20% discount Amount : " + discount + " from total amount : " +orderProcess.totalAmount
                    + " your final amount to pay  : "+amount);

        }
        if(amount>1000){
            double discount;
            discount = amount* 0.3;

            amount= (int) (amount-discount);

            System.out.println("your 30% discount Amount : " + discount + " from total amount : " +orderProcess.totalAmount
                    + "  your final amount to pay  : "+amount);
        }
        else{
            System.out.println("below 500 no discount");
        }

        return "select your order";
    }
}
