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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) {
            return res;
        }

        q.offer(root);
        while(!q.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            int size = q.size();
            while(size > 0) {
                TreeNode node = q.poll();
                l.add(node.val);
                if(node.left != null) {
                    q.offer(node.left);
                }
                if(node.right != null) {
                    q.offer(node.right);
                }
                size--;
            }
            res.add(l);
        }
        Collections.reverse(res);
        return res;
    }
}