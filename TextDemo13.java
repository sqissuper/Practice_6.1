package text;

/**
 * ClassName:TextDemo13
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/23 19:54
 */
public class TextDemo13 {
//    static class SingleTon {
//        public SingleTon() {}
//        private static SingleTon singleTon = new SingleTon();
//        public static SingleTon getInstance() {
//            return singleTon;
//        }
//    }
//
//    static class Singleton{
//        public Singleton() {}
//        private static Singleton singleton = null;
//        public static Singleton getInstance() {
//            if(singleton == null) {
//                synchronized (Singleton.class) {
//                    if(singleton == null) {
//                        singleton = new Singleton();
//                    }
//                }
//            }
//            return singleton;
//        }
//    }

    //买卖股票的最好时机
//    public int maxProfit (int[] prices) {
//        int min = prices[0];
//        int max = 0;
//        for(int i = 1; i < prices.length; i++) {
//            min = Math.min(min,prices[i]);
//            max = Math.max(max,prices[i] - min);
//        }
//        return max;
//    }

    //求平方根
//    public int sqrt (int x) {
//        int left = 0,right = x;
//        while(left <= right) {
//            long mid = (right + left) / 2;
//            if(mid * mid == x) {
//                return (int)mid;
//            } else if(mid * mid < x) {
//                left = (int)(mid + 1);
//            } else {
//                right = (int)(mid - 1);
//            }
//        }
//        return right;
//    }

    // 最长公共前缀
//    public String longestCommonPrefix (String[] strs) {
//        if(strs == null || strs.length == 0) return "";
//        if(strs.length < 2) return strs[0];
//        StringBuilder sb = new StringBuilder();
//        Arrays.sort(strs);
//        char[] a = strs[0].toCharArray();
//        char[] b = strs[strs.length - 1].toCharArray();
//        for(int i = 0; i < a.length; i++) {
//            if(b.length > i && a[i] == b[i]) {
//                sb.append(a[i]);
//            } else {
//                break;
//            }
//        }
//        return sb.toString();
//    }
    public static void main(String[] args) {
//        SingleTon singleTon = new SingleTon();
//        System.out.println(singleTon);
    }
}
