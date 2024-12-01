package tree;


import java.util.*;

public class InsertIntoBST {

    public static BTreeNode root = null;

    public static BTreeNode formBST(BTreeNode node) {

        if (root == null) {
            root = node;
            return root;
        }

        BTreeNode currentNode = root;

        while (true) {
            if (node.val > currentNode.val) {
                if (currentNode.right == null) {
                    currentNode.right = node;
                    break;
                }
                currentNode = currentNode.right;
            } else if (node.val < currentNode.val) {
                if (currentNode.left == null) {
                    currentNode.left = node;
                    break;
                }
                currentNode = currentNode.left;
            } else break;
        }
        return root;
    }

    public static void inorderTraversal(BTreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");

            inorderTraversal(root.left);

            inorderTraversal(root.right);
        }
    }

    //https://www.youtube.com/watch?v=KV4mRzTjlAk
    public static void rightSideView(BTreeNode root, List<Integer> list, int level) {

        if (root == null) return;

        if (level == list.size()) {
            list.add(root.val);
        }

        rightSideView(root.right, list, level + 1);
        rightSideView(root.left, list, level + 1);
    }

    public static List<Integer> iterativeRightSideView(BTreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root==null){
            return result;
        }

        Queue<BTreeNode> queue=new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int level=queue.size();

            for (int i = 0; i < level; i++) {
                BTreeNode node=queue.poll();
                if (i==level-1) {
                    result.add(node.val);
                }
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
        }

        return result;
    }


    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(3, 2, 1, null, 5, null, 4);

        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) != null) formBST(new BTreeNode(inputList.get(i)));
        }
        //       inorderTraversal(root);

        ArrayList<Integer> rightSideList = new ArrayList<>();

        rightSideView(root, rightSideList, 0);
        iterativeRightSideView(root).forEach(System.out::println);

        System.out.println("----------");
        rightSideList.forEach(System.out::println);

    }
}
