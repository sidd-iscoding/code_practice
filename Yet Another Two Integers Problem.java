import java.util.Scanner;
import java.lang.Math;
/**
problem statement:You are given two integers a and b.

In one move, you can choose some integer k from 1 to 10 and add it to a or subtract it from a. In other words, you choose an integer k∈[1;10] and perform a:=a+k or a:=a−k. You may use different values of k in different moves.

Your task is to find the minimum number of moves required to obtain b from a.

You have to answer t independent test cases.

Input
The first line of the input contains one integer t (1≤t≤2⋅104) — the number of test cases. Then t test cases follow.

The only line of the test case contains two integers a and b (1≤a,b≤109).

Output
For each test case, print the answer: the minimum number of moves required to obtain b from a.

References: Codeforces Round #667 (Div. 3)  1409A - Yet Another Two Integers Problem
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
