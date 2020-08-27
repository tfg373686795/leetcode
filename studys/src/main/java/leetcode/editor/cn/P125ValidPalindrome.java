package leetcode.editor.cn;

import com.alibaba.fastjson.JSONObject;

//Java：验证回文串
//2020-08-27 10:18:09


public class P125ValidPalindrome {
    public static void main(String[] args) {
        Solution solution = new P125ValidPalindrome().new Solution();
        System.out.println(JSONObject.toJSONString(solution.isPalindrome("1b1")));
    }
    //给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 示例 1: 
//
// 输入: "A man, a plan, a canal: Panama"   AmanaplanacanalPanama
//输出: true
// 
//
// 示例 2: 
//
// 输入: "race a car"
//输出: false
// 
// Related Topics 双指针 字符串 
// 👍 265 👎 0

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                //判断 left位置字符是 字母 还是符号

                if (!(s.charAt(left) <= 'z' && s.charAt(left) >= 'a') && !(s.charAt(left) <= 'Z' && s.charAt(left) >= 'A') && !(s.charAt(left)<='9' && s.charAt(left)>='0')) {
                    left++;
                    continue;
                }
                if (!(s.charAt(right) <= 'z' && s.charAt(right) >= 'a') && !(s.charAt(right) <= 'Z' && s.charAt(right) >= 'A')  && !(s.charAt(right)<='9' && s.charAt(right)>='0')) {
                    right--;
                    continue;
                }
                System.out.println( Character.toLowerCase(s.charAt(left)) + "\t" +Character.toLowerCase(s.charAt(right))  );
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
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

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
