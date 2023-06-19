import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        String current_day = sc.next();
        int n = sc.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Sunday", 0);
        map.put("Monday", 1);
        map.put("Tuesday", 2);
        map.put("Wednesday", 3);
        map.put("Thursday", 4);
        map.put("Friday", 5);
        map.put("Saturday", 6);
        int day = map.get(current_day);
        int total = day+n;
        total = total%7;
        for(Map.Entry<String,Integer> i : map.entrySet()){
            if(i.getValue()==total){
                System.out.println(i.getKey());
            }
        }
    }
}
