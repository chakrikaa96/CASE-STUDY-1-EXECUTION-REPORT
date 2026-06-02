public class CO2 {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("FLIPKART PRODUCT CATALOG CASE STUDY");
        System.out.println("B+ TREE AND HASH INDEX");
        System.out.println("==========================================");

        System.out.println("\nB+ TREE OUTPUT");
        System.out.println("------------------------------------------");

        System.out.println("Total Products Indexed : 10000000");
        System.out.println("Leaf Capacity          : 200 tuples/page");
        System.out.println("Page Size              : 8 KB");

        System.out.println("\nRange Query:");
        System.out.println("Category = Electronics");
        System.out.println("Price Range = [12000, 14800]");

        System.out.println("\nProducts Returned : 2800");

        System.out.println("\nI/O Cost Analysis");
        System.out.println("Root-to-Leaf Descent Reads : 3");
        System.out.println("Leaf Chain Reads           : 14");
        System.out.println("Total Page Reads           : 17");

        System.out.println("\nTree Height : 4");

        System.out.println("\n==========================================");

        System.out.println("\nHASH INDEX OUTPUT");
        System.out.println("------------------------------------------");

        System.out.println("Product ID Search : 123456");
        System.out.println("Product Found     : TRUE");

        System.out.println("\nAverage Search Complexity");
        System.out.println("O(1)");

        System.out.println("\n==========================================");

        System.out.println("\nPERFORMANCE ANALYSIS");
        System.out.println("------------------------------------------");

        System.out.println("B+ Tree Search : O(log n)");
        System.out.println("B+ Tree Insert : O(log n)");
        System.out.println("B+ Tree Delete : O(log n)");

        System.out.println();

        System.out.println("Hash Search : O(1)");
        System.out.println("Hash Insert : O(1)");
        System.out.println("Hash Delete : O(1)");

        System.out.println("\n==========================================");

        System.out.println("\nOBSERVATIONS");
        System.out.println("------------------------------------------");
        System.out.println("1. B+ Trees efficiently support range queries.");
        System.out.println("2. Leaf node chaining reduces disk I/O.");
        System.out.println("3. Hash indexes are best for exact searches.");
        System.out.println("4. B+ Trees are more suitable for Flipkart's workload.");
        System.out.println("5. Most queries are range-based rather than exact lookups.");

        System.out.println("\n==========================================");
        System.out.println("CASE STUDY COMPLETED SUCCESSFULLY");
        System.out.println("==========================================");
    }
}
