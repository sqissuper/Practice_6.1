package text;

import java.io.Serializable;
import java.util.*;

/**
 * ClassName:TextDemo10
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/20 11:12
 */
public class TextDemo10 {

    //两数之和 II - 输入有序数组
//    public int[] twoSum(int[] numbers, int target) {
//        int[] ret = new int[2];
//        for(int i = 0; i < numbers.length; i++) {
//            for(int j = i + 1; j < numbers.length; j++) {
//                if(numbers[i] + numbers[j] == target) {
//                    ret[0] = i + 1;
//                    ret[1] = j + 1;
//                }
//            }
//        }
//        return ret;
//    }

    //杨辉三角 II
//    public List<Integer> getRow(int rowIndex) {
//        int[][] arr = new int[rowIndex + 1][rowIndex + 1];
//        List<Integer> list = new ArrayList<>();
//        if(rowIndex == 0) {
//            list.add(1);
//            return list;
//        }
//        arr[0][0] = 1;
//        for(int i = 1; i <= rowIndex; i++) {
//            arr[i][0] = 1;
//            int j;
//            for(j = 1; j < i; j++) {
//                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
//            }
//            arr[i][j] = 1;
//
//            if(i == rowIndex) {
//                for(int k = 0; k <= rowIndex; k++) {
//                    list.add(arr[rowIndex][k]);
//                }
//            }
//        }
//        return list;
//
//    }

    //重塑矩阵
//    public int[][] matrixReshape(int[][] mat, int r, int c) {
//        int m = mat.length,n = mat[0].length;
//        if(m * n != r * c) return mat;
//        int[] nums = new int[r * c];
//        int k = 0;
//        for(int i = 0; i < m; i++) {
//            for(int j = 0; j < n ;j++) {
//                nums[k++] = mat[i][j];
//            }
//        }
//        k = 0;
//        int[][] arr = new int[r][c];
//        for(int i = 0; i < r; i++) {
//            for(int j = 0; j < c; j++) {
//                arr[i][j] = nums[k++];
//            }
//        }
//        return arr;
//    }

    //二叉树根节点到叶子节点的所有路径和
    // public int sumNumbers (TreeNode root) {
    //        return dfs(root,0);
    //    }
    //    public int dfs(TreeNode root,int sum) {
    //        if(root == null) return 0;
    //        sum = sum * 10 + root.val;
    //        if(root.left == null && root.right == null) return sum;
    //        return dfs(root.left,sum) + dfs(root.right,sum);
    //    }



//    public static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
//    public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
//        int n = num.length;
//        if(n == 0 || num == null) return res;
    //    Arrays.sort(num);
//        ArrayList<Integer> list = new ArrayList<>();
//        dfs(num,list,new boolean[num.length]);
//        return res;
//    }
//    public static void dfs(int[] num,ArrayList<Integer> list,boolean[] f) {
//        if(list.size() == num.length) {
//            res.add(new ArrayList<>(list));
//            return;
//        }
//        for(int i = 0; i < num.length; i++) {
//            if(f[i]) continue;
//            if(i > 0 && num[i] == num[i - 1] && !f[i - 1]) continue;
//            f[i] = true;
//            list.add(num[i]);
//            dfs(num,list,f);
//            list.remove(list.size() - 1);
//            f[i] = false;
//        }
//    }
    public static void main(String[] args) {
//        int[] arr = {1,1,2};
//        permuteUnique(arr);
//        String s = "abcd";
//        int k = 2;
//        System.out.println(reverseStr(s, k));
//        int[][] nums = {{1,2},{3,4}};
//        int r = 1,c = 4;
//        nums = matrixReshape(nums, r, c);
//        System.out.println(Arrays.toString(nums));
    }
}
