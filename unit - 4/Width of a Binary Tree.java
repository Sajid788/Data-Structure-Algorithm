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
class Solution{
    public int width(TreeNode root){
           if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int maxWidth = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            maxWidth = Math.max(maxWidth, n);

            for (int i = 0; i <n; i++) {
                TreeNode currNode = q.poll();

                if (currNode.left != null) {
                    q.offer(currNode.left);
                }

                if (currNode.right != null) {
                    q.offer(currNode.right);
                }
            }
        }

        return maxWidth;
	}
}
