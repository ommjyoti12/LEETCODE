
class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root == null)
            return root;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node t = q.remove();

                if (i < size - 1) {
                    t.next = q.peek();
                }
            
        

        if( t.left != null) {
            q.add(t.left);
        }
        if (t.right != null) {
            q.add(t.right);
        }}}

        return root;
    }
}