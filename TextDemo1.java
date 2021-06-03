package text;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:TextDemo1
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/1 23:05
 */
public class TextDemo1 {

    //最长公共子序列
//    public static int func(String m,String n) {
//        int x = m.length();
//        int y = n.length();
//        int[][] dp = new int[x + 1][y + 1];
//        for(int i = 1; i <= x; i++) {
//            for(int j = 1; j <= y; j++) {
//                if(m.charAt(i - 1) == n.charAt(j - 1)) {
//                    dp[i][j] = Math.max(Math.max(dp[i][j - 1],dp[i - 1][j]),dp[i - 1][j - 1] + 1);
//                } else {
//                    dp[i][j] = Math.max(dp[i][j - 1],dp[i - 1][j]);
//                }
//            }
//        }
//        return dp[x][y];
//    }


    //最长上升子序列
//    public static int func(int[] arr,int n) {
//        if(n <= 1) return n;
//        int[] dp = new int[n];
//        dp[0] = 1;
//        int max = 1;
//        for(int i = 0; i < n; i++) {
//            dp[i] = 1;
//            for(int j = 0; j < i; j++) {
//                if(arr[i] > arr[j] && dp[j] >= dp[i]) {
//                    dp[i] = dp[j] + 1;
//                    max = Math.max(dp[i],max);
//                }
//            }
//        }
//        return max;
//    }

    //发邮件
//    public static long func(int n) {
//        long[] dp = new long[22];
//        dp[0] = 0;
//        dp[1] = 0;
//        dp[2] = 1;
//        dp[3] = 2;
//        for(int i = 4; i < 22; i++) {
//            dp[i] = (i - 1) * (dp[i - 2] + dp[i - 1]);
//        }
//        return dp[n];
//    }

    //最近公共祖先
//    public TreeNode func (TreeNode root,int o1,int o2) {
//        if(root == null || root.val == o1 || root.val == o2) return root;
//        TreeNode left = func(root.left,o1,o2);
//        TreeNode right = func(root.right,o1,o2);
//        if(left == null) return right;
//        if(right == null) return left;
//        return root;
//    }

    //链表中环的入口节点
//    public ListNode detectCycle(ListNode head) {
//        if(head == null) return null;
//        ListNode fast = head;
//        ListNode slow = head;
//        while(fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow) break;
//        }
//        if(fast == null || fast.next == null) return null;
//        slow = head;
//        while(fast != slow) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return fast;
//    }
    public static void main(String[] args) {

//        int n = 7;
//        int[] arr = {1,7,3,5,9,4,8};
//        System.out.println(func(arr, n));
//        String s1 = "abcfbc";
//        String s2 = "abfcab";
//        func(s1,s2);
    }
}
