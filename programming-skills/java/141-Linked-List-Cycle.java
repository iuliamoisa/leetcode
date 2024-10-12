/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        /*
        turtle - slow pointer
        rabbit - fast pointer

        turtle.next => rabbit.next.next
         */

         ListNode turtle = head;
         if(head == null || head.next == null) return false;
         ListNode rabbit = head.next;
         while(turtle != rabbit && 
         rabbit.next != null && rabbit.next.next != null){
            turtle = turtle.next;
            rabbit = rabbit.next.next;
         }
         return turtle == rabbit;
    }
}
