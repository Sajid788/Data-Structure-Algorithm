import java.util.*;
class Main{
    public static void main(String [] args){
        ArrayList<Integer>arr = new ArrayList<>();
          int x = 0;
        int y = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int  t = Integer.parseInt(str);
        
        for(int i = 0; i<t; i++){
            str = sc.nextLine();
            String [] strArr = str.split(" ");
            
            if(strArr.length==2){
                int d = Integer.parseInt(strArr[1]);
                arr.add(x,d);
                x++;
                count++;
                System.out.println(count);
            }else{
                if(count==0){
                    System.out.println("-1 0");
                }else{
                    count--;
                    System.out.println(arr.get(y)+" "+count);
                     y++;
                }
            }
        }
    }
}
