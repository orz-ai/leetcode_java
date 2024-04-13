//给定一个表示整数的字符串 n ，返回与它最近的回文整数（不包括自身）。如果不止一个，返回较小的那个。 
//
// “最近的”定义为两个整数差的绝对值最小。 
//
// 
//
// 示例 1: 
//
// 
//输入: n = "123"
//输出: "121"
// 
//
// 示例 2: 
//
// 
//输入: n = "1"
//输出: "0"
//解释: 0 和 2是最近的回文，但我们返回最小的，也就是 0。
// 
//
// 
//
// 提示: 
//
// 
// 1 <= n.length <= 18 
// n 只由数字组成 
// n 不含前导 0 
// n 代表在 [1, 10¹⁸ - 1] 范围内的整数 
// 
// Related Topics 数学 字符串 👍 129 👎 0

package leetcode.editor.cn.unsolved;
// Java：寻找最近的回文数
// question number: 564
public class FindTheClosestPalindrome{
  public static void main(String[] args) {
    // 12312
    Solution solution = new FindTheClosestPalindrome().new Solution();
    // TO TEST
    // System.out.println(solution.);
  }
    
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String nearestPalindromic(String n) {
      // fixme
      char[] chars = n.toCharArray();
      for (int i = 0; i < chars.length / 2; i++) {
      }
      return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}