//给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。 
//
// 
//
// 注意： 
//
// 
// 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。 
// 如果 s 中存在这样的子串，我们保证它是唯一的答案。 
//
//
// 
//
// 示例 1： 
//
// 
//输入：s = "ADOBECODEBANC", t = "ABC"
//输出："BANC"
// 
//
// 示例 2： 
//
// 
//输入：s = "a", t = "a"
//输出："a"
// 
//
// 示例 3: 
//
// 
//输入: s = "a", t = "aa"
//输出: ""
//解释: t 中两个字符 'a' 均应包含在 s 的子串中，
//因此没有符合条件的子字符串，返回空字符串。 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length, t.length <= 10⁵ 
// s 和 t 由英文字母组成 
// 
//
// 
//进阶：你能设计一个在 o(n) 时间内解决此问题的算法吗？ Related Topics 哈希表 字符串 滑动窗口 👍 1622 👎 0

package leetcode.editor.cn.solved;

// Java：最小覆盖子串
// question number: 76
public class MinimumWindowSubstring {
	public static void main(String[] args) {
		Solution solution = new MinimumWindowSubstring().new Solution();
		// TO TEST
		System.out.println(solution.minWindow("ADOBECODEBANC", "ABC"));
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public String minWindow(String s, String t) {
			// 输入：s = "ADOBECODEBANC", t = "ABC"
			// 输出："BANC"

			char[] chars = s.toCharArray(), chart = t.toCharArray();
			int n = chars.length, m = chart.length;

			int[] hash = new int[128];
			for (char ch : chart) hash[ch]--;

			String res = "";
			for (int i = 0, j = 0, cnt = 0; i < n; i++) {
				hash[chars[i]]++;
				if (hash[chars[i]] <= 0) {
					cnt++;
				}
				while (cnt == m && hash[chars[j]] > 0) {
					hash[chars[j++]]--;
				}
				if (cnt == m)
					if (res.equals("") || res.length() > i - j + 1)
						res = s.substring(j, i + 1);
			}
			return res;
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}