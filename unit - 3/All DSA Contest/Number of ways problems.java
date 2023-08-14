import java.util.Scanner;
class Main
{
    static int myFun(int dist)
    {
        if (dist<0){   
            return 0;
        }
        if (dist==0){   
            return 1;
        }
    return myFun(dist-1)+myFun(dist-2) + myFun(dist-3);
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dist = sc.nextInt();
        System.out.println(myFun(dist));
    }
}
