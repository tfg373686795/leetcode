package leetcode.editor.cn;

import com.alibaba.fastjson.JSONObject;

//Java：x 的平方根
//2020-08-21 11:09:32


public class P69Sqrtx {
    public static void main(String[] args) {
        Solution solution = new P69Sqrtx().new Solution();
        System.out.println(JSONObject.toJSONString(solution.mySqrt(2147395599)));
    }

    //实现 int sqrt(int x) 函数。
//
// 计算并返回 x 的平方根，其中 x 是非负整数。 
//
// 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。 
//
// 示例 1: 
//
// 输入: 4
//输出: 2
// 
//
// 示例 2: 
//
// 输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842..., 
//     由于返回类型是整数，小数部分将被舍去。
// 
// Related Topics 数学 二分查找 
// 👍 482 👎 0
//    X*X = X^2
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int mySqrt(int x) {
            if (x == 0 || x == 1) {
                return x;
            }
            //二分发找到所有整数
            long left = 1;
            long right = x / 2 + 1;
            while (left < right) {
                long mid = (left + right + 1) >>> 1;
                Long target = mid * mid;
                if (target > x) {
                    right = mid - 1;
                } else {
                    left = mid;
                }
                System.out.println(target + "\t" + left + "\t" + right);
            }
            return (int)left;
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
