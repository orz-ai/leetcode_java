//将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。 
//
// 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下： 
//
// 
//P   A   H   N
//A P L S I I G
//Y   I   R 
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。 
//
// 请你实现这个将字符串进行指定行数变换的函数： 
//
// 
//string convert(string s, int numRows); 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "PAYPALISHIRING", numRows = 3
//输出："PAHNAPLSIIGYIR"
// 
//示例 2：
//
// 
//输入：s = "PAYPALISHIRING", numRows = 4
//输出："PINALSIGYAHRPI"
//解释：
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
// 
//
// 示例 3： 
//
// 
//输入：s = "A", numRows = 1
//输出："A"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 由英文字母（小写和大写）、',' 和 '.' 组成 
// 1 <= numRows <= 1000 
// 
// Related Topics 字符串 👍 1549 👎 0

package leetcode.editor.cn.solved.medium;

// Java：Z 字形变换
// question number: 6
public class ZigzagConversion {
	public static void main(String[] args) {
		Solution solution = new ZigzagConversion().new Solution();
		// TO TEST
		System.out.println(solution.convert("AB", 1));
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public String convert(String s, int numRows) {
			/**
			 * 			解答成功:
			 * 			执行耗时:247 ms,击败了5.09% 的Java用户
			 * 			内存消耗:49.4 MB,击败了5.00% 的Java用户
			 */
			int len = s.length();
			char[] chars = s.toCharArray();
			if (s.length() <= numRows || numRows == 1) {
				return s;
			}

			char[][] arr = new char[1000][1000];
			int i = 0, j = 0, k = 0;
			boolean isDown = true;
			while (k < len) {
				// 竖着走
				if (isDown) {
					while (i < numRows && k < len) {
						arr[i][j] = chars[k];
						i++;
						k++;
					}

					isDown = false;
					continue;
				}

				i--;
				// 斜着走
				while (i > 0 && k < len) {
					j++;
					i--;
					arr[i][j] = chars[k];
					k++;
				}
				i++;

				isDown = true;
			}

			StringBuilder sb = new StringBuilder();
			for (int l = 0; l < numRows; l++) {
				for (int m = 0; m < arr[0].length; m++) {
					if (arr[l][m] != 0) {
						sb.append(arr[l][m]);
					}
				}
			}

			return sb.toString();
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}