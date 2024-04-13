//给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a² + b² = c 。 
//
// 
//
// 示例 1： 
//
// 
//输入：c = 5
//输出：true
//解释：1 * 1 + 2 * 2 = 5
// 
//
// 示例 2： 
//
// 
//输入：c = 3
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 0 <= c <= 2³¹ - 1 
// 
// Related Topics 数学 双指针 二分查找 👍 327 👎 0

package leetcode.editor.cn.solved;

// Java：平方数之和
// question number: 633
public class SumOfSquareNumbers {
	public static void main(String[] args) {
		Solution solution = new SumOfSquareNumbers().new Solution();
		// TO TEST
		System.out.println(solution.judgeSquareSum(2147483645));
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public boolean judgeSquareSum(int c) {
			if (c == 1) {
				return true;
			}

			int sqrtC = (int) Math.sqrt(c);
			for (int i = 0; i <= sqrtC; i++) {
				double sqrtCI = Math.sqrt(c - i * i);
				if (sqrtCI == (int) sqrtCI) {
					return true;
				}

			}

			return false;
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}