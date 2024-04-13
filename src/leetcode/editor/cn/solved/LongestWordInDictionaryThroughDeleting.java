//给你一个字符串 s 和一个字符串数组 dictionary ，找出并返回 dictionary 中最长的字符串，该字符串可以通过删除 s 中的某些字符得到。
// 
//
// 如果答案不止一个，返回长度最长且字母序最小的字符串。如果答案不存在，则返回空字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
//输出："apple"
// 
//
// 示例 2： 
//
// 
//输入：s = "abpcplea", dictionary = ["a","b","c"]
//输出："a"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// 1 <= dictionary.length <= 1000 
// 1 <= dictionary[i].length <= 1000 
// s 和 dictionary[i] 仅由小写英文字母组成 
// 
// Related Topics 数组 双指针 字符串 排序 👍 287 👎 0

package leetcode.editor.cn.solved;

import java.util.Arrays;
import java.util.List;

// Java：通过删除字母匹配到字典里最长单词
// question number: 524
public class LongestWordInDictionaryThroughDeleting {
	public static void main(String[] args) {
		Solution solution = new LongestWordInDictionaryThroughDeleting().new Solution();
		// TO TEST
		System.out.println(solution.findLongestWord("abpcplea", Arrays.asList("ale","apple","monkey","plea")));
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public String findLongestWord(String s, List<String> dictionary) {
			dictionary.sort((a, b) -> {
				if (a.length() != b.length()) {
					return b.length() - a.length();
				}

				return a.compareTo(b);
			});
			char[] sChars = s.toCharArray();
			for (String s1: dictionary) {
				char[] dChars = s1.toCharArray();
				int k = 0;
				for (int j = 0; j < sChars.length; j++) {
					if (k == dChars.length) {
						return s1;
					}

					if (sChars[j] == dChars[k]) {
						k++;
					}
				}

				if (k == dChars.length) {
					return s1;
				}
			}

			return "";
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}