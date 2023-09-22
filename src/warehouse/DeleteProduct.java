package warehouse;

/*
 * Use this class to test the deleteProduct method.
 */ 
public class DeleteProduct {
    public static void main(String[] args) {
        StdIn.setFile("deleteproduct.in");
        StdOut.setFile("deleteproduct.out");

	    // Use this file to test deleteProduct
        Warehouse warehouse3 = new Warehouse();
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
                warehouse3.addProduct(prodId, prodName, initialStock, currDay, initialDemand);
            }
            else if(command.equals("delete"))
            {
                int prodId = StdIn.readInt();
                warehouse3.deleteProduct(prodId);
            }

        }
        StdOut.print(warehouse3);
    }
}
