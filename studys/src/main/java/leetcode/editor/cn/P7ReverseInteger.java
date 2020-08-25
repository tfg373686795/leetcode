package leetcode.editor.cn;

import com.alibaba.fastjson.JSONObject;

//Java：整数反转
//2020-08-18 14:35:02

//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学 
// 👍 2112 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            //获取最后一位
            int pop = x % 10;
            x = x / 10;
            //判断是否正溢出
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            //判断是否负溢出
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            result = result * 10 + pop;    //求出反转整数
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


public class P7ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(JSONObject.toJSONString(solution.reverse(1231231121)));
    }
}
