//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
//
// Related Topics 字符串 👍 330 👎 0


package leetcode.editor.cn.interview.srto;

/**
 * 替换空格
 * @author fallinyou
 * @date 2022-08-10 11:37:50
 * @question_num 剑指 Offer 05
 */
public class TiHuanKongGeLcof{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new TiHuanKongGeLcof().new Solution();
	 }
	 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
			return s.replace(" ", "%20");
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
