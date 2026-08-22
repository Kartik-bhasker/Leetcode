/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //length of LL
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        int k=cnt-n+1;
        if(k==1){
            head=head.next;
            return head;
        }
        cnt=0;ListNode prev=null;ListNode temp2=head;
        while(temp2!=null){
            cnt++;
            if(cnt==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp2;
            temp2=temp2.next;
        }
        return head;
    }
}