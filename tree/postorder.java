import java.util.Stack;

class node {
	int data,height=0;
	node left,right;
	node(int data){
		this.data=data;
	}
}
class postorder{
	node root,previous=null;
	void postorder(){
		Stack<node> s=new Stack<node>();
		while(true){
			while(root!=null){
				s.push(root);
				root=root.left;
			}
			if(s.empty()){
				break;
			}
			// peek(): Looks at the object at the top of this stack and returns the object without removing it from the stack.
			root=s.peek();	
			
			// if we visit the root node of the subtree from right side then right==previous as the right child of the node is pointed by previous pointer
			if(root.right==null||root.right==previous){
				System.out.println(root.data);
				s.pop();
				previous=root;
				root=null;		//root=null so that it doesn't again process the same subtree 
			}
			else{
				root=root.right;
			}
			
		}
	}
	public static void main(String args[]){
		postorder in=new postorder();
		in.root=new node(6);
		in.root.left=new node(4);
		in.root.left.left=new node(2);
		in.root.left.right=new node(5);
		in.root.right=new node(8);
		in.postorder();
	}
}