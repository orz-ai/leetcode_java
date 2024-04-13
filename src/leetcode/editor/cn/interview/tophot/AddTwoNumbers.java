//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。 
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
// 
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
//
// Related Topics 递归 链表 数学 👍 8483 👎 0


package leetcode.editor.cn.interview.tophot;

import leetcode.editor.cn.common.ListNode;

/**
 * 两数相加
 *
 * @author fallinyou
 * @date 2022-08-11 16:55:16
 * @question_num 2
 *
 * 	执行耗时:1 ms,击败了100.00% 的Java用户
 * 	内存消耗:41.2 MB,击败了91.07% 的Java用户
 */
public class AddTwoNumbers {
  public static void main(String[] args) {
    //测试代码
    Solution solution = new AddTwoNumbers().new Solution();
  }

//leetcode submit region begin(Prohibit modification and deletion)

  /**
   * Definition for singly-linked list.
   * public class ListNode {
   * int val;
   * ListNode next;
   * ListNode() {}
   * ListNode(int val) { this.val = val; }
   * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   * }
   */
  class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode result = null, temp = null;
      int carry = 0;
      while (l1 != null && l2 != null) {
        int singleResult = l1.val + l2.val + carry;
        if (singleResult >= 10) {
          // 需要进位
          carry = 1;
          singleResult -= 10;
        } else {
          carry = 0;
        }

        if (temp == null) {
          temp = new ListNode(singleResult);
          result = temp;
        } else {
          temp.next = new ListNode(singleResult);
          temp = temp.next;
        }

        l1 = l1.next;
        l2 = l2.next;
      }

      ListNode left = null;
      if (l1 != null) {
        left = l1;
      } else if (l2 != null) {
        left = l2;
      }

      while (left != null) {
        int singleResult = left.val + carry;
        if (singleResult >= 10) {
          // 需要进位
          carry = 1;
          singleResult -= 10;
        } else {
          carry = 0;
        }

        temp.next = new ListNode(singleResult);
        temp = temp.next;
        left = left.next;
      }

      if (carry != 0) {
        temp.next = new ListNode(carry);
      }

      return result;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
