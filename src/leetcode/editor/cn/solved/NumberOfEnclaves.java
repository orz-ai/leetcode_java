//给你一个大小为 m x n 的二进制矩阵 grid ，其中 0 表示一个海洋单元格、1 表示一个陆地单元格。 
//
// 一次 移动 是指从一个陆地单元格走到另一个相邻（上、下、左、右）的陆地单元格或跨过 grid 的边界。 
//
// 返回网格中 无法 在任意次数的移动中离开网格边界的陆地单元格的数量。 
//
// 
//
// 示例 1： 
//
// [0,0,0,0]
// [1,0,1,0]
// [0,1,1,0]
// [0,0,0,0]
//输入：grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
//输出：3
//解释：有三个 1 被 0 包围。一个 1 没有被包围，因为它在边界上。
// 
//
// 示例 2： 
//
//
// [0,1,1,0]
// [0,0,1,0]
// [0,0,1,0]
// [0,0,0,0]
//输入：grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
//输出：0
//解释：所有 1 都在边界上或可以到达边界。
// 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 500 
// grid[i][j] 的值为 0 或 1 
// 
// Related Topics 深度优先搜索 广度优先搜索 并查集 数组 矩阵 👍 80 👎 0

package leetcode.editor.cn.solved;

// Java：飞地的数量
// question number: 1020
// 		9:43	info
// 		解答成功:
// 		执行耗时:4 ms,击败了83.75% 的Java用户
// 		内存消耗:49.5 MB,击败了6.02% 的Java用户
public class NumberOfEnclaves {
	public static void main(String[] args) {
		Solution solution = new NumberOfEnclaves().new Solution();
		// TO TEST
		// System.out.println(solution.);
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public int numEnclaves(int[][] grid) {
			// fixme
			int m = grid.length;
			int n = grid[0].length;

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
						dfs(grid, i, j);
					}
				}
			}

			int rst = 0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (grid[i][j] == 1) {
						rst++;
					}
				}
			}

			return rst;
		}

		public void dfs(int[][] grid, int i, int j) {
			if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] == -1) {
				return;
			}

			grid[i][j] = -1;

			// 上
			dfs(grid, i - 1, j);

			dfs(grid, i + 1, j);

			dfs(grid, i, j + 1);

			dfs(grid, i, j - 1);
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}