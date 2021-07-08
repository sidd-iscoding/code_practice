//Segregate even and odd nodes in a Linked List
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class SegregateList{   
    
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
        var ll=new SegregateList();
        Solution sn=new Solution();
        ll.add(8);
        ll.add(12);
        ll.add(10);
        ll.add(5);
        ll.add(4);
        ll.add(1);
        ll.add(6);
        ll.display(ll.head);
        System.out.println();
        ll.head=sn.divide(3,ll.head);
        System.out.println();
        ll.display(ll.head);
        System.out.println();

    }
}

class Solution{
    Node divide(int N, Node head){
        Node evenHead,evenTail,oddHead,oddTail,cur;
        evenHead=evenTail=oddHead=oddTail=cur=null;;
        if(N==0){return null;}
        else if(N==1) {return head;}
        else{
            cur=head;
           while(cur!=null){
               if(cur.data % 2 == 0){
                   if(evenHead==null){
                       evenHead=evenTail=cur;
                   }
                   else{
                       evenTail.next=cur;
                       evenTail=cur;
                       
                   }
               }else{
                   if(oddHead==null){
                       oddHead=oddTail=cur;
                   }else{
                       oddTail.next=cur;
                       oddTail=cur;
                   }
               }
               cur=cur.next;
           }
            if(evenTail!=null){
                evenTail.next=oddHead;
            
            }
            if(oddTail!=null){
              oddTail.next=null;
            }
        }
        return evenHead == null ? oddHead:evenHead; 
    }
}