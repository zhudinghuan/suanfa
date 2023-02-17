//package com.Node;
//
///**
// * description
// *
// * @author dinghuan.zhu@china-hand.com 2022/05/03 16:53
// */
//public class NodeReverve {
//    LinkedList.Node node = null;
//
//    public void init(){
//        LinkedList.Node node1 = new LinkedList.Node(10);
//        LinkedList.Node node2 = new LinkedList.Node(20);
//        LinkedList.Node node3 = new LinkedList.Node(30);
//        LinkedList.Node node4 = new LinkedList.Node(40);
//        node = node1;
//        node1.child = node2;
//        node2.child = node3;
//        node3.child = node4;
//
//    }
//
//
//    public void testReverse(){
//        LinkedList.show(node);
//        System.out.println("----------------------");
//        LinkedList.Node reverseNode =LinkedList.reverse(node);
//        LinkedList.show(reverseNode);
//    }
//}
// class LinkedList {
//    public static Node reverse(Node head){
//        //如果链表头为null或链表只有一个节点，无需反转，直接返回
//        if (null == head || null == head.child){
//            return head;
//        }
//        // 当前节点的前一个节点
//        Node pre = null;
//        // 当前节点
//        Node cur = head;
//        // 当前节点的后一个节点
//        Node next = null;
//        while (cur != null){
//            next = cur.child; //next节点指向当前节点的后一个节点
//            cur.child = pre;//当前节点的child指向当前节点的前一个节点，反转的关键，此时链表断开
//            pre = cur;// 当前节点的前一节点向后移动
//            cur = next;// 当前节点向后移动
//        }
//        return pre;
//    }
//
//    public static class Node<E>{
//        E item;
//        Node child;
//        public Node(E item){
//            this.item = item;
//        }
//    }
//}
