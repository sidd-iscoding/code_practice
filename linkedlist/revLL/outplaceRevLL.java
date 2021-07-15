class revll{
    Node revLinkList(Node head){
        Node cur=head,otherList=null;
       
        while(cur!=null){
           Node newNode=new Node(cur.data);
           newNode.next=otherList;
           otherList=newNode;
           cur=cur.next;
        }
        return otherList;
    }
}
class outplaceRevLL {
    Node head,tail;
    
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
        var ll=new outplaceRevLL();
        var rev=new revll();
        ll.add(8);
        ll.add(12);
        ll.add(10);
        ll.add(5);
        ll.add(4);
        ll.add(1);
        ll.add(6);
        ll.display(ll.head);
        System.out.println();
        ll.head=rev.revLinkList(ll.head);
        System.out.println();
        ll.display(ll.head);
        System.out.println();
    }
}