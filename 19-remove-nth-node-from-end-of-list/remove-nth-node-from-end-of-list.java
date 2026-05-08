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
        
        int size = 1;

        ListNode temp = head;

        while(temp.next != null){
            temp = temp.next;
            size++;
        }

        int del = size - n;

        if(del == 0){
            return head.next;
        }

        ListNode ans = head;



        while(ans.next != null){
            if(del == 1){
                ans.next = ans.next.next;
                break;
            }
            ans = ans.next;
            del--;
        }

        return head;
    }
}