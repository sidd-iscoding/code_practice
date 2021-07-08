class Node{
		int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
	}
class ll{
		Node head=null;
    void add(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
        }
        else{
            new_node.next=head;     //inserting evey newnode at the beginning O(1) 
            head=new_node;
            
        }
    }
    void merge(){
        Node p1=head.next,p2=head,temp=null;
        while(p1!=null && p1.next!=null){
            p1=p1.next.next;
            p2=p2.next;
        }
        
        p1=head;
        while(p1!=p2){
            temp=p2.next;
            p2.next=temp.next;
            temp.next=p1.next;
            p1.next=temp;
            p1=p1.next.next;
            
        }
        
    }
    
	 void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }   
        while(current != null) {   
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
	public static void main(String[] args) {  
  
        ll link1 = new ll(); 
        link1.add(12);
        link1.add(10);
        link1.add(22);
        link1.add(34);
        link1.add(100);
        link1.add(110);
        link1.add(200);
        link1.add(300);
        link1.display();
        link1.merge();
        link1.display();
	}
	
}