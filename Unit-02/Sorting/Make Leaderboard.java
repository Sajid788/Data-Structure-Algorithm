import java.util.*;
class Main{
    public static void main ( String [] args ){
        Scanner scan = new Scanner (System.in);
        int Num = scan.nextInt();
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for ( int i = 0 ; i<=100; i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0; i<Num; i++){
            String name = scan.next();
            int marks = scan.nextInt();
            list.get(marks).add(name);
        }
        int rank = 1;
        for (int i = 100; i>=0; i--){
            ArrayList<String> names = list.get(i);
            if(names.size()!=0){
            names = sort(names);
            for(int j= 0; j<names.size(); j++){
                System.out.println(rank+" "+names.get(j));
                }
            }
            rank+=names.size();
        }
    }
    static ArrayList<String> sort(ArrayList<String> names){
        String[] list = new String[names.size()];
        for ( int i = 0; i<names.size(); i++){
            list[i] = names.get(i);
        }
    for (int i = 0; i<list.length; i++){
      int  min = i; 
       for (int j = i+1; j<list.length; j++){
         if(list[min].compareTo(list[j]) > 0 ){
             min = j; 
         }  
      }
      if ( min != i){
          swap( list, i ,min);
      }
   }
   ArrayList<String> output = new ArrayList<>();
   for (int i = 0; i<names.size(); i++){
       output.add(list[i]);
   } return output; }
   static void swap ( String [] names , int i , int j){
       String temp  = names[i];
       names[i] = names [j]; 
       names [j] = temp; 
      }
   }
   
