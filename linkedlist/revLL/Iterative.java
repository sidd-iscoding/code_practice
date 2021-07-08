class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
class Iterative {
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
        var ll=new recursiveLL();
        RevIterative sn=new RevIterative();
        ll.add(8);
        ll.add(12);
        ll.add(10);
        ll.add(5);
        ll.add(4);
        ll.add(1);
        ll.add(6);
        ll.display(ll.head);
        System.out.println();
        ll.head=sn.revLinkList(ll.head);
        System.out.println();
        ll.display(ll.head);
        System.out.println();
    }
}
class RevIterative{
    Node revLinkList(Node head){
        Node nextNode,prevNode=null;
        while(head!=null){
            nextNode=head.next;
            head.next=prevNode;
            prevNode=head;
            head=nextNode;

        }
        return prevNode;
    }
}