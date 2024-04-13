//找出数组中重复的数字。 
//
// 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
//请找出数组中任意一个重复的数字。 
//
// 示例 1： 
//
// 输入：
//[2, 3, 1, 0, 2, 5, 3]
//输出：2 或 3 
// 
//
// 
//
// 限制： 
//
// 2 <= n <= 100000 
//
// Related Topics 数组 哈希表 排序 👍 917 👎 0

package leetcode.editor.cn.interview.srto;

import java.util.HashMap;
import java.util.Map;

/**
 * 解答成功:
 * 	执行耗时:8 ms,击败了13.32% 的Java用户
 * 	内存消耗:51.6 MB,击败了5.03% 的Java用户
 */

// Java：数组中重复的数字
// question number: 剑指 Offer 03
public class ShuZuZhongZhongFuDeShuZiLcof {
  public static void main(String[] args) {
    Solution solution = new ShuZuZhongZhongFuDeShuZiLcof().new Solution();
    // TO TEST
    System.out.println(solution.findRepeatNumber(new int[]{1, 2, 3, 3}));
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int findRepeatNumber(int[] nums) {
      Map<Integer, Integer> map = new HashMap<>();
      for (int num : nums) {
        Integer merge = map.merge(num, 1, Integer::sum);
        if(merge >= 2){
          return num;
        }
      }


      return 0;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}