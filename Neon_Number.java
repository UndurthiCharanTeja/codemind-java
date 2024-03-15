import java.util.*;
public class charan{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int s,r,p=0;
        s=n*n;
        while(s>0){
            r=s%10;
            s=s/10;
            p=p+r;
            
        }
        if(p==n){
            System.out.println("Neon Number");
            
        }
        else{
            System.out.println("Not Neon Number");
        }
        
    }
}