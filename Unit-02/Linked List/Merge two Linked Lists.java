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
  public Node mergeTwoLinkedList(Node a,Node b){
    Node node  = new Node (0);
    Node temp = node;
    while(a!=null&&b!=null)
    {
        if(a.data<b.data){
        temp.next = a;
        a = a.next;
    }else{
        temp.next = b;
        b = b.next;
    }
    temp = temp.next;
  }
  if(a!=null)
  {
      temp.next = a;
  }else{
      temp.next=b;
  }
  return node.next;
  }
}
