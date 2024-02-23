public class Coupons {
    public int amount;
    public int discount;
    public String Couponsprocess(){
        if(amount>500 && amount<1000){
            discount = amount /10;
            System.out.println("your discount amount  : " + discount);
            amount=amount-discount;
            System.out.println("your final amount to pay  : "+amount);
        }
        if(amount>1000){
            discount=amount/20;
            System.out.println("your discount amount: "+ discount);
            amount=amount-discount;
            System.out.println("your final amount to pay  : "+amount);
        }
        else{
            System.out.println("below 500 no discount");
        }

        return "select your order";
    }
}
