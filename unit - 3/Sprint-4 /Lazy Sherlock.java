import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            TreeMap<Integer,Integer> map=new TreeMap<>();
            for(int i=0;i<n;i++)
            {
                map.put(a[i],notes(a,n,i));
            }
            int min=Integer.MAX_VALUE,x=0;
            for(Map.Entry<Integer,Integer> i:map.entrySet())
            {
                if(i.getValue()<min)
                {
                    min=i.getValue();
                    x=i.getKey();
                }
            }
            System.out.println(x);
        }
    }
    public static int notes(int[] arr,int n,int i)
    {
        int a=arr[i],count=0;
        while(a>0)
        {
            if(a>=2000)
            {
                count+=(a/2000);
                a=a%2000;
            }
            else if(a>=500)
            {
                count+=(a/500);
                a=a%500;
            }
            else if(a>=200)
            {
                count+=(a/200);
                a=a%200;
            }
            else if(a>=100)
            {
                count+=(a/100);
                a=a%100;
            }
            else if(a>=50)
            {
                count+=(a/50);
                a=a%50;
            }
            else if(a>=20)
            {
                count+=(a/20);
                a=a%20;
            }
            else if(a>=10)
            {
                count+=(a/10);
                a=a%10;
            }
            else if(a>=5)
            {
                count+=(a/5);
                a=a%5;
            }
            else if(a>=2)
            {
                count+=(a/2);
                a=a%2;
            }
            else
            {
                count+=a;
                a=a%1;
            }
        }
        return count;
    }
}
