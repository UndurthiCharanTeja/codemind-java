import java.util.*;
public class charan{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int a=0,b=1,c=1;
      
        while(c<n){
            c=a+b;
            a=b;
            b=c;
        }
        int d1=n-a;
        int d2=c-n;
      if(d1==d2){
          System.out.println(a+" "+c);
      }
      else if(d1<d2){
          System.out.println(a);
      }
      else{
          System.out.println(c);
      }
    }
}