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
    public int getDecimalValue(ListNode head) {
        String ans="";
        ListNode temp=head;
        while(temp!=null){
            ans+=temp.val;
            temp=temp.next;
        }
        //bin to decimal
        int len=ans.length();int num=0;int p2=1;
        for(int i=len-1;i>=0;i--){
            if(ans.charAt(i)=='1'){
                num=num+p2;
            }
            p2=p2*2;
        }
        return num;
    }
}