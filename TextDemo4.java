package text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName:TextDemo4
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/8 12:59
 */
public class TextDemo4 {
//    public static List<List<Integer>> list = new ArrayList<>();

//
    //判断一个链表是否为回文结构
//public boolean isPail (ListNode head) {
//    if(head == null || head.next == null) return false;
//    ListNode fast = head;
//    ListNode slow = head;
//    while(fast != null && fast.next != null) {
//        fast = fast.next.next;
//        slow = slow.next;
//    }
//    ListNode prev = null;
//    while(slow != null) {
//        ListNode slowNext = slow.next;
//        slow.next = prev;
//        prev = slow;
//        slow = slowNext;
//    }
//    fast = head;
//    while(prev != null) {
//        if(fast.val != prev.val) return false;
//        fast = fast.next;
//        prev = prev.next;
//    }
//    return true;
//}
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            int m = sc.nextInt();

//            List<Integer> tmp = new ArrayList<>();
//            dfs(1,n,m,tmp);
//            for(List<Integer> ret : list) {
//                for(int i = 0; i < ret.size(); i++) {
//                    System.out.print(ret.get(i) + " ");
//                }
//                System.out.println();
//            }

//            int[] arr = new int[n];
//            for(int i = 1; i <= n; i++) {
//                arr[i - 1] = i;
//            }
//            List<Integer> tmp = new ArrayList<>();
//            int sum = 0;
//            dfs(0,arr,n,m,tmp,sum);
//            for(List<Integer> ret : list) {
//                for(int i = 0; i < ret.size(); i++) {
//                    System.out.print(ret.get(i) + " ");
//                }
//                System.out.println();
//            }
        }

//        while (in.hasNext()) {
//            String s = in.nextLine();
//            String[] str = s.trim().split("[^a-zA-Z]");
//            StringBuilder sb = new StringBuilder();
//            for(int i = str.length - 1; i >= 0; i--) {
//                sb.append(str[i]).append(" ");
//            }
//            System.out.println(sb.toString().trim());
//        }
        //骆驼命名法
//        while (sc.hasNext()) {
//            String s = sc.nextLine();
//            StringBuilder sb = new StringBuilder();
//            for(int i = 0; i < s.length(); i++) {
//                if(s.charAt(i) == '_') {
//                    ++i;
//                    sb.append((char)(s.charAt(i) - 32));
//                } else {
//                    sb.append(s.charAt(i));
//                }
//            }
//            System.out.println(sb.toString());
//        }
//    }

//    public static void dfs(int index,int n,int m,List<Integer> tmp) {
//        if(m == 0) {
//            list.add(new ArrayList<>(tmp));
//        }
//        for(int i = index; i <= n && i <= m; i++) {
//            tmp.add(i);
//            dfs(i + 1,n,m - i,tmp);
//            tmp.remove(tmp.size() - 1);
//        }
//    }
//    public static void dfs(int index,int[] arr,int n,int m,List<Integer> tmp,int sum) {
//        if(sum == m) {
//            list.add(new ArrayList<>(tmp));
//            sum = 0;
//        } else if(sum > n) {
//            return;
//        }
//        for(int i = index; i < n; i++) {
//            tmp.add(arr[i]);
//            sum += arr[i];
//            dfs(i + 1,arr,n,m,tmp,sum);
//            tmp.remove(tmp.size() - 1);
//            sum -= arr[i];
//        }
//    }
}
