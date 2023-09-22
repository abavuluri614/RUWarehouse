package warehouse;

public class PurchaseProduct {
    public static void main(String[] args) {
        StdIn.setFile("purchaseproduct.in");
        StdOut.setFile("purchaseproduct.out");

	    // Use this file to test purchaseProduct
        Warehouse warehouse4 = new Warehouse();
        int n = StdIn.readInt();
        for(int i = 0; i < n; i++)
        {
            String command = StdIn.readString();
            if(command.equals("add"))
            {
                int currDay = StdIn.readInt();
                int prodId = StdIn.readInt();
                String prodName = StdIn.readString();
                int initialStock = StdIn.readInt();
                int initialDemand = StdIn.readInt();
                warehouse4.addProduct(prodId, prodName, initialStock, currDay, initialDemand);
            }
            else if(command.equals("purchase"))
            {
                int currDay = StdIn.readInt();
                int prodId = StdIn.readInt();
                int amountPur = StdIn.readInt();
                warehouse4.purchaseProduct(prodId, currDay, amountPur);
            }

        }
        StdOut.print(warehouse4);
    }
}
