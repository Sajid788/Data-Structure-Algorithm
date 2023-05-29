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
  public static boolean checkForCycle(Node head){
    if(head==null){
        return false;
    }
    Node slow = head;
    Node fast = head.next;
    while(fast!=null&&fast.next!=null){
        if(slow == fast){
            return true;
        }
        slow = slow.next;
        fast = fast.next.next;
    }
    return false;
  }
}
