package com.company.leetCode;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
///**
// * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
// *
// * Example 1:
// *
// *
// * Input: l1 = [1,2,4], l2 = [1,3,4]
// * Output: [1,1,2,3,4,4]
// * Example 2:
// *
// * Input: l1 = [], l2 = []
// * Output: []
// * Example 3:
// *
// * Input: l1 = [], l2 = [0]
// * Output: [0]
// *
// *
// * Constraints:
// *
// * The number of nodes in both lists is in the range [0, 50].
// * -100 <= Node.val <= 100
// * Both l1 and l2 are sorted in non-decreasing order.
// */
//
//class ListNode {
//    int val;
//
//    ListNode next;
//
//    ListNode() {
//
//    }
//    ListNode(int val) {
//        this.val = val;
//    }
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
//
//public class MergeTwoSortedList {
//
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode listNode = new ListNode();
//
//    }
//}

import java.util.LinkedList;

class Node{
    int data;
    Node next;
    Node head;

    Node(int data){
        this.data = data;
    }

    public static int countNodes(Node head){
        int n = 1;
        Node current = head;
        while (current.next != null){
            current = current.next;
            n++;
        }
        return n;
    }

    public static void push(int data){

        Node newNode = new Node(data);
    }

    public static void main(String[] args){

        LinkedList n = new LinkedList();



    }
 }

