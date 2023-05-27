/*
class Node{
  int data;
  Node next;
  
  public Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}
*/

class Solution{
  public static Node deleteNode(Node head){
     if (head == null || head.next == null)
            return null;

        Node curr = head;
        Node prev = head;
        Node x = null;

        while (prev != null && prev.next != null) {
            prev = prev.next.next;
            x = curr;
            curr = curr.next;
        }

        x.next = curr.next;
        return head;
    }

}


