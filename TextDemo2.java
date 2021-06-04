package text;

import java.util.*;

/**
 * ClassName:TextDemo2
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/3 23:17
 */
public class TextDemo2 {

    //合并有序链表
//    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
//        if(l1 == null && l2 == null) return null;
//        if(l1 == null) return l2;
//        if(l2 == null) return l1;
//        ListNode head = new ListNode(-1);
//        ListNode cur = head;
//        ListNode p1 = l1;
//        ListNode p2 = l2;
//        while(p1 != null && p2 != null) {
//            if(p1.val > p2.val) {
//                cur.next = p2;
//                p2 = p2.next;
//            } else {
//                cur.next = p1;
//                p1 = p1.next;
//            }
//            cur = cur.next;
//        }
//        if(p1 != null) {
//            cur.next = p1;
//        }
//        if(p2 != null) {
//            cur.next = p2;
//        }
//        return head.next;
//    }
    public static void main(String[] args) {

        //解读密码
//        while (sc.hasNext()) {
//            String s = sc.nextLine();
//            StringBuilder sb = new StringBuilder();
//            int n = s.length();
//            for(int i = 0; i < n; i++) {
//                if(s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) sb.append(s.charAt(i));
//            }
//            System.out.println(sb.toString());
//        }
        //计算器
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            Stack<String> sk = new Stack<>();
//            for (int i = 0; i < n; i++) {
//                String s = sc.next();
//                if(s.charAt(0) == '+') {
//                    sk.push(String.valueOf(Integer.parseInt(sk.pop()) + Integer.parseInt(sk.pop())));
//                } else if(s.charAt(0) == '*') {
//                    sk.push(String.valueOf(Integer.parseInt(sk.pop()) * Integer.parseInt(sk.pop())));
//                } else if(s.charAt(0) == '-') {
//                    int x = Integer.parseInt(sk.pop());
//                    int y = Integer.parseInt(sk.pop());
//                    sk.push(String.valueOf(y - x));
//                } else if (s.charAt(0) == '/') {
//                    int x = Integer.parseInt(sk.pop());
//                    int y = Integer.parseInt(sk.pop());
//                    sk.push(String.valueOf(y / x));
//                } else {
//                    sk.push(s);
//                }
//            }
//            System.out.println(sk.pop());
//        }
    }
}
