//在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个
//整数，判断数组中是否含有该整数。 
//
// 
//
// 示例: 
//
// 现有矩阵 matrix 如下： 
//
// 
//[
//  [1,   4,  7, 11, 15],
//  [2,   5,  8, 12, 19],
//  [3,   6,  9, 16, 22],
//  [10, 13, 14, 17, 24],
//  [18, 21, 23, 26, 30]
//]
// 
//
// 给定 target = 5，返回 true。 
//
// 给定 target = 20，返回 false。 
//
// 
//
// 限制： 
//
// 0 <= n <= 1000 
//
// 0 <= m <= 1000 
//
// 
//
// 注意：本题与主站 240 题相同：https://leetcode-cn.com/problems/search-a-2d-matrix-ii/ 
//
// Related Topics 数组 二分查找 分治 矩阵 👍 756 👎 0


package leetcode.editor.cn.interview.srto;

/**
 * 二维数组中的查找
 *
 * @author fallinyou
 * @date 2022-08-10 09:46:24
 * @question_num 剑指 Offer 04
 *
 * 	执行耗时:0 ms,击败了100.00% 的Java用户
 * 	内存消耗:47 MB,击败了89.96% 的Java用户
 */
public class ErWeiShuZuZhongDeChaZhaoLcof {
  public static void main(String[] args) {
    //测试代码
    Solution solution = new ErWeiShuZuZhongDeChaZhaoLcof().new Solution();
    System.out.println(solution.findNumberIn2DArray(
      new int[][]{
        {1 ,3 ,5}
//        , {3}, {5},
      },
      5
    ));
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
      if(matrix.length == 0){
        return false;
      }

      int i = matrix.length - 1, j = 0;
      int m = matrix[0].length;

      while (i >= 0 && j <= m - 1) {
        int current = matrix[i][j];
        if (current < target) {
          j++;
          continue;
        }

        if (current == target) {
          return true;
        }

        i--;
      }

      return false;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
