package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:TextDemo9
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/17 23:28
 */
public class TextDemo9 {
    //判断二叉树是否对称
//    public boolean isSymmetric (TreeNode root) {
//        if(root == null) return true;
//        return isEquals(root,root);
//    }
//    public boolean isEquals(TreeNode r1,TreeNode r2) {
//        if(r1 == null && r2 == null) return true;
//        if(r1 == null || r2 == null) return false;
//        if(r1.val != r2.val) return false;
//        return isEquals(r1.left,r2.right) && isEquals(r1.right,r2.left);
//    }

    //6 和 9 组成的最大数字
//    public int maximum69Number (int num) {
//        char[] ch = String.valueOf(num).toCharArray();
//        for(int i = 0; i < ch.length; i++) {
//            if(ch[i] - '0' == 6) {
//                ch[i] = '9';
//                break;
//            }
//        }
//        return Integer.parseInt(String.valueOf(ch));
//    }

    //字符串相加
//    public String addStrings(String num1, String num2) {
//        int m = num1.length();
//        int n = num2.length();
//        int carry = 0;
//        int i = m - 1,j = n - 1;
//        StringBuilder sb = new StringBuilder();
//        while(i >= 0 || j >= 0) {
//            int sum = carry;
//            if(i >= 0) {
//                sum += num1.charAt(i--) - '0';
//            }
//            if(j >= 0) {
//                sum += num2.charAt(j--) - '0';
//            }
//            sb.append(sum % 10);
//            carry = sum / 10;
//        }
//        if(carry > 0) sb.append(carry);
//        return sb.reverse().toString();
//    }

    //翻转字符串里的单词
//    public String reverseWords(String s) {
//        String[] strs = s.trim().split(" ");
//        StringBuilder sb = new StringBuilder();
//        for(int i = strs.length - 1; i >= 0; i--) {
//            if(!strs[i].equals("")) {
//                sb.append(strs[i]).append(" ");
//            }
//        }
//        return sb.toString().trim();
//    }

//    public List<List<Integer>> res = new ArrayList<>();
//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        List<Integer> list = new ArrayList<>();
//        if(candidates == null || candidates.length == 0) return res;
//        Arrays.sort(candidates);
//        dfs(0,candidates,target,list);
//        return res;
//    }
//    public void dfs(int idx,int[] candidates,int target,List<Integer> list) {
//        if(target < 0) return;
//        if(target == 0) {
//            res.add(new ArrayList<>(list));
//            return;
//        }
//        if(idx >= candidates.length) return;
//        for(int i = idx; i < candidates.length; i++) {
//            if(i > idx && candidates[i] == candidates[i - 1]) continue;
//            list.add(candidates[i]);
//            dfs(i + 1,candidates,target - candidates[i],list);
//            list.remove(list.size() - 1);
//        }
//    }
    public static void main(String[] args) {
    }
}
