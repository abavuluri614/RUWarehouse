package warehouse;

/*
 * Use this class to test to addProduct method.
 */
public class AddProduct {
    public static void main(String[] args) {
        StdIn.setFile("addproduct.in");
        StdOut.setFile("addproduct.out");
        int numProd = StdIn.readInt();
        Warehouse warehouse1 = new Warehouse();

        for(int i = 0; i <numProd; i++)
        {
            int currDay = StdIn.readInt();
            int id = StdIn.readInt();
            String prodName = StdIn.readString();
            int initialStock = StdIn.readInt();
            int initialDemand = StdIn.readInt();
            warehouse1.addProduct(id, prodName, initialStock, currDay, initialDemand);
        }
        StdOut.print(warehouse1);
    }
}
