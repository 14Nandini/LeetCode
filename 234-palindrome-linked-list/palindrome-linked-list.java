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
    public boolean isPalindrome(ListNode head) {
        ListNode tail = head;
        int n = 1;
        while(tail.next != null) {
            tail = tail.next;
            n++;
        }
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n/2; i++) {
            st.push(head.val);
            head = head.next;
        }
        if(n % 2 != 0) head = head.next;
        while(!st.isEmpty()){
            if(st.pop() != head.val) return false;
            head = head.next;
        }
        return true;
    }
}