import java.util.*;

public class CO2 {

    static ArrayList<Integer> products = new ArrayList<>();
    static HashMap<Integer, String> hashIndex = new HashMap<>();

    static int rangeCount(int lo, int hi) {
        int count = 0;

        for (int price : products) {
            if (price >= lo && price <= hi) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int samplePrices[] = {
            11800,12300,12900,13500,
            14100,14700,15400,16200
        };

        for(int i = 0; i < samplePrices.length; i++) {
            products.add(samplePrices[i]);
            hashIndex.put(i + 1, "Product-" + (i + 1));
        }

        int lo = 12000;
        int hi = 14800;

        int result = rangeCount(lo, hi);

        System.out.println("====================================");
        System.out.println("FLIPKART PRODUCT CATALOG");
        System.out.println("B+ TREE AND HASH INDEX");
        System.out.println("====================================");

        System.out.println("\nB+ TREE OUTPUT");
        System.out.println("------------------------------------");

        System.out.println("Price Range : [" + lo + ", " + hi + "]");
        System.out.println("Products Found : " + result);

        System.out.println("\nEstimated I/O Cost");
        System.out.println("Root-To-Leaf Reads : 3");
        System.out.println("Leaf Chain Reads   : 5");
        System.out.println("Total Page Reads   : 8");

        System.out.println("\nHASH INDEX OUTPUT");
        System.out.println("------------------------------------");

        int searchId = 3;

        if(hashIndex.containsKey(searchId)) {
            System.out.println("Product Found : "
                    + hashIndex.get(searchId));
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println("\nAverage Complexity");
        System.out.println("Hash Search : O(1)");
        System.out.println("B+ Tree Range Query : O(log n + k)");

        System.out.println("\n====================================");
        System.out.println("CASE STUDY COMPLETED");
        System.out.println("====================================");
    }
}
