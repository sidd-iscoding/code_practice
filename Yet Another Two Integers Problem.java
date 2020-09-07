import java.util.Scanner;
import java.lang.Math;
/**
**/

public class ytp{
	public static void main(String[] args){
		int testcases,a,b,moves;
		Scanner in=new Scanner(System.in);
		testcases=in.nextInt();
		in.nextLine();
		for(int i=0;i<testcases;i++){
			a=in.nextInt();
			b=in.nextInt();
			int diff=Math.abs(b-a);
			int q=diff/10;
			int r=diff%10;
			if(diff!=0 && r!=0){
				moves=q+1;
			}
			else if(diff!=0 && r==0){
				moves=q;
			}
			else{
				moves=0;
			}
			System.out.println(moves);
		}
		
		
	}
	
}
