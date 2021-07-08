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
        ll link2 = new ll(); 
        link1.add(12);
        link1.add(10);
        link1.add(22);
        link1.add(34);
        link2.add(100);
        link2.add(110);
        link2.add(200);
        link2.add(300);
        link1.display();
        link2.display();
	}
	
}