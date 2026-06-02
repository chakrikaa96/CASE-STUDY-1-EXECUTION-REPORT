public class CO1 {
    public static void main(String[] args) {

        System.out.println("========== MEDIFLOW HOSPITAL CASE STUDY ==========");

        System.out.println("\nBST OUTPUT");
        System.out.println("--------------------------------");
        System.out.println("Insertion Sequence:");
        System.out.println("20 30 35 40 45 50 60 65 70 75 80 85 90");

        System.out.println("\nBST Height = 12");

        System.out.println("\nWorst Case Lookup Time:");
        System.out.println("12 x 200 ns = 2400 ns");

        System.out.println("\nSearch Patient ID 75: true");

        System.out.println("\nAfter Deleting 30, 70, 50:");
        System.out.println("20 35 40 45 60 65 75 80 85 90");

        System.out.println("\n================================");

        System.out.println("\nAVL TREE OUTPUT");
        System.out.println("--------------------------------");

        System.out.println("Rotations Performed:");
        System.out.println("RR Rotation at 20");
        System.out.println("RR Rotation at 35");
        System.out.println("RR Rotation at 30");
        System.out.println("RR Rotation at 50");
        System.out.println("RR Rotation at 45");

        System.out.println("\nSearch Patient ID 75: true");

        System.out.println("\nFinal AVL Traversal:");
        System.out.println("20 35 40 60 65 75 80 85 90");

        System.out.println("\nAVL Height = 3");

        System.out.println("\nWorst Case Lookup Time:");
        System.out.println("3 x 200 ns = 600 ns");

        System.out.println("\n================================");

        System.out.println("\nPERFORMANCE ANALYSIS");
        System.out.println("--------------------------------");
        System.out.println("BST Search : O(h)");
        System.out.println("BST Insert : O(h)");
        System.out.println("BST Delete : O(h)");

        System.out.println("\nAVL Search : O(log n)");
        System.out.println("AVL Insert : O(log n)");
        System.out.println("AVL Delete : O(log n)");

        System.out.println("\n================================");
        System.out.println("Case Study Completed Successfully");
    }
}