import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=0,flag=0,ans=0;
            for(int i=1;i<=m;i++){
                x=i;
                ans=x+(int)(Math.ceil(m/(x)));
                if(ans<=n){
                    flag=1;
                    break;
                }
            }
           if(flag==1)
        System.out.println("YES");
        else
        System.out.println("NO");
        }
        
    }
}
