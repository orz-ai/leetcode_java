//输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。 
//
// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。 
//
// 
//
// 示例 1: 
// 
// 
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
// 
//
// 示例 2: 
//
// 
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
//
//
// 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
//
// Related Topics 树 数组 哈希表 分治 二叉树 👍 875 👎 0


package leetcode.editor.cn.interview.srto;

import leetcode.editor.cn.common.TreeNode;

/**
 * 重建二叉树
 *
 * @author fallinyou
 * @date 2022-08-11 11:11:18
 * @question_num 剑指 Offer 07
 *
 * 	执行耗时:3 ms,击败了39.23% 的Java用户
 * 	内存消耗:40.8 MB,击败了93.89% 的Java用户
 */
public class ZhongJianErChaShuLcof {
  public static void main(String[] args) {
    //测试代码
    Solution solution = new ZhongJianErChaShuLcof().new Solution();
  }

//leetcode submit region begin(Prohibit modification and deletion)

  /**
   * Definition for a binary tree node.
   * public class TreeNode {
   * int val;
   * TreeNode left;
   * TreeNode right;
   * TreeNode(int x) { val = x; }
   * }
   */
  class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      return recurBuild(preorder, inorder, 0, preorder.length, 0, inorder.length);
    }

    public TreeNode recurBuild(
      int[] preorder,
      int[] inorder,
      int preStart,
      int preEnd,
      int inStart,
      int inEnd
    ) {
      if (preStart == preEnd) {
        return null;
      }

      int rootValue = preorder[preStart];
      TreeNode tree = new TreeNode(rootValue);

      int inRootIdx = 0;
      // 通过中序遍历查找左右子树的分界点
      for (int i = inStart; i < inEnd; i++) {
        if (rootValue == inorder[i]) {
          inRootIdx = i;
          break;
        }
      }

      int gap = inRootIdx - inStart;

      // 构建左子树
      tree.left = recurBuild(preorder, inorder, preStart + 1, preStart + gap + 1, inStart, inRootIdx);

      // 构建右子树
      tree.right = recurBuild(preorder, inorder, preStart + gap + 1, preEnd, inRootIdx + 1, inEnd);

      return tree;
    }


  }
//leetcode submit region end(Prohibit modification and deletion)

}
