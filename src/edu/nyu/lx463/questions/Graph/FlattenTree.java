package edu.nyu.lx463.questions.Graph;

/**
 * Created by LyuXie on 4/20/17.
 */
public class FlattenTree {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        flatten(left);
        flatten(right);

        root.right = left;

        TreeNode curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }

        curr.right = right;

    }
}
