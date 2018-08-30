package leetcode.simple.tree;

/**
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。

 说明: 叶子节点是指没有子节点的节点。

 示例:
 给定如下二叉树，以及目标和 sum = 22，

       5
      / \
     4   8
    /   / \
   11  13  4
  /  \      \
 7    2      1
 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 * Created by zhaiyi on 2018/8/29.
 */
public class PathSumEquals {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return traserve(root, 0, sum);
    }

    public boolean traserve(TreeNode node, int sum, int target) {
        if (node != null) {
            int tmp = sum + node.val;
            if (tmp == target && node.left == null && node.right == null)  {
                return true;
            } else {
                return traserve(node.left, tmp, target) || traserve(node.right, tmp, target);
            }
        } else {
            return false;
        }
    }
}
