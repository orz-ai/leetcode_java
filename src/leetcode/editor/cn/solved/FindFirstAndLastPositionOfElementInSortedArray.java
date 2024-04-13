//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。 
//
// 如果数组中不存在目标值 target，返回 [-1, -1]。 
//
// 进阶： 
//
// 
// 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？ 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 8
//输出：[3,4] 
//
// 示例 2： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 6
//输出：[-1,-1] 
//
// 示例 3： 
//
// 
//输入：nums = [], target = 0
//输出：[-1,-1] 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// nums 是一个非递减数组 
// -10⁹ <= target <= 10⁹ 
// 
// Related Topics 数组 二分查找 👍 1448 👎 0

package leetcode.editor.cn.solved;

// Java：在排序数组中查找元素的第一个和最后一个位置
// question number: 34
public class FindFirstAndLastPositionOfElementInSortedArray {
	public static void main(String[] args) {
		Solution solution = new FindFirstAndLastPositionOfElementInSortedArray().new Solution();
		// TO TEST
		// System.out.println(solution.);
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public int[] searchRange(int[] nums, int target) {
			int[] result = new int[]{-1, -1};
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == target) {
					if (result[0] == -1) {
						result[0] = i;
					}
					result[1] = i;
				}
			}

			return result;
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}