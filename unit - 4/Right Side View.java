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
	public List<Integer> rightView(TreeNode root){
	    List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int n = q.size();

            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                if (i == n - 1 ) {
                    result.add(node.data);
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }

        return result;
	}
}
// output 5 4 2
