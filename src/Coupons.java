public class Coupons {
    public int amount;
    public  double discount;
    double finalAmount;

    public String couponsprocess(OrderProcess orderProcess){


        amount = orderProcess.totalAmount;

        if(amount>500 && amount<1000){

            discount = amount* 0.2;
        }
        else if(amount>1000) {

            discount = amount * 0.3;
        }

        else{
            discount = 0;
            System.out.println("below 500 no discount ");
        }

      //  amount= (int) (amount-discount);

        finalAmount  = amount - discount;

        if (discount > 0) {
            System.out.println("---Your discount amount: " + discount + " from total amount: " + amount +
                    " Your final amount to pay: " + finalAmount);
        }


        return "select your order ";
    }
}
