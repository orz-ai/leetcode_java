//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−2³¹, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// Related Topics 数学 👍 3595 👎 0

package leetcode.editor.cn.interview.tophot;

// Java：整数反转
// question number: 7
// 	执行耗时:2 ms,击败了15.60% 的Java用户
//	内存消耗:38.4 MB,击败了96.54% 的Java用户
public class ReverseInteger {
  public static void main(String[] args) {
    Solution solution = new ReverseInteger().new Solution();
    // TO TEST
    System.out.println(solution.reverse(123));
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int reverse(int x) {
      String str_x = String.valueOf(x);
      char[] charArrX = str_x.toCharArray();
      StringBuilder sb = new StringBuilder();
      boolean zeroFinish = false;
      for (int i = charArrX.length - 1; i > 0; i--) {
        char arrX = charArrX[i];
        if (arrX != '0') {
          zeroFinish = true;
        }

        if (arrX == '0' && !zeroFinish) {
          continue;
        }

        sb.append(arrX);
      }
      try {

        if (charArrX[0] != '-') {
          return Integer.parseInt(sb.append(charArrX[0]).toString());

        }

        return Integer.parseInt("-" + sb);
      } catch (NumberFormatException e) {
        return 0;
      }
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}