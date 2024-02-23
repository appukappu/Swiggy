public class OrderProcess  extends OrderItems{
    public OrderProcess(int noOfOrders, String biryani, String starters) {
        super(noOfOrders, biryani, starters);
    }

    public String orderProcess() {
        //for (int i = 0; i < noOfOrders; i++) {
        if (biryani.equals(biryani)) {
            biryanitotalAmount = biryaniCost * noOfOrders;
            System.out.println("BiryaniAmount  =  " + biryanitotalAmount);
        } if (starters.equals(starters)) {
            startersTotalAmount = startersCost * noOfOrders;
            System.out.println("StartersAmount =  " + startersTotalAmount);
        }
        int totalAmount = biryanitotalAmount + startersTotalAmount;
        System.out.println("Total Amount =  : " + totalAmount);
        return "Your Order is Process select  Payment Method ";
    }

}
