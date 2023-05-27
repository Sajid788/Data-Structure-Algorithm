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
  public static Node deleteNode(Node a,int pos){
    if(pos==0){
        return a.next;
    }
    Node temp = a;
    int i = 0;
    while(i<pos-1){
        temp = temp.next;
        i++;
    }
    temp.next = temp.next.next;
    return a;
 }
}
