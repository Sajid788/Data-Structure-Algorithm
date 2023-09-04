/*
class TreeNode{
  int data;
  TreeNode left;
  TreeNode right;
  
  TreeNode(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }
}
*/
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Stack<TreeNode> st = new Stack<>();
        Stack<Integer> stk = new Stack<>();
        
        st.push(root);
        stk.push(1);
        int maxDepth = 0;
        
        while (!st.isEmpty()) {
            TreeNode currNode = st.pop();
            int currDepth = stk.pop();
            
            maxDepth = Math.max(maxDepth, currDepth);
            
            if (currNode.left != null) {
                st.push(currNode.left);
                stk.push(currDepth + 1);
            }
            if (currNode.right != null) {
                st.push(currNode.right);
                stk.push(currDepth + 1);
            }
        }
        
        return maxDepth;
    }
}

