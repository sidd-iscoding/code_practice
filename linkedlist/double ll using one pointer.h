struct node{
    int data;
    struct node *ptrdiff;
};
node *exor(node *m, node *n){
    return(node *)((uintptr_t)m  ^(uintptr_t) n);
}
void insert(struct node **headref,int data){
    struct node *curNode=(struct node*)malloc(sizeof(struct node));
    if(curNode==NULL){
        cout<<"no space!\n";
        exit(1);
    }
    curNode->data=data;    
    curNode->ptrdiff=*headref;
    if(curNode->ptrdiff!=NULL){
        (*headref)->ptrdiff=exor(curNode,(*headref)->ptrdiff);
    }
    *headref=curNode;
}
void printList(struct node *head){
    struct node *prev=NULL,*cur=head, *next=NULL;
    while(cur!=NULL){       //first to last
        cout<<cur->data<<"->";
        next=exor(prev,cur->ptrdiff);
        prev=cur;
        cur=next;
    }
    head=prev;
    prev=cur;
    cur=head;cout<<"\n";
    while(cur!=NULL){       //last to first
        cout<<cur->data<<"->";
        next=exor(prev,cur->ptrdiff);
        prev=cur;
        cur=next;
    }
}
int main() {
    struct node *head=NULL;
    insert(&head,10);
    insert(&head,20);
    insert(&head,30);
    printList(head);
}