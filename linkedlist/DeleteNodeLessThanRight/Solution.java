class Node {
    int data;
    Node next;
 
   Node(int data) {
       this.data = data;
   }
 }
 class solution
 {   
     
     Node head,tail;
     //Function to find the data of nth node from the end of a linked list.
     
     public void add(int new_data)
     {
         Node new_node = new Node(new_data);
         if(head==null){
             head=new_node;
             tail=new_node;
         }
         else{
             tail.next=new_node;
             tail=new_node;
             tail.next=null;
         }
     }
     void display(Node cur){
        while(cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;

        }
    }
     public static void main(String[] args) {
         var ll=new solution();
         DeleteNode dn=new DeleteNode();
         ll.add(3);
         ll.add(4);
         ll.add(5);
         ll.add(6);
         ll.add(7);
         ll.display(ll.head);
         System.out.println();
         ll.head=dn.compute(ll.head);
         System.out.println();
         ll.display(ll.head);
         System.out.println();
 
     }
 }
 
 class DeleteNode
 {
     Node compute(Node head)
     {   
         Node cur,max;
         DeleteNode rev=new DeleteNode();
         head=rev.revLL(head);
         cur=head.next; max=head;
         while(cur!=null){
             if(cur.data<max.data){
                 max.next=cur.next;
                 cur=cur.next;
             }
             else{
                max=cur;
                cur=cur.next;
             }
         }
         head=rev.revLL(head);
         return head;
     }
     Node revLL(Node head){
         Node prev=null,cur=head,next=null;
         while(cur!=null){
             next=cur.next;
             cur.next=prev;
             prev=cur;
             cur=next;
         }
         return prev;
     }
 }
   