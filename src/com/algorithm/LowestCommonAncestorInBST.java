package com.algorithm;

import com.common.TreeNode;

public class LowestCommonAncestorInBST {
    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(4);
        TreeNode treeNode2= new TreeNode(2);
//        TreeNode treeNode3=new TreeNode(5);
        System.out.println( new LowestCommonAncestorInBST().lowestCommonAncestor(treeNode1, treeNode2, null));
    }
    
    // 由于BST的特征得出:  if (root.val > smaller && root.val < bigger) return root; 
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            if (root == null || (p == null && q == null)) {
                return root;
            } else {
                return p == null ? q : p;
            }
        }
        int bigger = p.val > q.val ? p.val : q.val;
        int smaller = bigger == p.val ? q.val : p.val;

        if (root.val > bigger) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < smaller) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (root.val > smaller && root.val < bigger) {
            return root;
        }
        return root;
    }
}
