package ebay;

import tree.BTreeNode;

import java.util.Arrays;
import java.util.List;

import static tree.InsertIntoBST.formBST;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        BTreeNode root;
        List<Integer> inputList = Arrays.asList(4, 2, 7, 1, 3, null, null, null, null, null, null);

        for (int i = 1; i < inputList.size(); i++) {
            if (inputList.get(i) != null) {
                formBST(new BTreeNode(inputList.get(i)));
            }
        }
    }
}
