import java.util.Stack;

class node {
	int data,height=0;
	node left,right;
	node(int data){
		this.data=data;
	}
}
class inorder{
	node root;
	void inorder(){
		Stack<node> s=new Stack<node>();
		while(true){
			while(root!=null){
				s.push(root);
				root=root.left;
			}
			if(s.empty()){
				break;
			}
			root=s.pop();
			System.out.println(root.data);
			root=root.right;
		}
	}
	public static void main(String args[]){
		inorder in=new inorder();
		in.root=new node(6);
		in.root.left=new node(4);
		in.root.left.left=new node(2);
		in.root.left.right=new node(5);
		in.root.right=new node(8);
		in.inorder();
	}
}