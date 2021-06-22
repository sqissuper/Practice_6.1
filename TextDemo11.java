package text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ClassName:TextDemo11
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/21 16:36
 */
public class TextDemo11 {
    //字符串出现次数的TopK问题
//    public String[][] topKstrings (String[] strings, int k) {
//        String[][] strs = new String[k][2];
//        HashMap<String,Integer> map = new HashMap<>();
//        for(int i = 0; i < strings.length; i++) {
//            if(map.containsKey(strings[i])) {
//                int tmp = map.get(strings[i]);
//                map.put(strings[i],tmp + 1);
//            } else {
//                map.put(strings[i],1);
//            }
//        }
//        Set<String> set = map.keySet();
//        List<String> list = new ArrayList<>(set);
//        list.sort((s1,s2)-> map.get(s1).equals(map.get(s2)) ? s1.compareTo(s2) : map.get(s2) - map.get(s1));
//        for(int i = 0; i < k; i++) {
//            strs[i][0] = list.get(i);
//            strs[i][1] = String.valueOf(map.get(list.get(i)));
//        }
//        return strs;
//    }

    //最大数
//    public String solve (int[] nums) {
//        // write code here
//        if(nums == null || nums.length == 0) return "";
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = 0; j < nums.length - 1; j++) {
//                String a = String.valueOf(nums[j]);
//                String b = String.valueOf(nums[j + 1]);
//                String num1 = a + b,num2 = b + a;
//                if((Integer.parseInt(num1)) < (Integer.parseInt(num2))) {
//                    int tmp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = tmp;
//                }
//            }
//        }
//        for(int x : nums) {
//            sb.append(x);
//        }
//        String res = sb.toString();
//        char[] ch = res.toCharArray();
//        for(char c : ch) {
//            if(c - '0' != 0) {
//                return res;
//            }
//        }
//        return "0";
//    }

    //剑指 Offer 24. 反转链表
//    public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null) return head;
//        ListNode prev = null;
//        ListNode cur = head;
//        while(cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        return prev;
//    }

    //反转字符串中的单词 III
//    public String reverseWords(String s) {
//        if(s == null || s.length() == 0) return s;
//        String[] strs = s.trim().split(" ");
//        StringBuilder sb = new StringBuilder();
//        for(String S : strs) {
//            String tmp = reverse(S.toCharArray());
//            sb.append(tmp).append(" ");
//        }
//        return sb.toString().trim();
//    }
//    public String reverse(char[] ch) {
//        int i = 0,j = ch.length - 1;
//        while(i < j) {
//            char tmp = ch[i];
//            ch[i] = ch[j];
//            ch[j] = tmp;
//            i++;
//            j--;
//        }
//        return String.valueOf(ch);
//    }

    //剑指 Offer 25. 合并两个排序的链表
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if(l1 == null && l2 == null) return null;
//        if(l1 == null) return l2;
//        if(l2 == null) return l1;
//        ListNode newHead = new ListNode(0);
//        ListNode prev = newHead;
//        while(l1 != null && l2 != null) {
//            if(l1.val > l2.val) {
//                prev.next = l2;
//                l2 = l2.next;
//            } else {
//                prev.next = l1;
//                l1 = l1.next;
//            }
//            prev = prev.next;
//        }
//        if(l1 != null) prev.next = l1;
//        if(l2 != null) prev.next = l2;
//        return newHead.next;
//    }
    public static void main(String[] args) {

    }
}
