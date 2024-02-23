public class OrderProcess extends OrderItems {
    public OrderProcess(int noOfOrders, String biryani, String starters) {
        super(noOfOrders, biryani, starters);
    }

    public String processOrderTest(LoginProcess loginProcess) {
        if (loginProcess.login()) {
            if (biryani != null) {
                biryanitotalAmount = biryaniCost * noOfOrders;
                System.out.println("Biryani Amount: " + biryanitotalAmount);
            }
            if (starters != null) {
                startersTotalAmount = startersCost * noOfOrders;
                System.out.println("Starters Amount: " + startersTotalAmount);
            }
            int totalAmount = biryanitotalAmount + startersTotalAmount;
            System.out.println("Total Amount: " + totalAmount);
            return "Your Order is Processed. Total Amount: " + totalAmount ;
        } else {
            return "  Select Payment Method. ";
        }
    }
}
