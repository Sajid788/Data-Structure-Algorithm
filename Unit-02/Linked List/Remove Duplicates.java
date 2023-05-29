/*
class Node{
  int data;
  Node next;
  public Node(int data){
    this.next = null;
    this.data = data;
  }
  public Node(int data, Node next){
    this.next = next;
    this.data = data;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}
*/
class Solution{
  public Node removeDuplicates(Node a){
    Node curr = a;
    while(curr !=null && curr.next !=null){
        if(curr.data == curr.next.data){
            curr.next = curr.next.next;
        }else{
            curr=curr.next;
        }
    }
    return a;
  }
}
