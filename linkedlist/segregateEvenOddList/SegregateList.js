let head=null,tail=null;
class Node {
    constructor(val) {
        this.data = val;
        this.next = null;
    }
}
function segregateEvenOdd(N) {
    let evenHead,evenTail,oddHead,oddTail,cur;
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
function push(new_data) {
    let new_node = new Node(new_data);
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
function DisplayList(cur){
        while (cur != null) {
            console.log(cur.data + " ");
            cur = cur.next;
        }
        console.log();
}
/* Driver program to test above functions */
     
push(11);
push(3);
push(5);
push(3);
push(7);
push(21);
push(9);
console.log("Original Linked List ");
DisplayList(head);
console.log("<br>");
let modifiedList=segregateEvenOdd(7);
console.log("Modified Linked List ");
DisplayList(modifiedList);