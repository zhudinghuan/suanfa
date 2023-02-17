package com;


/**
 * description
 *
 * @author dinghuan.zhu@china-hand.com 2022/04/04 18:44
 */
public class MergeSort {

    public void mergeSort(int[] array){
        if (array==null||array.length<2){
            return;
        }
        process(array,0, array.length-1);
    }

    public void process(int[] array, int left, int right){
        //递归的终点是划分的左右两边元素是一个，否则继续递归
        if (left == right){
            return;
        }
        int mid = left +((right-left)>>1);
        // 划分左侧数组到只有一个元素
        process(array, left, mid);
        // 划分右侧数组到只有一个元素
        process(array, mid+1, right);
        merge(array, left, mid, right);


    }

    public void merge(int[] array, int left, int mid,int right){
        //左右两个数据开始的下标
        int pointLeft = left;
        int pointRight = mid + 1;
        int i = 0;
        // 两个有序数组合并后生成的有序数组
        int[] goalArray = new int[right - left +1];
        //若左边数组和右边数组都没有越界采用的方式
        while (pointLeft <= mid && pointRight <= right){
            goalArray[i++] = array[pointLeft] < array[pointRight] ? array[pointLeft++] : array[pointRight++];
        }
        //右边数组将越界 但是左边还有元素
        while (pointLeft < mid+1){
            goalArray[i++] = array[pointLeft++];
        }
        // 左边数组将越界
        while (pointRight < right+1){
            goalArray[i++] = array[pointRight++];
        }
        //将合并好的数组，赋值给区间内的原数组，将数据传递下去
       for(i = 0; i < goalArray.length; i++) {
           array[left+i] = goalArray[i];
       }

    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array = new int[]{1, 4, 5, 2, 10, 100, 232};
        mergeSort.mergeSort(array);
        for(int i = 0; i < array.length; i++) {

        }


    }

}
