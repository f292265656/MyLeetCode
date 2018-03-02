package com.test;

import org.junit.Test;

import com.algorithm.DelNodeInLinkedList;
import com.common.ListNode;

public class TestDelNodeInLinkedList {

    @Test
    public void testDeleteNode() {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        
        DelNodeInLinkedList delNodeInLinkedList=new DelNodeInLinkedList();
        delNodeInLinkedList.deleteNode(node3);
        System.out.println(node1);
        
    }

}
