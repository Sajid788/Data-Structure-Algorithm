/*
class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}
*/
class Solution{
  public Node addOneToLinkedList(Node head){
    head=Rev(head);
    Node temp = head;
    while(temp!=null){
        if(temp.data!=9){
            temp.data++;
            break;
        }else{
            temp.data = 0;
            if(temp.next==null){
                temp.data=0;
                Node N = new Node(1);
                temp.next = N;
                break;
            }
            else
              temp=temp.next;
            
        }
    }
    head  = Rev(head);
    return head;
  }
  public static Node Rev(Node head){
      Node pre = null;
      Node curr = head;
      while(curr!=null){
          Node next = curr.next;
          curr.next = pre;
          pre = curr;
          curr = next;
      }
      return pre;
  }
}
