package arrays;
import java.util.Scanner;
public class Demo{
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int ratings[]=new int[n];
       for(int i=0;i<n;i++) {
           ratings[i]=sc.nextInt();
       }
       int candy[]=new int[n];
       for(int i=0;i<n;i++) {
           candy[i]=1;
       }
       for(int i=1;i<n;i++) {
           if(ratings[i]>ratings[i-1]) {
               candy[i]=candy[i-1]+1;
           }
       }
       for(int i=n-2;i>=0;i--) {
           if(ratings[i]>ratings[i+1]) {
               candy[i]=Math.max(candy[i],candy[i+1]+1);
           }
       }
       int sum=0;
       for(int i:candy) {
           sum+=i;
       }
       System.out.println(sum);
       
       
       
   }
   
}