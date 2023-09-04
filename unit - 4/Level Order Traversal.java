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
	public List<List<Integer>> levelorderTraversal(TreeNode root){
	        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> currLevel = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode currNode = q.poll();
                currLevel.add(currNode.data);

                if (currNode.left != null) {
                    q.offer(currNode.left);
                }

                if (currNode.right != null) {
                    q.offer(currNode.right);
                }
            }

            result.add(currLevel);
        }

        return result;
	}
}
