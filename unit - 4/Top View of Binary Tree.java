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
	public List<Integer> topView(TreeNode root){
		 List<Integer> result = new ArrayList<>();
         if (root == null) {
            return result;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> distQ = new LinkedList<>();
        q.offer(root);
        distQ.offer(0);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            int distance = distQ.poll();
            if (!map.containsKey(distance)) {
                map.put(distance, node.data);
            }
            if (node.left != null) {
                q.offer(node.left);
                distQ.offer(distance - 1);
            }
            if (node.right != null) {
                q.offer(node.right);
                distQ.offer(distance + 1 );
            }
        }
        for (int value : map.values()) {
            result.add(value);
        }

        return result;
	}
}
//output 7 6 5 4
