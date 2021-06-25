package text;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName:TextDemo15
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/25 16:33
 */
public class TextDemo15 {

    //以栈化队
//    public Stack<Integer> s1;
//    public Stack<Integer> s2;
//
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
//        while(s1.size() != 0) {
//            s2.push(s1.pop());
//        }
//        int res = s2.pop();
//        while(s2.size() != 0) {
//            s1.push(s2.pop());
//        }
//        return res;
//    }
//
//    public int peek() {
//        while(s1.size() != 0) {
//            s2.push(s1.pop());
//        }
//        int res = s2.peek();
//        while(s2.size() != 0) {
//            s1.push(s2.pop());
//        }
//        return res;
//    }
//
//    public boolean empty() {
//        return s1.isEmpty() && s2.isEmpty();
//    }

    //化队为栈
//    public Queue<Integer> q1;
//    public Queue<Integer> q2;
//    public MyStack() {
//        q1 = new LinkedList<>();
//        q2 = new LinkedList<>();
//    }
//
//    public void push(int x) {
//        q1.offer(x);
//    }
//
//    public int pop() {
//        if(empty()) return -1;
//        while(q1.size() != 1) {
//            q2.offer(q1.poll());
//        }
//        int res = q1.poll();
//        while(q2.size() != 0) {
//            q1.offer(q2.poll());
//        }
//        return res;
//    }
//
//    public int top() {
//        if(empty()) return -1;
//        while(q1.size() != 1) {
//            q2.offer(q1.poll());
//        }
//        int res = q1.peek();
//        q2.offer(q1.poll());
//        while(q2.size() != 0) {
//            q1.offer(q2.poll());
//        }
//        return res;
//    }
//
//    public boolean empty() {
//        return q1.isEmpty() && q2.isEmpty();
//    }

//    Stack<Integer> s;
//    Stack<Integer> minS;
//    public MinStack() {
//        s = new Stack<>();
//        minS = new Stack<>();
//    }
//
//    public void push(int val) {
//        s.push(val);
//        if(minS.isEmpty()) {
//            minS.push(val);
//        } else if(val <= minS.peek()) {
//            minS.push(val);
//        }
//    }
//
//    public void pop() {
//        int x = s.pop();
//        if(x == minS.peek()) {
//            minS.pop();
//        }
//    }
//
//    public int top() {
//        return s.peek();
//    }
//
//    public int getMin() {
//        return minS.peek();
//    }
    public static void main(String[] args) {

    }
}
