public class OrderProcess extends OrderItems {
    LoginProcess loginProcess;
    public OrderProcess(int noOfOrders, String biryani, String starters,LoginProcess loginProcess) {
        super(noOfOrders, biryani, starters);
        this.loginProcess = loginProcess;

    }
    public OrderProcess(int noOfOrders, String biryani, String starters) {
        super(noOfOrders, biryani, starters);
    }

    int totalAmount = 0;



    public String processOrderTest() {
        if (loginProcess.login()) {
            if (biryani != null) {
                biryanitotalAmount = biryaniCost * noOfOrders;
             //   System.out.println("Biryani Amount: " + biryanitotalAmount);
            }
            if (starters != null) {
                startersTotalAmount = startersCost * noOfOrders;
               // System.out.println("Starters Amount: " + startersTotalAmount);
            }
            totalAmount = biryanitotalAmount + startersTotalAmount;
            System.out.println("Total Amount: == " + totalAmount +"  total birayani amount : " + biryanitotalAmount
            +"  starters amount : " + startersTotalAmount);
            return " Your Order is Processed. Total Amount : " + totalAmount;
        } else {
            return "  Select Payment Method. ";
        }
    }
}

