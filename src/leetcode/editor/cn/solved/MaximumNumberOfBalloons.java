//给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。 
//
// 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：text = "nlaebolko"
//输出：1
// 
//
// 示例 2： 
//
// 
//
// 输入：text = "loonbalxballpoon"
//输出：2
// 
//
// 示例 3： 
//
// 输入：text = "leetcode"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10^4 
// text 全部由小写英文字母组成 
// 
// Related Topics 哈希表 字符串 计数 👍 106 👎 0

package leetcode.editor.cn.solved;

import java.util.HashMap;
import java.util.Map;

// Java：“气球” 的最大数量
// question number: 1189
public class MaximumNumberOfBalloons {
	public static void main(String[] args) {
		Solution solution = new MaximumNumberOfBalloons().new Solution();
		// TO TEST
		System.out.println(solution.maxNumberOfBalloons("balon"));
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public int maxNumberOfBalloons(String text) {
			char[] chars = text.toCharArray();
			Map<String, Integer> map = new HashMap<>();
			map.put("b", 0);
			map.put("a", 0);
			map.put("l", 0);
			map.put("o", 0);
			map.put("n", 0);

			for (char aChar : chars) {
				if (!map.containsKey(String.valueOf(aChar))) {
					continue;
				}
				map.merge(String.valueOf(aChar), 1, Integer::sum);
			}

			int min = 10000;
			String minChar = "";
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				Integer value = entry.getValue();
				String key = entry.getKey();
				if (value < min) {
					min = value;
					minChar = key;
				}
			}


			if (minChar.equals("b") || minChar.equals("a") || minChar.equals("n")) {
				if (min * 2 > map.get("l") || min * 2 > map.get("o")) {
					return Math.min(map.get("l"), map.get("o")) / 2;
				}

				return min;
			}

			return min / 2;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)

}