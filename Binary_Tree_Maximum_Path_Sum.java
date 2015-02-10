public class Binary_Tree_Maximum_Path_Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int maxSum = 0;

	public int maxPathSum(TreeNode root) {
		maxSum = Integer.MIN_VALUE;

		findMax(root);
		return maxSum;
	}

	public static int findMax(TreeNode p) {
		if (p == null)
			return 0;
		int left = findMax(p.left);
		int right = findMax(p.right);
		int tmp1 = p.val + Math.max(left, right);

		maxSum = Math.max(p.val + left + right, maxSum);

		return tmp1 > 0 ? tmp1 : 0;
	}
}
