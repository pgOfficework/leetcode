package tree;

// Definition for a binary tree node.
public class BTreeNode {
    int val;
    BTreeNode left;
    BTreeNode right;

    BTreeNode() {
    }

    public BTreeNode(int val) {
        this.val = val;
    }

    BTreeNode(int val, BTreeNode left, BTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
