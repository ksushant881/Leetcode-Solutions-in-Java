package com.leetcode;

import com.leetcode.Utils.ListNode;

import com.company.Utils.ListNode;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        OddEvenLinkedList t = new OddEvenLinkedList();
        ListNode ans = t.oddEvenList(head);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd = new ListNode(head.val, null);
        ListNode even = new ListNode(head.next.val, null);
        ListNode temp = head.next.next;
        boolean flag = true;
        ListNode head1 = new ListNode();
        head1 = odd;
        ListNode head2 = new ListNode();
        head2 = even;
        while (temp != null) {
            if (flag) {
                ListNode t1 = new ListNode(temp.val, null);
                head1.next = t1;
                head1 = head1.next;
            } else {
                ListNode t1 = new ListNode(temp.val, null);
                head2.next = t1;
                head2 = head2.next;
            }
//            System.out.println(temp.val);
            temp = temp.next;
            flag = !flag;
        }
//        ListNode ans = odd;
//        while(ans!=null){
//            System.out.print(ans.val+" ");
//            ans=ans.next;
//        }
//        System.out.println();
//        ans = even;
//        while(ans!=null) {
//            System.out.print(ans.val + " ");
//            ans = ans.next;
//        }
//        System.out.println();
        head1.next = even;
        ListNode res = odd;
        return res;
    }
}


