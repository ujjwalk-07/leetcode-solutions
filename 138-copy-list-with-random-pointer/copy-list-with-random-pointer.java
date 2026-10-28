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
        Node temp = head;
         if (head == null) {
    return null;
}
       
        while(temp != null)
        {
            Node clonenode = new Node(temp.val);
            clonenode.next = temp.next ;
            temp.next = clonenode ;
            temp = clonenode.next;
           
        }
        temp = head;
        while(temp != null){
            Node oldnode = temp;
            Node newnode = temp.next;

            //new node ka random --> oldnode 

            if(oldnode.random != null){
                newnode.random = oldnode.random.next;

            }
            //temp ko age move krdo
            temp=newnode.next ;
        }

        //detach 
        temp = head;
        Node anslisthead = head.next;
        while(temp != null){
            Node oldnode = temp;
            Node clonenode = temp.next;
            //detach ka logic 
            oldnode.next = clonenode.next;
            if(clonenode.next != null){
                clonenode.next = clonenode.next.next;
            }
            temp=oldnode.next;
        }
        return anslisthead ;
    }
}