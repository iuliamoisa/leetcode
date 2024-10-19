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

        // another solution: using hashSet
        //iterate through the list and add each node
        //to a hashset/hashmap
        //if there's another one pointing there-> cycle
        // Set<ListNode> storage = new HashSet<>();
        // ListNode current = head;
        // while (current != null) {
        //     if (storage.contains(current)) {
        //         return true;
        //     }
        //     storage.add(current);
        //     current = current.next;
        // }
        // return false;
    }
}
