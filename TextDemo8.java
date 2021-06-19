package text;

import java.util.*;

/**
 * ClassName:TextDemo8
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/16 21:30
 */
public class TextDemo8 {
    //二叉树最近公共祖先
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root == null) return null;
//        if(root == p || root == q) return root;
//        TreeNode left = lowestCommonAncestor(root.left,p,q);
//        TreeNode right = lowestCommonAncestor(root.right,p,q);
//        if(left != null && right != null) return root;
//        if(left != null) return left;
//        if(right != null) return right;
//        return null;
//    }

    // 字母异位词分组
//    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<String,List<String>> map = new HashMap<>();
//        for(String str : strs) {
//            char[] ch = str.toCharArray();
//            Arrays.sort(ch);
//            String key = String.valueOf(ch);
//            if(!map.containsKey(key)) {
//                map.put(key,new ArrayList<>());
//            }
//            map.get(key).add(str);
//        }
//        return new ArrayList<>(map.values());
//    }

    //. 链表的中间结点
//    public ListNode middleNode(ListNode head) {
//        if(head == null || head.next == null) return head;
//        ListNode fast = head;
//        ListNode slow = head;
//        while(fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return slow;
//    }

    //用栈实现队列
//    public Stack<Integer> s1;
//    public Stack<Integer> s2;
//    public MyQueue() {
//        s1 = new Stack<>();
//        s2 = new Stack<>();
//    }
//
//    public void push(int x) {
//        s1.push(x);
//    }
//
//    public int pop() {
//        while(!s1.isEmpty()) {
//            s2.push(s1.pop());
//        }
//        int res = s2.pop();
//        while(!s2.isEmpty()) {
//            s1.push(s2.pop());
//        }
//        return res;
//    }
//
//    public int peek() {
//        while(!s1.isEmpty()) {
//            s2.push(s1.pop());
//        }
//        int res = s2.peek();
//        while(!s2.isEmpty()) {
//            s1.push(s2.pop());
//        }
//        return res;
//    }
//
//    public boolean empty() {
//        return s1.isEmpty();
//    }

    //两个链表生成相加链表
//    public ListNode addInList (ListNode head1, ListNode head2) {
//        // write code here
//        if(head1 == null && head2 == null) return null;
//        if(head1 == null) return head2;
//        if(head2 == null) return head1;
//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();
//        while(head1 != null || head2 != null) {
//            if(head1 != null) {
//                sb1.append(head1.val);
//                head1 = head1.next;
//            }
//            if(head2 != null) {
//                sb2.append(head2.val);
//                head2 = head2.next;
//            }
//        }
//        return func(sb1.toString(),sb2.toString());
//    }
//    public ListNode func(String s1,String s2) {
//        int m = s1.length();
//        int n = s2.length();
//        int i = m - 1,j = n - 1;
//        ListNode head = null;
//        int carry = 0;
//        while(i >= 0 || j >= 0) {
//            int sum = carry;
//            if(i >= 0) {
//                sum += s1.charAt(i--) - '0';
//            }
//            if(j >= 0) {
//                sum += s2.charAt(j--) - '0';
//            }
//            if(head == null) {
//                head = new ListNode(sum % 10);
//            } else {
//                ListNode node = new ListNode(sum % 10);
//                node.next = head;
//                head = node;
//            }
//            carry = sum / 10;
//        }
//        if(carry > 0) {
//            ListNode node = new ListNode(carry);
//            node.next = head;
//            head = node;
//        }
//        return head;
//    }
    public static void main(String[] args) {

    }
}
