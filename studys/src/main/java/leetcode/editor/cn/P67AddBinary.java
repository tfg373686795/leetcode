package leetcode.editor.cn;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

//Java：二进制求和
//2020-08-20 11:38:50


public class P67AddBinary {
    public static void main(String[] args) {
        Solution solution = new P67AddBinary().new Solution();
        System.out.println(JSONObject.toJSONString(solution.addBinary("1010", "1011")));
    }
    //给你两个二进制字符串，返回它们的和（用二进制表示）。
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 数学 字符串 
// 👍 460 👎 0

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {

            int min = Math.min(a.length(), b.length())-1;
            int[] result = new int[100];
            for (int i = min; i >= 0; i--) {
                //获取当前两个字符串
                int i1 = Integer.parseInt(String.valueOf(Integer.parseInt(String.valueOf(a.charAt(min))) + Integer.parseInt(String.valueOf(b.charAt(min)))));
                System.out.println(i1);
                result[min] = i1;
            }


            System.out.println(JSONObject.toJSONString(result));
            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
