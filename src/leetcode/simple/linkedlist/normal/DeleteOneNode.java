package leetcode.simple.linkedlist.normal;

import leetcode.ListNode;

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。

 现有一个链表 -- head = [4,5,1,9]，它可以表示为:

 4 -> 5 -> 1 -> 9
 示例 1:

 输入: head = [4,5,1,9], node = 5
 输出: [4,1,9]
 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.

 题意：给定任意一个链表，删掉给定的节点，不使用遍历，理解题意是难点
 * Created by zhaiyi on 2018/9/8.
 */
public class DeleteOneNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
