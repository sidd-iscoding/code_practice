// Given a convex hull and a query point determine whether it is inside or outside the convex polygon
//using naive algo T.C=O(logn)

class point{
    int x,y;
    point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class detqlogn{
    static int isLeft(point current,point next,point  q){
        return ((next.x-current.x)*(q.y-current.y)-(q.x-current.x)*(next.y-current.y));
    }
    static void det(point[] p,point q){
        int length=p.length;
        int a=1,b=length-1;
        while(a<b-1){
            int c=(a+b)/2;
            if(isLeft(p[0],p[c],q)>0){
                a=c;
            }
            else{
                b=c;
            }
            
        }
            
            if(isLeft(p[0],p[a],q)<0 || isLeft(p[a],p[b],q)<0 || isLeft(p[b],p[0],q)<0){
                System.out.println("q lies outside!");            
            }
            else{
                System.out.println("q lies inside!"); 
            }
        
    }
    
     public static void main(String[] args){
        point[] p=new point[4];
        //points are given in anticlockwise
        p[0]=new point(1,1);
        p[1]=new point(2,0);
        p[2]=new point(4,2);
        p[3]=new point(2,5);
        point q=new point(3,5);    //2,1; 1,3 ; 8,3
        det(p,q);
    }
}
