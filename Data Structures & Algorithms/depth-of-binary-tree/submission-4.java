/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Stack<Pair<TreeNode,Integer>> s=new Stack<>();
        int maxDepth=0;
        s.push(new Pair<>(root,1));
        int count=0;
        while(!s.isEmpty()){
                Pair<TreeNode,Integer> temp1=s.pop();
                int depth=temp1.getValue();
               TreeNode temp=temp1.getKey();
               maxDepth=Math.max(maxDepth,depth);
                
                 if(temp.right != null) {
                s.push(new Pair<>(temp.right, depth + 1));
            }

            if(temp.left != null) {
                s.push(new Pair<>(temp.left, depth + 1));
            }
        }
        return maxDepth;
    }
}
