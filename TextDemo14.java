package text;

/**
 * ClassName:TextDemo14
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/25 14:51
 */
public class TextDemo14 {

    //判断一棵二叉树是否为搜索二叉树和完全二叉树
//    public boolean[] judgeIt (TreeNode root) {
//        boolean[] f = new boolean[2];
//        f[0] = search(root);
//        f[1] = balance(root);
//        return f;
//    }
//    public boolean search(TreeNode root) {
//        if(root == null) return true;
//        if(root.left != null) {
//            if(root.val < root.left.val) return false;
//            if(root.left.right != null && root.left.right.val > root.val) return false;
//        }
//        if(root.right != null) {
//            if(root.right.val < root.val) return false;
//            if(root.right.left != null && root.right.left.val < root.val) return false;
//        }
//        return search(root.left) && search(root.right);
//    }
//    public boolean balance(TreeNode root) {
//        if(root == null) return true;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        boolean leaf = false;
//        while(!queue.isEmpty()) {
//            int size = queue.size();
//            for(int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                if(leaf && (node.left != null || node.right != null)) return false;
//                if(node.left == null && node.right != null) return false;
//                if(node.left != null) queue.offer(node.left);
//                if(node.right != null) {
//                    queue.offer(node.right);
//                } else {
//                    leaf = true;
//                }
//            }
//        }
//        return true;
//    }

//    public List<Integer> list = new ArrayList<>();
//    public int[] inorderTraversal (TreeNode root) {
//        orderTravel(root);
//        int[] arr = new int[list.size()];
//        for(int i = 0; i < list.size(); i++) {
//            arr[i] = list.get(i);
//        }
//        return arr;
//    }
//    public void orderTravel(TreeNode root) {
//        if(root == null) return;
//        orderTravel(root.left);
//        list.add(root.val);
//        orderTravel(root.right);
//    }

//    public int uniquePaths (int m, int n) {
//        int[][] dp = new int[m][n];
//        for(int i = 0; i < m; i++) {
//            dp[i][0] = 1;
//        }
//        for(int i = 0; i < n; i++) {
//            dp[0][i] = 1;
//        }
//        for(int i = 1; i < m; i++) {
//            for(int j = 1; j < n; j++) {
//                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//            }
//        }
//        return dp[m - 1][n - 1];
//    }
    public static void main(String[] args) {

    }
}
