import java.util.*; 
 class Main{
     public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
    int cap=sc.nextInt(); 
    int n=sc.nextInt(); 
    int[] val=new int[n];
    for (int i=0;i<n;i++){ 
        val[i]=sc.nextInt(); 
    } 
    int[] wei=new int[n];
    for (int i=0;i<n;i++){ 
        wei[i]=sc.nextInt(); 
    } 
    double[][] perGram=new double[n][2]; 
    for(int i=0;i<n;i++){
        perGram[i][0]=(double)val[i]/wei[i]; 
                      
     perGram[i][1]=wei[i]; 
         } 
         Arrays.sort(perGram, new Comparator<double[]>() {
             
             public int compare(double[] arr1, double[] arr2){
                 
                 if (arr1[0] > arr2[0]) return 1;
                 else
                 return -1;
             }
         });
         double ans=0;
         for (int i=n-1;i>=0;i--){
             
             double w=perGram[i][1]; 
             if(w<=cap){ ans+=w*perGram[i][0]; 
             cap-=w;
             }else{
           ans+=cap*perGram[i][0];
           cap=0; break; 
                }
             }
          System.out.println(Math.round (ans));
     }
 }
