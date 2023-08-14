import java.util.*;
import java.text.*;
public class Main {
    public static long fact(long n){
        if(n==0||n==1) return 1;
        return (n*fact(n-1));}
        public static double find(long x,long r){
            if (r==0) return 1;
            double val = Math.pow(x,r);
            double ans = val/fact(r) + find(x,r-1);
            return ans;
        }
        public static void main(String [] args){
            Scanner s = new Scanner(System.in);
            long x = s.nextLong();
            long r = s.nextLong();
            DecimalFormat format = new DecimalFormat(".0000");
            format.setMaximumFractionDigits(4);
            double ans = find(x,r);
            System.out.println(format.format(ans));
        }
    }
