class BuildWithArray {
   void minHeapify(int[] arr,int len,int min){
    int parent=min,lChild=2*parent+1,rChild=2*parent+2;
            if(lChild<len && arr[lChild]<arr[parent]){
                min=lChild;
            }else{
                min=parent;
            }
            if(rChild<len && arr[rChild]<arr[min] ){ 
                min=rChild;
            }
            if(min!=parent){
                swap(arr,min,parent);
                minHeapify(arr,len,min);
            }
   }
    void buildHeap(int[] arr,int len){
        for(int i=(len-2)/2;i>=0;i--){
            minHeapify(arr,len,i);
        }
    }
    void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
        int len=arr.length;
        var heap=new BuildWithArray();
        heap.buildHeap(arr,len);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
}
