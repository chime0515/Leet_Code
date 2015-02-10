public class Validate_Binary_Search_Tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValidBST(TreeNode root) {

		return helper(root, null, null);
	}

	public boolean helper(TreeNode p, Integer min, Integer max) {
		if (p == null)
			return true;

		return (min == null || p.val > min) && (max == null || p.val < max)
				&& helper(p.left, min, p.val) && helper(p.right, p.val, max);

	}
}
