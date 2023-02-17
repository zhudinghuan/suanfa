package com.lokou;

import java.util.*;

/**
 * description
 *
 * @author dinghuan.zhu@china-hand.com 2022/06/24 16:31
 */
public class Test515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {

            ArrayList<Integer> arrayList = new ArrayList<>();
            Deque<TreeNode> deque = new LinkedList<>();
            deque.addFirst(root);
            while (!deque.isEmpty()) {

                TreeNode node = deque.removeFirst();
                arrayList.add(node.val);
                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }
            }
            int x = 1;
            int y = arrayList.size();
            int end = 0;
            while (end != y) {
                end = 2 * x < arrayList.size() ? 2 * x : arrayList.size();
                List<Integer> objects = arrayList.subList(x - 1, end);
                result.add(Collections.max(objects));
                x = x * 2;
            }
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
       ;
        System.out.println( result.subList(1, 2));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}