package com;

/**
 * description
 *
 * @author dinghuan.zhu@china-hand.com 2022/04/13 21:21
 */
public class QuickSort {

    public int process(int[] array, int left, int right) {

        int mid = right;
        int bigIndex = left-1;
        int i1 = array[mid];
        for (int i = left; i < right; i++) {
            if (array[i] < array[mid]){
                bigIndex++;
                int zzz= array[i];
                array[i]=array[bigIndex];
                array[bigIndex]=zzz;
            }
        }
        bigIndex++;
        int i = array[bigIndex];
        array[bigIndex]=i1;
        array[right] = i;

        return bigIndex;

    }

    public void quickSort(int[] array, int left, int right){
        if (left>=right ){
            return;
        }
        int mid = process(array, left, right);
        quickSort(array, left,mid-1);
        quickSort(array, mid+1, right);


    }



    public static void main(String[] args) {
        int[] array = new int[]{10, 1,9,323, 50, 9, 7, 6,100,100, 232};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array, 0, array.length-1);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
