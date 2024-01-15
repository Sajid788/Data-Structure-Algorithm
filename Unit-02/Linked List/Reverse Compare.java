class Solution {

	public boolean reverseCompare(ListNode head1, ListNode head2) {
		Stack <Integer> stk1 = new Stack<>();
		Stack <Integer> stk2 = new Stack <>();
		ListNode dub1 = head1;
		
		while(dub1 !=null){
		    stk1.push(dub1.val);
		        dub1 = dub1.next;
		    }
		    ListNode dub2 = head2;
		    while(dub2 !=null){
		        stk2.push(dub2.val);
		        dub2 = dub2.next;
		    }
		    while(!stk1.empty() && !stk2.empty()){
		        if(stk1.peek()<stk2.peek()){
		            return true;
		        }
		        else if(stk1.peek()>stk2.peek()){
		            return false;
		        }else{
		            stk1.pop();
		            stk2.pop();
		        }
		    }
		    if(stk1.empty()){
		        return true;
		    }
		    else{
		        return false;
		    }
		}
		
	}
