//time: O(n^2)  space: O(1)
import java.util.Arrays;
import java.util.Comparator;

class Job{
    int id, profit, deadline;
    Job(int x,int y, int z){
        id=x;
        profit=y;
        deadline=z;
    }
}
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr,new Comparator<Job>(){
            public int compare(Job a, Job b){
                return b.profit - a.profit;
            }
        });
        int jobCount=0,maxProfit=0;
        var limit=new int[100];
        Arrays.fill(limit, -1);
         for(int i=0;i<n;i++){
            for(int j=arr[i].deadline-1;j>=0;j--){
                if(limit[j]==-1){
                    limit[j]=arr[i].id;
                    jobCount++;
                    maxProfit+=arr[i].profit;
                    break;
                }
            }
        }   
        var result=new int[2];
        result[0]=jobCount;
        result[1]=maxProfit;
        return result;
    }
}