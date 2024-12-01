package tree;

class Node {
    int val;
    Node left, right;

    Node(int item) {
        val = item;
        left = right = null;
    }
}

public class SymmetricTree {
    public static boolean isSymmetric(Node root) {
        return isMirror(root, root);
    }

    public static boolean isMirror(Node t1, Node t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return t1.val == t2.val && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);

    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);

        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        if (isSymmetric(root)) {
            System.out.println("Symmetric");

        } else {
            System.out.println("Not symmetric");
        }
    }
}
