package text;

/**
 * ClassName:TextDemo6
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/14 11:27
 */
public class TextDemo6 {
    //kmp算法
//    public static int kmp (String S, String T) {
//        if(S == null || T == null) return 0;
//        int n = S.length();
//        int m = T.length();
//        int count = 0;
//        for(int i = 0; i <= m - n; i++) {
//            if(i + n <= m) {
//                int j = i + n;
//                if(S.equals(T.substring(i,j))) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }


    //二叉树根节点到叶子节点和为指定值的路径
//    public ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
//        ArrayList<Integer> tmp = new ArrayList<>();
//        if(root == null) return list;
//        dfs(root,sum,tmp);
//        return list;
//    }
//    public void dfs(TreeNode root,int sum,ArrayList<Integer> tmp) {
//        if(root == null) return;
//        if(root.left == null && root. right == null && sum - root.val == 0) {
//            tmp.add(root.val);
//            list.add(new ArrayList<Integer>(tmp));
//            tmp.remove(tmp.size() - 1);
//            return;
//        }
//        tmp.add(root.val);
//        dfs(root.left,sum - root.val,tmp);
//        dfs(root.right,sum - root.val,tmp);
//        tmp.remove(tmp.size() - 1);
//    }

    //合并二叉树
//    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
//        if(t1 == null && t2 == null) return null;
//        if(t1 == null) return t2;
//        if(t2 == null) return t1;
//        TreeNode newRoot = new TreeNode(t1.val + t2.val);
//        newRoot.left = mergeTrees(t1.left,t2.left);
//        newRoot.right = mergeTrees(t1.right,t2.right);
//        return newRoot;
//    }

    //不相邻最大子序列和
//    public long subsequence (int n, int[] array) {
//        // write code here
//        if(n == 1) return array[0];
//        long[] dp = new long[n];
//        dp[0] = array[0];
//        dp[1] = Math.max(dp[0],array[1]);
//        for(int i = 2; i < n; i++) {
//            dp[i] = Math.max(dp[i - 1],dp[i - 2] + array[i]);
//        }
//        return dp[n - 1];
//    }
    public static void main(String[] args) {
//        String s = "ababab";
//        String t = "abababab";
//        System.out.println(kmp(s,t));
    }
}
