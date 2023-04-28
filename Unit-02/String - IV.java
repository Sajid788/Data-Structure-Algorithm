import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String arr[] = new String[size];
        for(int i = 0;i<size;i++)
        {
        arr[i] = sc.next();
        System.out.println(arr[i]);
        }
    }
}
