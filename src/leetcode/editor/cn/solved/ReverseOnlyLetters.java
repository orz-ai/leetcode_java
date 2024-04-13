//给你一个字符串 s ，根据下述规则反转字符串： 
//
// 
// 所有非英文字母保留在原有位置。 
// 所有英文字母（小写或大写）位置反转。 
// 
//
// 返回反转后的 s 。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：s = "ab-cd"
//输出："dc-ba"
// 
//
// 
// 
//
// 示例 2： 
//
// 
//输入：s = "a-bC-dEf-ghIj"
//输出："j-Ih-gfE-dCba"
// 
//
// 
// 
//
// 示例 3： 
//
// 
//输入：s = "Test1ng-Leet=code-Q!"
//输出："Qedo1ct-eeLg=ntse-T!"
// 
//
// 
//
// 提示 
//
// 
// 1 <= s.length <= 100 
// s 仅由 ASCII 值在范围 [33, 122] 的字符组成 
// s 不含 '\"' 或 '\\' 
// 
// Related Topics 双指针 字符串 👍 148 👎 0

package leetcode.editor.cn.solved;

// Java：仅仅反转字母
// question number: 917
public class ReverseOnlyLetters {
	public static void main(String[] args) {
		Solution solution = new ReverseOnlyLetters().new Solution();
		// TO TEST
		System.out.println(solution.reverseOnlyLetters("ab-cd"));
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public String reverseOnlyLetters(String s) {
			char[] chars = s.toCharArray();
			int l = 0;
			int r = chars.length - 1;
			while (l <= r) {
				if (!isZiMu(chars[r])) {
					r--;
					continue;
				}

				if (!isZiMu(chars[l])) {
					l++;
					continue;
				}

				char temp = chars[r];
				chars[r] = chars[l];
				chars[l] = temp;
				r--;
				l++;
			}

			return String.valueOf(chars);
		}

		private boolean isZiMu(char aChar) {
			return (aChar >= 'A' && aChar <= 'Z') || (aChar >= 'a' && aChar <= 'z');
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}