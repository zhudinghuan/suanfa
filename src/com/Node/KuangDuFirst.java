package com.Node;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * description
 *
 * @author dinghuan.zhu@china-hand.com 2022/05/04 15:45
 */
public class KuangDuFirst {

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);

        node.leftNode = node2;
        node.rightNode = node3;
        node2.leftNode = node4;
        node2.rightNode = node5;
        node3.rightNode = node6;
        node3.leftNode = node7;
        node4.leftNode = node8;
        node4.rightNode = node9;
        KuangDuFirst binTree = new KuangDuFirst();

        Deque<Node> deque = new LinkedList();
        deque.add(node);
        binTree.process(deque);
    }

    public void process( Deque<Node> deque) {

        while (!deque.isEmpty()) {
            Node node = deque.removeFirst();
            System.out.println(node.value);
            if (node.leftNode != null) {
                deque.addLast(node.leftNode);
            }
            if (node.rightNode != null) {
                deque.addLast(node.rightNode);
            }


        }


    }

}