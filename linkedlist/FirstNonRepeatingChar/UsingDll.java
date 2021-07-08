//Find the first non-repeating character from a stream of characters
Screen reader support enabled.

class Node {
    char data;
    Node prev;
    Node next;

    Node(char ch) { data = ch; }
}

class UsingDll{
    
    Node head=null,tail=null;
    public String FirstNonRepeating(String A){
        boolean[] charset=new boolean[26];
        StringBuilder sb=new StringBuilder();
        Node[] nodes=new Node[26];  //Array of references pointing to nodes of DLL
        int element=0;
        while(element<A.length()){
            if(charset[A.charAt(element)-'a']==false){
                charset[A.charAt(element)-'a']=true;
                Node new_Node = new Node(A.charAt(element));
                nodes[A.charAt(element)-'a']=new_Node;
                if(head==null){
                    head=tail=new_Node;
                    head.prev = null;  
                    tail.next=null;
                }
                else{
                    tail.next=new_Node;
                    new_Node.prev=tail;
                    tail=new_Node;
                    tail.next=null;
                }
            }
            else{
                if(nodes[A.charAt(element)-'a']==head && head==tail){
                    head=tail=nodes[A.charAt(element)-'a']=null;
                    
                }
                else if(nodes[A.charAt(element)-'a']==head && head!=tail){
                    head=head.next;
                    head.prev=nodes[A.charAt(element)-'a']=null;

                }
                else if(nodes[A.charAt(element)-'a']==tail && head!=tail ){
                    tail=nodes[A.charAt(element)-'a'].prev;
                    tail.next= nodes[A.charAt(element)-'a']=null;
                }
                else{
                    if(nodes[A.charAt(element)-'a']!=null){
                        nodes[A.charAt(element)-'a'].prev.next=nodes[A.charAt(element)-'a'].next;
                        nodes[A.charAt(element)-'a'].next.prev=nodes[A.charAt(element)-'a'].prev;
                        nodes[A.charAt(element)-'a']=null;
                    }
                    
                }
                
            }
             element++;
             if(head==null){sb.append('#');}
             else {sb.append(head.data);}
        }
        
        return sb.toString();
    }
     public static void main(String[] args) {
        String str="fftftvvw";
        UsingDll obj=new UsingDll();
        System.out.println(obj.FirstNonRepeating(str));
    }

}