package warehouse;

public class Restock {
    public static void main(String[] args) 
    {
        StdIn.setFile("restock.in");
        StdOut.setFile("restock.out");

        // Use this file to test restock
        Warehouse warehouse2 = new Warehouse();
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
                warehouse2.addProduct(prodId, prodName, initialStock, currDay, initialDemand);
            }
            else if(command.equals("restock"))
            {
                int prodId = StdIn.readInt();
                int restockAm = StdIn.readInt();
                warehouse2.restockProduct(prodId, restockAm);
            }

        }
        StdOut.print(warehouse2);
    }
}
