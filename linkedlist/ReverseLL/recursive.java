import java.util.LinkedList;
class recursive {
    public static void main(String[] args) {
        var ll=new LinkedList<Integer>();
        var rev=new solution();
        ll.add(8);
        ll.add(12);
        ll.add(10);
        ll.add(5);
        ll.add(4);
        ll.add(1);
        ll.add(6);
        System.out.println(ll);
        ll=rev.revLinkList(ll);
        System.out.println(ll);
    }
    
}
class solution{
    LinkedList revLinkList(LinkedList<Integer> head){
        LinkedList nextNode,revList;
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        nextNode=head.next;
        revList=revLinkList(nextNode);
        nextNode.next=head;
        return revList;
    }

}
