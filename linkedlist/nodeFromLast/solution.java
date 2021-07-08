//Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from the end of the linked list.
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
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
    void display(){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;

        }
    }
    public static void main(String[] args) {
        var ll=new solution();
        searchNthNode sn=new searchNthNode();
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.display();
        System.out.println();
        System.out.println(sn.getNthFromLast(ll.head,3));

    }
}

class searchNthNode{
    int getNthFromLast( Node head,int n)
    {   
        int count=1;
    	Node first,second;
    	first=second=head;
    	while(count<n){
            if(first==null){break;}
            first=first.next; 
    	    count++;
    	}
    	while(first!=null && first.next!=null){
            first=first.next;
    	    second=second.next;
    	}
        if(first==null) {return -1;}
    	else {return second.data;}
    }

}