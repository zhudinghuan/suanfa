package com.Node;

/**
 * description
 *
 * @author dinghuan.zhu@china-hand.com 2022/05/03 20:22
 */
public class BinTree {
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

        node.leftNode=node2;
        node.rightNode=node3;
        node2.leftNode=node4;
        node2.rightNode=node5;
        node3.rightNode=node6;
        node3.leftNode=node7;
        node4.leftNode=node8;
        node4.rightNode=node9;
        BinTree binTree=new BinTree();

        binTree.process(node);
    }

    public void process(Node node){

        if (node==null){
            return;
        }
        process(node.leftNode);
        System.out.println(node.value);
        process(node.rightNode);


    }

}



class Node{
    int value;
    Node leftNode;
    Node rightNode;

    public Node(int value) {
        this.value = value;
    }
}