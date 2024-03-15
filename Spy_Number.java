import java.util.*;
public class charan{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int s=0,r;
        int p=1;
        while(n>0){
            r=n%10;
            n=n/10;
            s=s+r;
            p=p*r;
            
        }
        if(s==p){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}