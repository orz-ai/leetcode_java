//给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。 
//
// 幸运数是指矩阵中满足同时下列两个条件的元素： 
//
// 
// 在同一行的所有元素中最小 
// 在同一列的所有元素中最大 
// 
//
// 
//
// 示例 1： 
// [3,7,8]
// [9,11,13]
// [15,16,17]
// 输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
//输出：[15]
//解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
//输出：[12]
//解释：12 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
// 
//
// 示例 3： 
//
// 输入：matrix = [[7,8],[1,2]]
//输出：[7]
// 
//
// 
//
// 提示： 
//
// 
// m == mat.length 
// n == mat[i].length 
// 1 <= n, m <= 50 
// 1 <= matrix[i][j] <= 10^5 
// 矩阵中的所有元素都是不同的 
// 
// Related Topics 数组 矩阵 👍 71 👎 0

package leetcode.editor.cn.solved;

import java.util.ArrayList;
import java.util.List;

// Java：矩阵中的幸运数
// question number: 1380
public class LuckyNumbersInAMatrix {
	public static void main(String[] args) {
		Solution solution = new LuckyNumbersInAMatrix().new Solution();
		// TO TEST
		System.out.println(solution.luckyNumbers(new int[][]{
				new int[]{1, 10, 4, 2},
				new int[]{9, 3, 8, 7},
				new int[]{15, 16, 17, 12}
			})
		);
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public List<Integer> luckyNumbers(int[][] matrix) {
			int j = 0;

			List<Integer> result = new ArrayList<>();
			for (int k = 0; k < matrix.length; k++) {
				int min = 100000;
				for (int l = 0; l < matrix[k].length; l++) {
					if (min <= matrix[k][l]) {
						continue;
					}

					min = matrix[k][l];
					j = l;
				}

				if (min == 100000) {
					continue;
				}

				int a = j;
				boolean b = true;
				for (int m = 0; m < matrix.length; m++) {
					if (matrix[k][j] < matrix[m][a]) {
						b = false;
						break;
					}

					j = a;
				}

				if (!b) {
					continue;
				}

				result.add(matrix[k][j]);
			}

			return result;
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}