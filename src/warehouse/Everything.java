package warehouse;

/*
 * Use this class to put it all together.
 */ 
public class Everything {
    public static void main(String[] args) {
        StdIn.setFile("everything.in");
        StdOut.setFile("everything.out");

    	// Use this file to test all methods
        Warehouse warehouse5 = new Warehouse();
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
                warehouse5.addProduct(prodId, prodName, initialStock, currDay, initialDemand);
            }
            else if(command.equals("restock"))
            {
                int prodId = StdIn.readInt();
                int restockAm = StdIn.readInt();
                warehouse5.restockProduct(prodId, restockAm);
            }
            else if(command.equals("purchase"))
            {
                int currDay = StdIn.readInt();
                int prodId = StdIn.readInt();
                int amountPur = StdIn.readInt();
                warehouse5.purchaseProduct(prodId, currDay, amountPur);
            }
            else if(command.equals("delete"))
            {
                int prodId = StdIn.readInt();
                warehouse5.deleteProduct(prodId);
            }
        }
        StdOut.print(warehouse5);
    }
}
