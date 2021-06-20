package com.company.leetCode;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 * Follow up: Could you do this in one pass?
 *
 *
 *
 * Example 1:
 *
 *
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * Example 2:
 *
 * Input: head = [1], n = 1
 * Output: []
 * Example 3:
 *
 * Input: head = [1,2], n = 1
 * Output: [1]
 *
 *
 * Constraints:
 *
 * The number of nodes in the list is sz.
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 *
 *
 * Summary
 * This article is for beginners. It introduces the following idea: Linked List traversal and removal of nth element from the end.
 *
 * Solution
 * Approach 1: Two pass algorithm
 * Intuition
 *
 * We notice that the problem could be simply reduced to another one :
 * Remove the (L - n + 1)(L−n+1) th node from the beginning in the list ,
 * where LL is the list length. This problem is easy to solve once we found list length LL.
 *
 * Algorithm
 *
 * First we will add an auxiliary "dummy" node, which points to the list head.
 * The "dummy" node is used to simplify some corner cases such as a list with only one node, or removing the head of the list.
 * On the first pass, we find the list length LL. Then we set a pointer to the dummy node and start to move it through the list till it comes to the
 * (L - n)(L−n) th node. We relink next pointer of the (L - n)(L−n) th node to the (L - n + 2)(L−n+2) th node and we are done.
 *
 * Remove the nth element from a list
 *
 * public ListNode removeNthFromEnd(ListNode head, int n) {
 *     ListNode dummy = new ListNode(0);
 *     dummy.next = head;
 *     int length  = 0;
 *     ListNode first = head;
 *     while (first != null) {
 *         length++;
 *         first = first.next;
 *     }
 *     length -= n;
 *     first = dummy;
 *     while (length > 0) {
 *         length--;
 *         first = first.next;
 *     }
 *     first.next = first.next.next;
 *     return dummy.next;
 * }
 */
//public class RemoveNthNodeFromEndofList {
//
//    public class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode() {
//        }
//
//        ListNode(int val) {
//            this.val = val;
//        }
//
//          ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//
//            public ListNode removeNthFromEnd (ListNode head,int n){
//
//            }
//
//        }
//
//
//    }
//}


