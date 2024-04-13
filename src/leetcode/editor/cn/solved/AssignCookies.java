//假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。 
//
// 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。如果 s[j] >= g[
//i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。 
// 
//
// 示例 1: 
//
// 
//输入: g = [1,2,3], s = [1,1]
//输出: 1
//解释: 
//你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
//虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
//所以你应该输出1。
// 
//
// 示例 2: 
//
// 
//输入: g = [1,2], s = [1,2,3]
//输出: 2
//解释: 
//你有两个孩子和三块小饼干，2个孩子的胃口值分别是1,2。
//你拥有的饼干数量和尺寸都足以让所有孩子满足。
//所以你应该输出2.
// 
//
// 
//
// 提示： 
//
// 
// 1 <= g.length <= 3 * 10⁴ 
// 0 <= s.length <= 3 * 10⁴ 
// 1 <= g[i], s[j] <= 2³¹ - 1 
// 
// Related Topics 贪心 数组 排序 👍 430 👎 0

package leetcode.editor.cn.solved;

// Java：分发饼干
// question number: 455
public class AssignCookies {
	public static void main(String[] args) {
		Solution solution = new AssignCookies().new Solution();
		System.out.println(solution.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
		// TO TEST
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		/**
		 * @param g 胃口
		 * @param s 饼干大小
		 */
		public int findContentChildren(int[] g, int[] s) {
			quickSort(g, 0, g.length - 1);
			quickSort(s, 0, s.length - 1);
			int i = 0;
			int j = 0;
			while (i < g.length && j < s.length) {
				if (g[i] <= s[j]) i++;
				j++;
			}

			return i;
		}

		public void quickSort(int[] array, int left, int right) {
			if (left > right) {
				return;
			}

			int i = left;
			int j = right;
			int base = array[left];
			while (i != j) {
				// 从右到左找比base小的
				while (base <= array[j] && i < j) {
					j--;
				}

				// 从左到右找比base大的
				while (base >= array[i] && i < j) {
					i++;
				}

				if (i < j) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

			array[left] = array[i];
			array[i] = base;

			quickSort(array, left, i - 1);
			quickSort(array, i + 1, right);
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}