package leetcode.editor.cn;

import com.alibaba.fastjson.JSONObject;

//Java：实现 strStr()
//2020-08-18 15:40:23


public class P28ImplementStrstr {
    public static void main(String[] args) {
        Solution solution = new P28ImplementStrstr().new Solution();
        System.out.println(JSONObject.toJSONString(solution.strStr("a","a")));
    }
//实现 strStr() 函数。
//
// 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如
//果不存在，则返回 -1。 
//
// 示例 1: 
//
// 输入: haystack = "hello", needle = "ll"
//输出: 2
// 
//
// 示例 2: 
//
// 输入: haystack = "aaaaa", needle = "bba"
//输出: -1
// 
//
// 说明: 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。 
// Related Topics 双指针 字符串 
// 👍 535 👎 0

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int strStr(String haystack, String needle) {
            if (haystack.length() < needle.length()) {
                return -1;
            } else if (needle.length() == 0) {
                return 0;
            }
            for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
                // 定义 k 来与 target 进行挨个比对
                int k = i;
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(k) == needle.charAt(j)) {
                        // 最后一个字符匹配完成，输出答案
                        if (j == needle.length() - 1) {
                            return i;
                        }
                        k++;
                    }
                    // 其中一个字符无法匹配，直接退出做下一次循环
                    else {
                        break;
                    }
                }
            }


        return -1;

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
