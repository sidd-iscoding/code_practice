import java.util.Scanner;
import java.lang.Math;

/**@author Siddhartha
Problem Statement: You are given four integers a, b, x and y. Initially, a≥x and b≥y. You can do the following operation no more than n times:

Choose either a or b and decrease it by one. However, as a result of this operation, value of a cannot become less than x, and value of b cannot become less than y.
Your task is to find the minimum possible product of a and b (a⋅b) you can achieve by applying the given operation no more than n times.

You have to answer t independent test cases.

References:
Codeforces Round #667 (Div. 3)  1409B - Minimum Product

**/

public class mp{
		long  a,b;
		
		public void swap(mp ob){
			long temp;
			temp=ob.a;
			ob.a=ob.b;
			ob.b=temp;
		
		}
	public static void main(String[] args){
		int testcases,n;
	    long pro;
		Scanner in=new Scanner(System.in);
		mp obj,objx;
		obj=new mp();
		objx=new mp();
		testcases=in.nextInt();
		in.nextLine();
		
		for(int i=0;i<testcases;i++){
			obj.a=in.nextInt();
			obj.b=in.nextInt();
			objx.a=in.nextInt();
			objx.b=in.nextInt();
			n=in.nextInt();
			//highest product possible
			//da for highest reduction posible for "a" while db is the highest reduction possible for "b" after reducing 'a'
			pro=obj.a*obj.b;
			for(int j=0;j<2;j++){
				long da=Math.min(n,obj.a-objx.a);    
				long db=Math.min(n-da,obj.b-objx.b); 
				pro=Math.min(pro,(obj.a-da)*(obj.b-db));
				obj.swap(obj);
				objx.swap(objx);
			}
			System.out.println(pro);
		}
	}
}
