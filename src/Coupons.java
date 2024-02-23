public class Coupons {
    public int amount;
    public int discount;
    public String Couponsprocess(){
        if(amount>500){
            discount = amount /10;
            System.out.println("your discount amount  : " + discount);
            amount=amount-discount;
            System.out.println("your final amount to pay  : "+amount);
        }
        else{
            System.out.println("below 500 no discount");
        }
        return "select your order";
    }





}
