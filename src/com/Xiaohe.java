package com;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * description
 *
 * @author dinghuan.zhu@china-hand.com 2022/04/06 20:40
 */
public class Xiaohe {

    public int mergeSort(int[] array){
        if (array==null||array.length<2){
            return 0;
        }
        return process(array,0, array.length-1);
    }

    public int process(int[] array, int left, int right){
        //递归的终点是划分的左右两边元素是一个，否则继续递归
        if (left == right){
            return 0;
        }
        int mid = left +((right-left)>>1);
       //左边的小数和加上右边的小数和当合并后的小数和，注意顺序，要先排序再求和
        return  process(array, left, mid)+process(array, mid+1, right)+merge(array, left, mid, right);


    }

    public int merge(int[] array, int left, int mid,int right){
        //左右两个数据开始的下标
        int pointLeft = left;
        int pointRight = mid + 1;
        int i = 0;
        int result = 0;
        // 两个有序数组合并后生成的有序数组
        int[] goalArray = new int[right - left +1];
        //若左边数组和右边数组都没有越界采用的方式
        while (pointLeft <= mid && pointRight <= right){
            result += array[pointLeft] < array[pointRight] ? array[pointLeft]*(right-pointRight+1) : 0;
            //若左边的元素等于右边的元素，则左边元素指针移动，这样的话可以避免重复计算
            goalArray[i++] = array[pointLeft] <= array[pointRight] ? array[pointLeft++] : array[pointRight++];
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
        return result;
    }

    public static void main(String[] args) {
        Xiaohe xiaohe = new Xiaohe();
        int[] array = new int[]{1, 3, 4, 2, 5};
        int i = xiaohe.mergeSort(array);
        System.out.println(i);
    }

}
