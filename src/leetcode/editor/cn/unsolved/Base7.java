//给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。 
//
// 
//
// 示例 1: 
//
// 
//输入: num = 100
//输出: "202"
// 
//
// 示例 2: 
//
// 
//输入: num = -7
//输出: "-10"
// 
//
// 
//
// 提示： 
//
// 
// -10⁷ <= num <= 10⁷ 
// 
// Related Topics 数学 👍 157 👎 0

package leetcode.editor.cn.unsolved;

// Java：七进制数
// question number: 504
public class Base7 {
	public static void main(String[] args) {
		Solution solution = new Base7().new Solution();
		// TO TEST
		System.out.println(solution.convertToBase7(-103));
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public String convertToBase7(int num) {
			if (num == 0) {
				return "0";
			}
			return (num >= 0 ? "" : "-") + convert("", Math.abs(num));
		}

		private String convert(String s, int num) {
			if (num == 0) {
				return s;
			}

			return convert(num % 7 + s, num / 7);
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}