package tech.stack.problems.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 *
 * @author jianyuan.chen@advance.ai
 * @date 2021/3/14 00:57
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        traversal(list, root);
        return list;
    }

    void traversal(List<Integer> list, TreeNode node) {
        if(node == null){
            return;
        }
        traversal(list, node.left);
        list.add(node.val);
        traversal(list, node.right);
    }
}
