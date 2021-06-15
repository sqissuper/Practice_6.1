package text;

/**
 * ClassName:TextDemo7
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/14 19:49
 */
public class TextDemo7 {
    //删除有序链表中重复的元素
//    public ListNode deleteDuplicates (ListNode head) {
//        if(head == null || head.next == null) return head;
//        ListNode newHead = new ListNode(0);
//        ListNode prev = newHead;
//        ListNode cur = head;
//        while(cur != null) {
//            if(cur.next != null && cur.val == cur.next.val) {
//                while(cur.next != null && cur.val == cur.next.val) {
//                    cur = cur.next;
//                }
//            } else {
//                prev.next = cur;
//                cur = cur.next;
//                prev = prev.next;
//            }
//        }
//        return newHead.next;
//    }

    //二叉树的之字形层序遍历
//    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        if(root == null) return list;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root);
//        int n = 0;
//        while(!q.isEmpty()) {
//            ArrayList<Integer> ret = new ArrayList<>();
//            int size = q.size();
//            while(size != 0) {
//                TreeNode cur = q.poll();
//                if(cur.left != null) q.offer(cur.left);
//                if(cur.right != null) q.offer(cur.right);
//                if(n % 2 == 0) {
//                    ret.add(cur.val);
//                } else {
//                    ret.add(0,cur.val);
//                }
//                size--;
//            }
//            list.add(ret);
//            n++;
//        }
//        return list;
//    }

//    public ListNode partition (ListNode head, int x) {
//        // write code here
//        if(head == null || head.next == null) return head;
//        if(x == 0) return head;
//        ListNode newHead = new ListNode(0);
//        ListNode newHead2 = new ListNode(0);
//        ListNode prev1 = newHead;
//        ListNode prev2 = newHead2;
//        ListNode cur = head;
//        while(cur != null) {
//            if(cur.val < x) {
//                prev1.next = cur;
//                prev1 = prev1.next;
//            } else {
//                prev2.next = cur;
//                prev2 = prev2.next;
//            }
//            cur = cur.next;
//        }
//        prev1.next = newHead2.next;
//        prev2.next = null;
//        return newHead.next;
//    }

    //链表内指定区间反转
//    public ListNode reverseBetween (ListNode head, int m, int n) {
//        // write code here
//        if(head == null || head.next == null) return head;
//        ListNode newHead = new ListNode(0);
//        newHead.next = head;
//        ListNode prev = newHead;
//        ListNode cur = head;
//        for(int i = 1; i < m; i++){
//            prev = cur;
//            cur = cur.next;
//        }
//        for(int i = 0; i < n - m; i++){
//            ListNode curNext = cur.next;
//            cur.next = curNext.next;
//            curNext.next = prev.next;
//            prev.next = curNext;
//        }
//        return newHead.next;
//    }

    //链表的奇偶重排
//    public ListNode oddEvenList (ListNode head) {
//        // write code here
//        if(head == null || head.next == null) return head;
//        ListNode odd = new ListNode(0);
//        ListNode node = odd;
//        ListNode cur = head;
//        ListNode prev = head;
//        int count = 0;
//        while(cur != null) {
//            if(count % 2 != 0) {
//                prev.next = cur.next;
//                ListNode tmp = cur;
//                tmp.next = null;
//                node.next = tmp;
//                node = node.next;
//                cur = prev;
//            }
//            prev = cur;
//            cur = cur.next;
//            count++;
//        }
//        prev.next = odd.next;
//        return head;
//    }
    public static void main(String[] args) {

    }
}
