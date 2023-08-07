import java.util.*; 

public class Main {
	public static void main (String[] args) {
            Scanner sc= new Scanner(System.in);
			int t = sc.nextInt();
            for(int x=1;x<=t;x++){
                int N =sc.nextInt();
                long low=0,high=N;
                while(low<high){
                   long  mid= (low+high+1)/2;  
                    long answer = mid*mid;                 
                    if(answer<=N){
                          low= mid;
                    }
                    else{
                        high=mid-1;
                    }
                }
                System.out.println(low);
            }
	     }
}
