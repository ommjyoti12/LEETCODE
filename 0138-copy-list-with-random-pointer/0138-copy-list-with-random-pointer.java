

class Solution {
    public Node copyRandomList(Node head) {

        // Step 1: Original node -> Copy node
        HashMap<Node, Node> map = new HashMap<>();

        Node temp = head;

        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        // Step 2: Set next and random pointers
        temp = head;

        while (temp != null) {

            Node copy = map.get(temp);

            // Set next
            copy.next = map.get(temp.next);

            // Set random
            copy.random = map.get(temp.random);

            temp = temp.next;
        }

        return map.get(head);
    }
}