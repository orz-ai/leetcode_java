//给你个整数数组 arr，其中每个元素都 不相同。 
//
// 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。 
//
// 
//
// 示例 1： 
//
// 输入：arr = [4,2,1,3]
//输出：[[1,2],[2,3],[3,4]]
// 
//
// 示例 2： 
//
// 输入：arr = [1,3,6,10,15]
//输出：[[1,3]]
// 
//
// 示例 3： 
//
// 输入：arr = [3,8,-10,23,19,-4,-14,27]
//输出：[[-14,-10],[19,23],[23,27]]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= arr.length <= 10^5 
// -10^6 <= arr[i] <= 10^6 
// 
// Related Topics 数组 排序 👍 95 👎 0


package leetcode.editor.cn.unsolved;

import java.util.ArrayList;
import java.util.List;

/**
 * 最小绝对差
 *
 * @author
 * @date 2022-07-04 13:08:20
 * @question_num 1200
 */
public class MinimumAbsoluteDifference {
  public static void main(String[] args) {
    //测试代码
    Solution solution = new MinimumAbsoluteDifference().new Solution();
    solution.minimumAbsDifference(new int[]{3, 7, 3, 5, 8, 9, 2, 1});
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
      quickSort(arr, 0, arr.length - 1);
      List<List<Integer>> result = new ArrayList<>();



      return null;
    }

    public void quickSort(int[] arr, int left, int right) {
      if (left > right) {
        return;
      }

      int i = left;
      int j = right;
      int base = arr[left];
      while (i != j) {
        // 从右往左找比
        while (base <= arr[j] && i < j) {
          j--;
        }

        while (base >= arr[i] && i < j) {
          i++;
        }

        if (i < j) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }

      arr[left] = arr[i];
      arr[i] = base;

      quickSort(arr, left, i - 1);
      quickSort(arr, i + 1, right);
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
