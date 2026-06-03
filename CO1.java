class AVLNode {
    int key;
    AVLNode left, right;
    int height;

    AVLNode(int key) {
        this.key = key;
        this.height = 1;
    }
}

public class CO1 {

    static int height(AVLNode n) {
        return (n == null) ? 0 : n.height;
    }

    static int balance(AVLNode n) {
        return (n == null) ? 0 :
                height(n.left) - height(n.right);
    }

    static void updateHeight(AVLNode n) {
        n.height = 1 + Math.max(height(n.left),
                                height(n.right));
    }

    static AVLNode rotateRight(AVLNode y) {
        AVLNode x = y.left;
        AVLNode t2 = x.right;

        x.right = y;
        y.left = t2;

        updateHeight(y);
        updateHeight(x);

        return x;
    }

    static AVLNode rotateLeft(AVLNode x) {
        AVLNode y = x.right;
        AVLNode t2 = y.left;

        y.left = x;
        x.right = t2;

        updateHeight(x);
        updateHeight(y);

        return y;
    }

    static AVLNode insert(AVLNode node, int key) {

        if (node == null)
            return new AVLNode(key);

        if (key < node.key)
            node.left = insert(node.left, key);

        else if (key > node.key)
            node.right = insert(node.right, key);

        else
            return node;

        updateHeight(node);

        int bf = balance(node);

        // LL
        if (bf > 1 && key < node.left.key)
            return rotateRight(node);

        // RR
        if (bf < -1 && key > node.right.key)
            return rotateLeft(node);

        // LR
        if (bf > 1 && key > node.left.key) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // RL
        if (bf < -1 && key < node.right.key) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    static AVLNode minValueNode(AVLNode node) {
        AVLNode current = node;

        while (current.left != null)
            current = current.left;

        return current;
    }

    static AVLNode delete(AVLNode root, int key) {

        if (root == null)
            return root;

        if (key < root.key)
            root.left = delete(root.left, key);

        else if (key > root.key)
            root.right = delete(root.right, key);

        else {

            if ((root.left == null) ||
                (root.right == null)) {

                AVLNode temp;

                if (root.left != null)
                    temp = root.left;
                else
                    temp = root.right;

                if (temp == null) {
                    root = null;
                } else {
                    root = temp;
                }
            }
            else {

                AVLNode temp =
                    minValueNode(root.right);

                root.key = temp.key;

                root.right =
                    delete(root.right, temp.key);
            }
        }

        if (root == null)
            return root;

        updateHeight(root);

        int bf = balance(root);

        // LL
        if (bf > 1 &&
            balance(root.left) >= 0)
            return rotateRight(root);

        // LR
        if (bf > 1 &&
            balance(root.left) < 0) {

            root.left =
                rotateLeft(root.left);

            return rotateRight(root);
        }

        // RR
        if (bf < -1 &&
            balance(root.right) <= 0)
            return rotateLeft(root);

        // RL
        if (bf < -1 &&
            balance(root.right) > 0) {

            root.right =
                rotateRight(root.right);

            return rotateLeft(root);
        }

        return root;
    }

    static void inorder(AVLNode root) {

        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        int ids[] = {
            20,30,35,40,45,50,
            60,65,70,75,80,85,90
        };

        AVLNode root = null;

        for (int id : ids)
            root = insert(root, id);

        System.out.println(
            "MEDIFLOW HOSPITAL AVL TREE");

        System.out.print(
            "\nInorder Traversal: ");
        inorder(root);

        System.out.println(
            "\nAVL Height = "
            + (height(root) - 1));

        root = delete(root, 30);
        root = delete(root, 70);
        root = delete(root, 50);

        System.out.print(
            "\nAfter Deleting 30,70,50: ");
        inorder(root);

        System.out.println(
            "\nFinal AVL Height = "
            + (height(root) - 1));
    }
}
