class Leetcode129 {
    public int sumNumbers(TreeNode root) {
        int[] arr = new int[1];
        helper(0 ,root ,arr);
        return arr[0];
    }

    private void helper(int num, TreeNode root, int[] arr) {
        if(root == null){
            return;
        }

        num = (num * 10) + root.val;

        if(root.left == null && root.right == null){
            arr[0] += num;
            return;
        }

        helper(num, root.left, arr);
        helper(num, root.right, arr);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}