 class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class RevLLgroup {
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
        var ll=new RevLLgroup();
        var rev=new revLLinGroup();
        ll.add(8);
        ll.add(12);
        ll.add(10);
        ll.add(5);
        ll.add(4);
        ll.add(1);
        ll.add(6);
        ll.display(ll.head);
        System.out.println();
        ll.head=rev.revLinkListGroup(ll.head, 3);
        System.out.println();
        ll.display(ll.head);
        System.out.println();
    } 
}

class revLLinGroup{
    Node revLinkListGroup(Node node,int k){
        Node prevNode=null,nextNode,newList=null,newListTail=null,listTail=node;
        int count=1;
        if(node.next==null){return node;}
        while(node!=null){
            nextNode=node.next;
            node.next=prevNode;
            prevNode=node;
            node=nextNode;
            if(count % k == 0 || node==null){
                if(newList==null){
                    newList=prevNode;
                    newListTail=listTail;
                }else{
                    newListTail.next=prevNode;
                    newListTail=listTail;
                    
                }
                listTail=node;
                prevNode=null;
            }
            count++;
        }
        return newList;      
    }
}