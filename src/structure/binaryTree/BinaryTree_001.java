package structure.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的前序遍历
 */
public class BinaryTree_001 {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = a;
		c = b;
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();

		TreeNode self = root;

		while (true) {
			if (root == null) {
				break;
			}
			if (self.left != null) {
				// 左子树不为空，往左爬
				self = self.left;
			} else if (self.left == null && self.right != null) {
				// 右子树不为空，且左子树为空，往右爬
				self = self.right;
			} else if (self.left == null && self.right == null) {
				// 左右都为空，放入集合，然后干掉该节点
				result.add(self.val);
				self = null;
			}
		}

		return result;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
