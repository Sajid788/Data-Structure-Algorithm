class Solution{ 
    Queue<Integer> queue = new LinkedList<>();
    public void push(int data){
         queue.add(data);
        for ( int i=0; i<queue.size()-1;i++){
            queue.add(queue.poll());
        }
    }
    public void pop(){
        queue.poll();
    }
    public int top(){
         return queue.peek();
    }
}
