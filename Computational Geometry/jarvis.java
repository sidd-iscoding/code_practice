//no collinear points were assumed
import java.util.LinkedList;
class point{
    int x,y;
    point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class jarvis{
    static boolean orient(point cur,point tempo,point target){
        if((target.y-cur.y)*(tempo.x-cur.x)>(tempo.y-cur.y)*(target.x-cur.x))  //for  clockwise  can't use point p[current] as current is not def. here
            return false;
        
        if((target.y-cur.y)*(tempo.x-cur.x)<(tempo.y-cur.y)*(target.x-cur.x))   //for  counter clockwise
            return true;
        else
        return false;
    }
    static void convexhull(point p[],int n){
        if(n<3){
            return;         //exit the method
        }
        int start=0;
        
        //find the leftmost point 
        for(int i=0;i<p.length;i++){
            if(p[i].x<p[start].x){
                start=i;
            }
        }
        LinkedList<point> ll=new LinkedList<point>();
        int current=start,temp;
        
        //find the convex hull points
        do{
            ll.add(p[current]);
            temp=(current+1)%n;
            for(int i=0;i<n;i++){
                if(orient(p[current],p[temp],p[i])){    //if i in counter clockwise
                    temp=i;
                }
            }
            current=temp;
            
        }while(current!=start);
        for(point pt:ll){
            System.out.println("("+pt.x+","+pt.y+")");
        }
    }
    public static void main(String[] args){
        point p[]=new point[5];
        p[0]=new point(1,1);
        p[1]=new point(2,2);
        p[2]=new point(2,0);
        p[3]=new point(2,4);
        p[4]=new point(4,2);
        int n=p.length;
        convexhull(p,n);
    }
    
}
