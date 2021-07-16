package Queue.palindromeChecker;

import java.util.ArrayDeque;

public class palin {
    boolean palindromeChecker(String str){
        int len=str.length();
        var dq=new ArrayDeque<Character>();
        for(int i=0;i<len;i++){
            dq.addLast(str.charAt(i));
        }
        while(dq.size()>1){
            if(dq.pollFirst()!=dq.pollLast()){
                return false;
            }
        } 
        return true; 
    }
    public static void main(String[] args) {
        var pl=new palindrome();
        System.out.println(pl.palindromeChecker("ayya"));
        
    }
}
