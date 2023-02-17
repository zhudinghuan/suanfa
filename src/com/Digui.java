package com;

/**
 * description 用递归找到数组上最大的元素
 *
 * @author dinghuan.zhu@china-hand.com 2022/04/04 10:17
 */
public class Digui {

    public static void main(String[] args) {
        Digui digui=new Digui();
        int[] array = new int[]{1, 4, 5, 2, 10, 100, 232};
        int max = digui.findMax(array ,0, array.length - 1);
        System.out.println(max);

    }

    public int findMax(int[] array, int left, int right){
        //如果二分到只有一个元素的数组，则返回本身
        if (left==right){
            return array[left];
        }
        //找到中点位置，>>1表示结果右进一位相当于除2 +的优先级大于>>
        int mid = left + ((right - left)>>1);
        int leftMax = findMax(array,left,mid);
        int rigthMax = findMax(array, mid+1, right);
        return Math.max(leftMax, rigthMax);

    }

}
