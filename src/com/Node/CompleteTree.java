package com.Node;

import com.Node.KuangDuFirst;
import com.Node.Node;

import java.util.Deque;
import java.util.LinkedList;

/**
 * description
 *
 * @author dinghuan.zhu@china-hand.com 2022/05/12 21:29
 */
public class CompleteTree {
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
        Node node10 = new Node(10);

        node.leftNode = node2;
        node.rightNode = node3;
        node2.leftNode = node4;
        node2.rightNode = node5;
        node3.rightNode = node6;
        node3.leftNode = node7;
//        node4.leftNode = node8;
        node4.rightNode = node9;
//        node6.leftNode = node10;
        CompleteTree binTree = new CompleteTree();

        Deque<Node> deque = new LinkedList();
        deque.add(node);
        System.out.println(binTree.process(deque));
    }

    public boolean process( Deque<Node> deque) {
        boolean isLeaf = false;
        while (!deque.isEmpty()) {
            Node node = deque.removeFirst();
            //右边为空但是左边不为空
            if (node.leftNode == null && node.rightNode != null){
                return false;
            }
            // 碰到了叶子节点后再次碰到叶子节点
            if (isLeaf && (node.rightNode!=null || node.leftNode != null)){
                return false;
            }

            if (node.leftNode != null) {
                deque.addLast(node.leftNode);
            }
            if (node.rightNode != null) {
                deque.addLast(node.rightNode);
            }
            // 碰到第一个叶子节点时
            if (node.leftNode == null || node.rightNode == null){
                isLeaf = true;
            }
        }
        return true;


    }
}
