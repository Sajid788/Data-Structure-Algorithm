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
	
	public boolean evenOddMix(ListNode head) {
	  ListNode temp = head;
		int cnt = 1;
		while(temp !=null){
		    if(cnt%2!= 0 && temp.val%2==0){
		        cnt++;
		        temp = temp.next;
		    }else if(cnt%2 == 0 && temp.val%2!=0){
		        cnt++;
		       temp=temp.next;
		    }else{
		           return false;
		       }
		}
		return true;
	}
}
