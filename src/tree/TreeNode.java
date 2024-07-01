package tree;

public class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode() {
    }

    ;

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int data) {
        this.val = data;
    }

}
