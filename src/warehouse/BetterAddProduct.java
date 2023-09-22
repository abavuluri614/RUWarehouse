package warehouse;

/*
 * Use this class to test the betterAddProduct method.
 */ 
public class BetterAddProduct {
    public static void main(String[] args) {
        StdIn.setFile("betteraddproduct.in");
        StdOut.setFile("betteraddproduct.out");
        int numProd = StdIn.readInt();
        Warehouse warehouse6 = new Warehouse();

        for(int i = 0; i <numProd; i++)
        {
            int currDay = StdIn.readInt();
            int id = StdIn.readInt();
            String prodName = StdIn.readString();
            int initialStock = StdIn.readInt();
            int initialDemand = StdIn.readInt();
            warehouse6.betterAddProduct(id, prodName, initialStock, currDay, initialDemand);
        }
        StdOut.print(warehouse6);
    }
}
