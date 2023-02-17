package com.Node;

/**
 * description
 *
 * @author dinghuan.zhu@china-hand.com 2022/05/08 15:49
 */
public class SearchTree {

    public boolean process(Node node, int minValue) {
        if (node == null) {
            return true;
        }
        boolean isSearchFlag = process(node.leftNode, minValue);
        if (!isSearchFlag) {
            return false;
        }
        // 基于中序遍历实现判断搜索树，既左根右。若中序遍历是有序的，那么整个都是有序的
        if (minValue < node.value) {
            minValue = node.value;
        } else {
            return false;
        }
        return process(node.rightNode, minValue);

    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);

        node5.leftNode = node3;
        node5.rightNode = node8;
        node3.leftNode = node2;
        node3.rightNode = node4;
        node2.leftNode = node1;
        node8.leftNode = node7;
        node8.rightNode = node9;
        node7.leftNode = node6;
        SearchTree searchTree = new SearchTree();

        System.out.println(searchTree.process(node5 , Integer.MIN_VALUE));;
    }
}
