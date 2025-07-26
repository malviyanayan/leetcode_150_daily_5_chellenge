import java.util.List;
import java.util.ArrayList;

class Leetcode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        helper(0, root, result);

        return result;
    }

    private static void helper(int index, TreeNode root, List<List<Integer>> result){
        if(root == null)return;

        if(index == result.size()){
            List<Integer> temp = new ArrayList<>();
            temp.add(root.val);
            result.add(temp);
        }else{
            List<Integer> temp = result.get(index);
            temp.add(root.val);
        }

        helper(index + 1, root.left, result);
        helper(index + 1, root.right, result);
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