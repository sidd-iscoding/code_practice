//Time complexity=O(n) worst case is O(n^2) if array is sorted
class medianfind{
	void swap(int[] arr,Integer x,Integer y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
		
	}
	//partition algo is O(n)
	 int partition(int[] arr,int start,int end){
		//use of random number generator
		double a=Math.random()*(end-start+1);
		
		int p=start,r=end,i=p-1;
		Integer m=(int)a+start,n=r;
		swap(arr,m,n);
		int x=arr[end];
		for(int j=p;j<r;j++){
			if(arr[j]<=x){
				i=i+1;
				m=i;
				n=j;
				swap(arr,m,n);
			}
		}
		m=i+1;
		n=end;
		swap(arr,m,n);
		return (i+1);
	}
	
	 int findmedian(int mid,int[] arr,int start,int end){
		int pivot=partition(arr,start,end);
		if(pivot==mid){
			return arr[pivot];
		}
		else if(pivot<mid){
			return findmedian(mid,arr,pivot+1,end);
		}
		else{
			return findmedian(mid,arr,start,pivot-1);
		}
	
	}
	public static void main(String[] args){
		int[] arr={2,8,7,1,3,5,6,4};
		medianfind fm=new medianfind();
		int mid=(arr.length-1)/2;
		int median=fm.findmedian(mid,arr,0,arr.length-1);
		System.out.println(median);
	}
}