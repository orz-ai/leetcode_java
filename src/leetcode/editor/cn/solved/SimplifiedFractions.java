//给你一个整数 n ，请你返回所有 0 到 1 之间（不包括 0 和 1）满足分母小于等于 n 的 最简 分数 。分数可以以 任意 顺序返回。 
//
// 
//
// 示例 1： 
//
// 输入：n = 2
//输出：["1/2"]
//解释："1/2" 是唯一一个分母小于等于 2 的最简分数。 
//
// 示例 2： 
//
// 输入：n = 3
//输出：["1/2","1/3","2/3"]
// 
//
// 示例 3： 
//
// 输入：n = 4
//输出：["1/2","1/3","1/4","2/3","3/4"]
//解释："2/4" 不是最简分数，因为它可以化简为 "1/2" 。 
//
// 示例 4： 
//
// 输入：n = 1
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 100 
// 
// Related Topics 数学 字符串 数论 👍 56 👎 0

package leetcode.editor.cn.solved;

import java.util.ArrayList;
import java.util.List;

// Java：最简分数
// question number: 1447
public class SimplifiedFractions {
	public static void main(String[] args) {
		Solution solution = new SimplifiedFractions().new Solution();
		// TO TEST
		System.out.println(solution.simplifiedFractions(4));
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public List<String> simplifiedFractions(int n) {
			List<String> result = new ArrayList<>();
			for (int i = 2; i <= n; i++) {
				for (int j = 1; j < i; j++) {
					if ((i % 2 == 0 && j % 2 == 0) || (j != 1 && i % j == 0)) {
						continue;
					}

					int gcd = gcd(j, i);
					if (gcd > 1) {
						continue;
					}

					result.add(j + "/" + i);
				}
			}
			return result;
		}

		public int gcd(int i, int j) {
			return j == 0 ? i : gcd(j, i % j);
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}