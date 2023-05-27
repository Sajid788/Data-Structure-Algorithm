/*
class Node{
	int data;
	Node next;

	Node(){
		this.data = 0;
		this.next = null;
	}
	Node(Node next,int data){
		this.data = data;
		this.next = next; 
	}
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
*/

class Solution{
  public int middleNode(Node head){
    Node i = head;
    Node j = head;
    while(j!=null&&j.next!=null){
        i = i.next;
        j = j.next.next;
    }
    return i.data;
  }
}
