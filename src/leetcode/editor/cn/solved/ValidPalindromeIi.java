//给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "aba"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "abca"
//输出: true
//解释: 你可以删除c字符。
// 
//
// 示例 3: 
//
// 
//输入: s = "abc"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 10⁵ 
// s 由小写英文字母组成 
// 
// Related Topics 贪心 双指针 字符串 👍 448 👎 0

package leetcode.editor.cn.solved;

// Java：验证回文字符串 Ⅱ
// question number: 680
public class ValidPalindromeIi {
	public static void main(String[] args) {
		Solution solution = new ValidPalindromeIi().new Solution();
		// TO TEST
		System.out.println(solution.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public boolean validPalindrome(String s) {
			// abcbca
			// aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga
			char[] chars = s.toCharArray();
			return valid(chars, 0, chars.length - 1, 0);
		}

		public boolean valid(char[] s, int left, int right, int cnt) {
			if (cnt > 1) {
				return false;
			}

			if (left > right) {
				return true;
			}

			if (s[left] != s[right]) {
				return valid(s, left + 1, right, cnt + 1) || valid(s, left, right - 1, cnt + 1);
			}

			return valid(s, left + 1, right - 1, cnt);
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}