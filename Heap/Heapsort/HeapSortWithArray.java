//T.c=O(nlogn) space comp.:O(1)
package Heap.Heapsort;

import Heap.BuildHeap.BuildWithArray;

class HeapsortWithArray{
    void heapsort(int[] arr,int len){
        var bh=new BuildWithArray();
        bh.buildHeap(arr,len);
        for(int i=len-1;i>0;i--){
            bh.swap(arr,0,i);
            bh.minHeapify(arr,i-1,0);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
        int len=arr.length;
        var hs=new HeapsortWithArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        hs.heapsort(arr,len);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
}