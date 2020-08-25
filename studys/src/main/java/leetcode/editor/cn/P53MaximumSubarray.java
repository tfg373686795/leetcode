package leetcode.editor.cn;

import com.alibaba.fastjson.JSONObject;

//Java：最大子序和
//2020-08-19 10:47:03


public class P53MaximumSubarray {
    public static void main(String[] args) {
        Solution solution = new P53MaximumSubarray().new Solution();
        System.out.println(JSONObject.toJSONString(solution));
    }
    //给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
// 示例: 
//
// 输入: [-2,1,-3,4,-1,2,1,-5,4]
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶: 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划 
// 👍 2309 👎 0

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            //使用栈，如果有值就弹出
            int sum = 0;
            int res = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (sum < 0) {
                    sum = 0;
                }
                sum += nums[i];
                res = Math.max(res, sum);
            }
            return res;
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
