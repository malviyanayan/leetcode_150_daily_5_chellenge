import java.util.Stack;

class Leetcode117 {
    public Node connect(Node root) {
        if (root == null)
            return root;

        Stack<Node> stk = new Stack<>();
        stk.push(root);

        Node temp = null;

        while (!stk.isEmpty()) {
            while (!stk.isEmpty()) {
                Node current = stk.pop();
                current.next = temp;
                temp = current;
            }

            while(temp != null){
                if(temp.left != null)stk.push(temp.left);
                if(temp.right != null)stk.push(temp.right);
                temp = temp.next;
            }
        }

        return root;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
