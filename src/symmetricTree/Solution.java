package symmetricTree;

import utils.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymCheck(root.left, root.right);
    }

    public boolean isSymCheck(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;
        return left.val == right.val
                && isSymCheck(left.left, right.right)
                && isSymCheck(left.right, right.left);
    }

}
