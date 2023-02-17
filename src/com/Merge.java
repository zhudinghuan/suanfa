package com;

/**
 * description
 *
 * @author dinghuan.zhu@china-hand.com 2022/05/02 16:28
 */
public class Merge {

    public void process(int[] array, int left, int right){
        if (left==right){
            return;
        }
        int mid = left + ((right-left)>>1);
        process(array, left, mid);
        process(array, mid+1, right);
        merge(array, left, mid, right);
    }

    public void merge(int[] array, int left,int mid, int right){
        int[] copyArray = new int[]{array.length};
        int leftbigin = mid;
        if (left < mid+1 && leftbigin<right){

        }
    }

    public void test(int i){
        i=+1;
    }

    public static void main(String[] args) {
        Merge merge = new Merge();
        int i= 1;
        merge.test(i);

        System.out.println(i);

    }
}
