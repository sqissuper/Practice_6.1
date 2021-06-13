package text;

import java.util.Scanner;

/**
 * ClassName:TextDemo5
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/9 22:53
 */
public class TextDemo5 {
    //乒乓球框
//    public static String func(String s1,String s2) {
//        int n = s1.length();
//        int m = s2.length();
//        int[] arr1 = new int[26];
//        int[] arr2 = new int[26];
//        for(int i = 0; i < n; i++) {
//            arr1[s1.charAt(i) - 'A']++;
//        }
//        for(int i = 0; i < m; i++) {
//            arr2[s2.charAt(i) - 'A']++;
//        }
//        for(int i = 0; i < m; i++) {
//            if(arr1[s2.charAt(i) - 'A'] == 0 || (arr1[s2.charAt(i) - 'A'] < arr2[s2.charAt(i) - 'A'])) {
//                return "No";
//            }
//        }
//        return "Yes";
//    }


//    public int MoreThanHalfNum_Solution(int [] array) {
//        int n = array.length;
//        for(int i = 0; i < n; i++) {
//            int tmp = array[i];
//            int j = 0;
//            for(j = i - 1; j >= 0; j--) {
//                if(array[j] > tmp) {
//                    array[j + 1] = array[j];
//                } else {
//                    break;
//                }
//            }
//            array[j + 1] = tmp;
//        }
//        return array[n / 2];
//    }


    //左右最值最大差
//    public static int findMaxGap(int[] A, int n) {
//        int k = n - 2;
//        int max = Math.abs(A[0] - A[n - 1]);
//        int maxLeft = 0;
//        for(int i = 0; i <= k; i++) {
//            if(A[i] > maxLeft) {
//                maxLeft = A[i];
//            }
//            int maxRight = 0;
//            for(int j = n - 1; j > i; j--) {
//                if(A[j] > maxRight) {
//                    maxRight = A[j];
//                }
//                if(Math.abs(maxLeft - maxRight) > max) {
//                    max = Math.abs(maxLeft - maxRight);
//                }
//            }
//        }
//        return max;
//    }
    public static void main(String[] args) {
//        int[] arr = {2,7,3,1,1};
//        int n = 5;
//        System.out.println(findMaxGap(arr, n));
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String s1 = in.nextLine();
//            String s2 = in.nextLine();
//            System.out.println(func(s1,s2));
//        }
    }
}
