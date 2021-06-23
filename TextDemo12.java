package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:TextDemo12
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/23 16:05
 */
public class TextDemo12 {
    //剑指 Offer 38. 字符串的排列
//    public static List<String> list = new ArrayList<>();
//    public static String[] permutation(String s) {
//        char[] c = s.toCharArray();
//        dfs(c,"",new boolean[c.length]);
//        String[] strs = new String[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            strs[i] = list.get(i);
//        }
//        return strs;
//    }
//    public static void dfs(char[] c,String s,boolean[] f) {
//        if(s.length() == c.length) {
//            list.add(s);
//            return;
//        }
//        for(int i = 0; i < c.length; i++) {
//            if(f[i]) continue;
//            if(i > 0 && c[i] == c[i - 1] && f[i - 1]) continue;
//            f[i] = true;
//            dfs(c,s + c[i],f);
//            f[i] = false;
//        }
//    }

    //全排列 II
//    public List<List<Integer>> res = new ArrayList<>();
//    public List<List<Integer>> permuteUnique(int[] nums) {
//        if(nums == null || nums.length == 0) return res;
//        Arrays.sort(nums);
//        dfs(nums,new ArrayList<>(),new boolean[nums.length]);
//        return res;
//    }
//    public void dfs(int[] nums,List<Integer> list,boolean[] f) {
//        if(list.size() == nums.length) {
//            res.add(new ArrayList<>(list));
//            return;
//        }
//        for(int i = 0; i < nums.length; i++) {
//            if(f[i]) continue;
//            if(i > 0 && nums[i] == nums[i - 1] && f[i - 1]) continue;
//            list.add(nums[i]);
//            f[i] = true;
//            dfs(nums,list,f);
//            list.remove(list.size() - 1);
//            f[i] = false;
//        }
//    }

    //NC105 二分查找-II
//    public static int search (int[] nums, int target) {
//        int left = 0,right = nums.length - 1;
//        while(left < right) {
//            int mid = (left + right) / 2;
//            if(nums[mid] < target) {
//                left = mid;
//            } else if(nums[mid] > target) {
//                while(mid > 0 && nums[mid] == nums[mid - 1]) {
//                    mid--;
//                }
//                right = mid;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
    public static void main(String[] args) {
//        String s = "aab";
//        String[] str = permutation(s);
//        System.out.println(Arrays.toString(str));
    }
}
