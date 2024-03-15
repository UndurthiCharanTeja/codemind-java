import java.util.*;
public class charan{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int m=ip.nextInt();
        int s=1;
        
        int c=n>m?n:m;
        for (int i=1;i<=c;i++){
            if((n%i==0)&&(m%i==0)){
                s=i;
            }
            }
            
            System.out.println((m*n)/s);
        
        }
}