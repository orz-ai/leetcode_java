//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 
//
// 给你一个可能存在 重复 元素值的数组 numbers ，它原来是一个升序排列的数组，并按上述情形进行了一次旋转。请返回旋转数组的最小元素。例如，数组 [3
//,4,5,1,2] 为 [1,2,3,4,5] 的一次旋转，该数组的最小值为1。 
//
// 示例 1： 
//
// 
//输入：[3,4,5,1,2]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：[2,2,2,0,1]
//输出：0
// 
//
// 注意：本题与主站 154 题相同：https://leetcode-cn.com/problems/find-minimum-in-rotated-
//sorted-array-ii/ 
// Related Topics 数组 二分查找 👍 516 👎 0

package leetcode.editor.cn.solved;

// Java：旋转数组的最小数字
// question number: 剑指 Offer 11
public class XuanZhuanShuZuDeZuiXiaoShuZiLcof {
	public static void main(String[] args) {
		Solution solution = new XuanZhuanShuZuDeZuiXiaoShuZiLcof().new Solution();
		// TO TEST
		// System.out.println(solution.);
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public int minArray(int[] numbers) {
			int l = 0;
			int r = numbers.length - 1;
			int min = Integer.MAX_VALUE;

			while (l <= r) {
				int mid = l + r >> 1;
				if (numbers[mid] == numbers[l]) {
					if (min > numbers[l]) {
						min = numbers[l];
					}

					l++;
					continue;
				}

				if (numbers[l] > numbers[mid]) {
					if (min > numbers[mid]) {
						min = numbers[mid];
					}
					r = mid - 1;
				} else {
					if (min > numbers[l]) {
						min = numbers[l];
					}
					l = mid + 1;
				}
			}
			return min;
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}