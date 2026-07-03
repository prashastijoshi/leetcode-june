/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head;
        Map<Node,Node> maps = new HashMap<>();
        while(curr!=null){
            Node copy = new Node(curr.val);
            maps.put(curr,copy);
            curr=curr.next;
        }
        curr = head;
        while(curr!=null){
            Node copy = maps.get(curr);
            copy.next = maps.get(curr.next);
            copy.random= maps.get(curr.random);
            curr=curr.next;

        }
        return maps.get(head);
        

        
    }
}