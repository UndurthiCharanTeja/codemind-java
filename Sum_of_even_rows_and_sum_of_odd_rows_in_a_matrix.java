import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int n,m,i,j,c=0,k=0;
        n=ip.nextInt();
        m=ip.nextInt();
         int ar[][]=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                ar[i][j]=ip.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i%2==0){
                    c=c+ar[i][j];
                }
                else{
                    k=k+ar[i][j];
                }
            }
        }
        System.out.print(c);
        System.out.print(" ");
        System.out.print(k);

        
    }
}