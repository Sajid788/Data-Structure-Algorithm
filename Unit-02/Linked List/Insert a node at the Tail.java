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
  public static Node insertAtTail(Node a, int val){
     if(a==null){
    	a=new Node(val);
        return a;
      }
    else{
      Node temp=a;
      while(temp.next !=null) {
         temp=temp.next;
        }
      temp.next=new Node(val,null);
      return a;
    }
  }
}
