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
	public List<Integer> bottomView(TreeNode root){
	    List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> disQ = new LinkedList<>();
        q.offer(root);
        disQ .offer(0);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            int distance =  disQ .poll();
            map.put(distance, node.data);

            if (node.left != null) {
                q.offer(node.left);
                disQ .offer(distance - 1);
            }

            if (node.right != null) {
                q.offer(node.right);
                 disQ .offer(distance + 1);
            }
        }
        for (int value : map.values()) {
            result.add(value);
        }

        return result;
	}
}
// output 7 6 2 4
