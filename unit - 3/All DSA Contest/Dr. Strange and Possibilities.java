import java.util.Scanner;
class Main {
    static void myFun(String Str, String[] arr, int start, int end){
        if (start <= end && !Str.equals(" ")){
            System.out.println(Str);
        }
        for (int i = start; i < end; i++){
            myFun(Str + arr[i] + " ", arr, i + 1, end);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];
        for (int i = 1; i <= num; i++) {
            arr[i - 1] = i + "";
        }
        myFun("", arr, 0, num);
    }
}
