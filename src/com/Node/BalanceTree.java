package com.Node;

/**
 * description
 *
 * @author dinghuan.zhu@china-hand.com 2022/05/12 21:56
 */
public class BalanceTree {

    class Result {
        int height;
        boolean isBanlance;

        public Result(int height, boolean isBanlance) {
            this.height = height;
            this.isBanlance = isBanlance;
        }
    }

    public Result process(Node node) {
        if (node == null) {
            return new Result(0, true);
        }
        Result leftResult = process(node.leftNode);
        leftResult.height = leftResult.height + 1;
        Result rightResult = process(node.rightNode);
        rightResult.height = rightResult.height + 1;
        if (Math.abs(leftResult.height - rightResult.height) > 1) {
            leftResult.isBanlance = false;
            return leftResult;
        }
        leftResult.height = Math.max(leftResult.height, rightResult.height);
        return leftResult;

    }

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
        node4.leftNode = node8;
        node4.rightNode = node9;
        node8.leftNode = node10;
        BalanceTree balanceTree = new BalanceTree();

//        Boolean isBanlance = true;
        Result result = balanceTree.process(node);


        System.out.println(result.isBanlance);
    }
}
