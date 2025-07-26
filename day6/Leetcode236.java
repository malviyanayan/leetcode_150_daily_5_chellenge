// import java.util.List;
// import java.util.ArrayList;

class Leetcode236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if root is null or matches either p or q
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recurse on left and right subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both sides return non-null, root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the non-null child
        return left != null ? left : right;
    }

    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

    //     // find path of node 1
    //     StringBuilder pPath = new StringBuilder();
    //     find(p, root, pPath);

    //     // find path of node 2


    //     // match common path of both node


    //     // use common path and find final node


    //     // return that node

    //     return null;
    // }

    // private boolean find(TreeNode p, TreeNode root, StringBuilder pPath) {
    //     if(root == null)return false;
    //     else if(root == p){
    //         return true;
    //     }

    //     // check for left
    //     pPath.append('0');
    //     boolean left = find(p, root, pPath);
    //     if(!left)pPath.deleteCharAt(pPath.length()-1);
    //     else return true;

    //     // check for right
    // }




    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    // if(root == null)return null;
    // if(find(root.left,p) && find(root.right,q)) return root;
    // if(root.left == null && root.right == null)return null;
    // TreeNode left = lowestCommonAncestor(root.left, p, q);
    // if(left != null)return left;
    // else return lowestCommonAncestor(root.right, p, q);
    // }

    // private static final boolean find(TreeNode root,TreeNode p){
    // if(root == null)return false;
    // if(root == p)return true;

    // return find(root.left, p) || find(root.right, p);
    // }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}