/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
	
	public boolean checkWavePattern(ListNode head) {
		ListNode temp = head;
		int turn = 0;
		if(temp.val<temp.next.val){
		    while(temp.next !=null){
		        if(turn%2==0 && temp.val>temp.next.val){
		            return false;
		        }
		      if(turn%2==1 && temp.val<temp.next.val){
		          return false;
		      }
		      temp = temp.next;
		      turn++;
		    }
		}
		else if(temp.val>temp.next.val){
		    while(temp.next !=null){
		        if(turn%2==0 && temp.val<temp.next.val){
		            return false;
		        }
		        if(turn%2==1 && temp.val>temp.next.val){
		            return false;
		        }
		        temp = temp.next;
		        turn++;
		    }
		}
		return true;
	}
}
