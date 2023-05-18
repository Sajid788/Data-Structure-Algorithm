import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String [n];
        int [] h = new int [n];
        int [] w = new int [n];
        int [] iqs = new int [n];
        for(int i= 0; i<n; i++){
            name [i] = sc.next();
             h [i] = sc.nextInt();
              w [i] = sc.nextInt();
            iqs [i] = sc.nextInt();
            
        }
        makeMaritList(name,h,w,iqs);
        for(int i=n-1;i>=n-8;i--){
            System.out.println(name[i]);
        }
    }
   static void makeMaritList(String[] name ,int[] h,
   int []w,int[] iqs){
       int n = name.length;
       for(int i = 0;i<n-1;i++){
           for(int j = 0; j<n-i-1;j++){
               if(isGreater(j,name,h,w,iqs)){
                   swap(name,j,j+1);
                   swap(h,j,j+1);
                   swap(w,j,j+1);
                   swap(iqs,j,j+1);
               }
           }
       }
   }
   static void swap(int[] arr,int i,int j){
       int temp=arr[i];
       arr[i] = arr[j];
       arr[j]  = temp;
   }
  static void swap(String [] arr,int i,int j){
      String temp = arr[i];
      arr [i] = arr[j];
      arr[j] = temp;
  }
   static boolean isGreater(int j,String[] name,
   int[]h,int[]w,int[]iqs){
       if(iqs[j]>iqs[j+1]){
           return true;
       }else if(iqs[j]<iqs[j+1]){
           return false;
       }
       if(h[j]>h[j+1]){
           return true;
       }else if(h[j]<h[j+1]){
           return false;
       }
       if(w[j]<w[j+1]){
           return true;
       }else if(w[j]>w[j+1]){
           return false;
       }
       int k = 0;
       while((k<name[j].length())&&(k<name[j+1].length())){
           if(name[j].charAt(k)<name[j+1].charAt(k)){
               return true;
           }else if(name[j].charAt(k)>name[j+1].charAt(k)){
               return false;
           }
           k++;
       }
       
       if(k==name[j].length()){
           return true;
       }
       return false;
   }
}
