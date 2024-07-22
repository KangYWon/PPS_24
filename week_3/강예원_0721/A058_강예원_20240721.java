package week_3.강예원_0721;
//singly linked list가 주어졌을 때, 반대로 출력하는 문제.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next; // 현재 노드의 다음 노드
            current.next = prev; // 현재 노드의 링크를 이전 노드로 변경
            prev = current; // 이전 노드를 현재 노드로 업데이트
            current = next; // 현재 노드를 다음 노드로 이동
        }

        return prev;
    }
}