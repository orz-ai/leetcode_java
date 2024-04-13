//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
//
// Related Topics 栈 递归 链表 双指针 👍 322 👎 0


package leetcode.editor.cn.interview.srto;

import leetcode.editor.cn.common.ListNode;

import java.util.Stack;

/**
 * 从尾到头打印链表
 *
 * @author fallinyou
 * @date 2022-08-10 11:40:49
 * @question_num 剑指 Offer 06
 *
 * 	执行耗时:2 ms,击败了19.69% 的Java用户
 * 	内存消耗:41.8 MB,击败了78.74% 的Java用户
 */
public class CongWeiDaoTouDaYinLianBiaoLcof {
  public static void main(String[] args) {
    //测试代码
    Solution solution = new CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
  }

//leetcode submit region begin(Prohibit modification and deletion)

  /**
   * Definition for singly-linked list.
   * public class ListNode {
   * int val;
   * ListNode next;
   * ListNode(int x) { val = x; }
   * }
   */
  class Solution {
    public int[] reversePrint(ListNode head) {
      Stack<Integer> stack = new Stack<>();
      while (head != null) {
        stack.push(head.val);
        head = head.next;
      }

      int[] result = new int[stack.size()];
      for (int i = 0; i < result.length; i++) {
        result[i] = stack.pop();
      }
      return result;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
