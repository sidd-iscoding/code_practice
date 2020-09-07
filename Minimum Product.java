import java.util.Scanner;
import java.lang.Math;
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