import java.util.Scanner;
import java.lang.Math;
public class yar{
	static int[] arr_restor(int x,int y,int n){
		int ar[]=new int[n];
		outerloop:
				for(int d=1;d<=(y-x);d++){
					boolean findx=false;
					int t=y,i=1;
                    ar[0]=t;
					while(i<n){
                        t=y-d*i;
                        if(t<=0){
                            break;
                        }
                        ar[i]=t;  
						if(t==x){
							findx=true;
						}
                        i++;
					}
					if(findx){    
						int j=1;
						while(j<=(n-i)){
							t=y+d*j;
							ar[j+i-1]=t;
							j++;
						}
						
						break outerloop;
					}
					
				}
			return ar;
		}
	        
	public static void main(String[] args){
		int testcases,x,y,n;
		Scanner in=new Scanner(System.in);
		testcases=in.nextInt();
		in.nextLine();
		for(int i=0;i<testcases;i++){
			n=in.nextInt();
			x=in.nextInt();
			y=in.nextInt();
			int array[]=arr_restor(x,y,n);
			for(int j=0;j<n;j++){
				System.out.print(array[j]+" ");
			}
			System.out.println();
		}
	}
}