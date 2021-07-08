class FirstNonRepeat
{
    public String FirstNonRepeating(String A)
    {
       int i,j;
		    int[] charset=new int[26];
		    StringBuilder sb=new StringBuilder();
		    i=j=0;
		    while(i<A.length()){
		        charset[A.charAt(i)-'a']++;
		        if(charset[A.charAt(j)-'a']==1){
		            sb.append(A.charAt(j));
                    ++i;
                    continue;
                    //System.out.println(A.charAt(j));
		        }
		        while(j<i && charset[A.charAt(++j)-'a']!=1);
		        if(i==j){
		            sb.append('#');
                   // System.out.println('#');
		            j++;
		        }
                else{
                    sb.append(A.charAt(j));
                }
                i++;
		}
		   String str=sb.toString();
		   return str;
    }
    public static void main(String[] args){
        String A="aabc";
        FirstNonRepeat obj=new FirstNonRepeat();
       System.out.println(obj.FirstNonRepeating(A));

    }
}