package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    static TreeNode rootNode;

    public BinarySearchTree() {
        rootNode = null;
    }

    public void insert(int val) {

        TreeNode newNode = new TreeNode(val);

        // if tree empty the set newNode as root node
        if (rootNode == null) {
            rootNode = newNode;
            return;
        } else {
            // currentNode point rootNode of the tree
            TreeNode currentNode = rootNode;

            while (true) {
                if (val < currentNode.val) {
                    // left
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        return;
                    }
                    currentNode = currentNode.left;
                } else {
                    // right
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        return;
                    }
                    currentNode = currentNode.right;
                }

            }
        }
    }

    public boolean lookup(int val) {

        if (rootNode == null) {
            return false;
        } else {
            TreeNode curreNode = rootNode;
            while (true) {
                if (val == curreNode.val) {
                    return true;
                } else if (val < curreNode.val) {
                    if (curreNode.left == null) {
                        return false;
                    }
                    curreNode = curreNode.left;
                } else {
                    if (curreNode.right == null) {
                        return false;
                    }
                    curreNode = curreNode.right;
                }

            }
        }
    }

    public TreeNode remove(TreeNode root, int val) {
        if (root == null) {
            return root;
        } else {
            TreeNode currentNode = root;
            TreeNode pareNode = null;

            while (currentNode != null) {
                if (val < currentNode.val) {
                    pareNode = currentNode;
                    currentNode = currentNode.left;
                } else if (val > currentNode.val) {
                    pareNode = currentNode;
                    currentNode = currentNode.right;
                } else {

                    if (isLeaf(currentNode)) {
                        if (pareNode.left != null) {
                            pareNode.left = null;
                        } else if (pareNode.right != null) {
                            pareNode.right = null;
                        }
                        return root;
                    }
                    currentNode.val = inorderPredecessor(pareNode, currentNode);
                    return root;
                }

            }

        }

        return root;
    }

    public static boolean isLeaf(TreeNode node) {
        if (node.left == null && node.right == null) {
            return true;
        }
        return false;
    }

    public static int inorderPredecessor(TreeNode parentNode, TreeNode currentNode) {

        if (currentNode.right != null) {
            parentNode = currentNode;
            currentNode = currentNode.right;
            if (isLeaf(currentNode)) {
                parentNode.right = null;
                return currentNode.val;
            }
            if (currentNode.right == null) {
                parentNode.left = currentNode.left;
                return currentNode.val;
            } else {
                while (true) {

                    if (currentNode.left == null) {
                        if (currentNode.right != null) {
                            parentNode.left = currentNode.right;
                            return currentNode.val;
                        } else {
                            parentNode.left = currentNode.left;
                            return currentNode.val;
                        }
                    } else {
                        parentNode = currentNode;
                        currentNode = currentNode.left;

                    }
                }
            }
        } else {
            if (currentNode.left != null) {
                if (isLeaf(currentNode.left)) {
                    parentNode.left = null;
                    return currentNode.val;
                }
                parentNode.left = currentNode.left;
                return currentNode.left.val;

            }
        }
        return 0;

    }

    public void traverseLevelOrder() {
        if (rootNode == null) {
            return;
        }

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(rootNode);

        while (!nodes.isEmpty()) {

            TreeNode node = nodes.remove();

            System.out.print(" " + node.val);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        BinarySearchTree b_tree = new BinarySearchTree();

        int[] nodes = {50, 30, 20, 10, 15, 40, 45, 70, 60, 80, 55, 65, 75, 90, 5, 35, 37, 85, 63};

        for (int i : nodes) {
            b_tree.insert(i);
        }

        b_tree.traverseLevelOrder();

        System.out.print("\n" + nodes.length + "\n");
        TreeNode t = b_tree.remove(rootNode, 35);
        b_tree.traverseLevelOrder();

    }

}
