//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。 
//
// 算法的时间复杂度应该为 O(log (m+n)) 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -10⁶ <= nums1[i], nums2[i] <= 10⁶ 
// 
// Related Topics 数组 二分查找 分治 👍 4987 👎 0

package leetcode.editor.cn.solved;

// Java：寻找两个正序数组的中位数
// question number: 4
public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		Solution solution = new MedianOfTwoSortedArrays().new Solution();
		// TO TEST
		System.out.println(solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		// 1,2,3,4,5,7,9    2,4,6,8,10
		// 1,2,2,3,4,4,5,6,7,8,9,10
		public double findMedianSortedArrays(int[] nums1, int[] nums2) {
			if (nums1.length == 0) {
				if (nums2.length % 2 == 0) {
					return (double) (nums2[nums2.length / 2] + nums2[nums2.length / 2 - 1]) / 2;
				} else {
					return nums2[nums2.length / 2];
				}
			}

			if (nums2.length == 0) {
				if (nums1.length % 2 == 0) {
					return (double) (nums1[nums1.length / 2] + nums1[nums1.length / 2 - 1]) / 2;
				} else {
					return nums1[nums1.length / 2];
				}
			}

			int[] merged = new int[nums1.length + nums2.length];
			int i = 0, j = 0, k = 0;
			int len = merged.length;
			while (i < nums1.length && j < nums2.length) {
				if (nums1[i] < nums2[j]) {
					merged[k] = nums1[i];
					i++;
				} else {
					merged[k] = nums2[j];
					j++;
				}

				k++;
			}

			if (i < nums1.length) {
				for (int l = i; l < nums1.length; l++, k++) {
					merged[k] = nums1[l];
				}
			}

			if (j < nums2.length) {
				for (int l = j; l < nums2.length; l++, k++) {
					merged[k] = nums2[l];
				}
			}

			if (len % 2 == 0) {
				return (double) (merged[len / 2] + merged[len / 2 - 1]) / 2;
			}

			return merged[len / 2];
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}