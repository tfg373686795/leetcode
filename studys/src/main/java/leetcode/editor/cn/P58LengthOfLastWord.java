package leetcode.editor.cn;

import com.alibaba.fastjson.JSONObject;

import java.util.Set;
import java.util.Stack;

//Java：最后一个单词的长度
//2020-08-20 09:11:37


public class P58LengthOfLastWord {
    public static void main(String[] args) {
        Solution solution = new P58LengthOfLastWord().new Solution();
        System.out.println(JSONObject.toJSONString(solution.lengthOfLastWord("q")));
    }

//给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
//
// 如果不存在最后一个单词，请返回 0 。 
//
// 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。 
//
// 
//
// 示例: 
//
// 输入: "Hello World"
//输出: 5
// 
// Related Topics 字符串 
// 👍 236 👎 0

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLastWord(String s) {
            //从后面开始倒叙
            int count = 0;
            for (int i = s.length()-1; i >= 0; i--) {
                if (s.charAt(i) == ' ') {
                    if (count != 0) {
                        return count;
                    }
                    count = 0;
                } else {
                    count++;
                }
            }
            return count;
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
