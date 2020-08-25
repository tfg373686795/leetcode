package leetcode.editor.cn;
//Java：两数之和

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 8920 👎 0

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;

//2020-08-18 14:14:02
public class P1TwoSum {
    public static void main(String[] args) {
        Solution solution = new P1TwoSum().new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 11, 20};
        int target = 15;

        System.out.println(JSONObject.toJSONString(solution.twoSum(nums, target)));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            //定义返回数组
            int[] result = new int[2];
            //定义一个map存放 数据和游标
            HashMap<Integer, Integer> items = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int temp = target - nums[i];
                if (items.containsKey(temp)) {
                    result[0] = items.get(temp);
                    result[1] = i;
                    return result;
                } else {
                    items.put(nums[i], i);
                }
            }
            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}