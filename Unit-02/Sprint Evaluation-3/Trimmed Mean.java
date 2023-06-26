import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc =  new Scanner (System.in);
        int T = sc.nextInt();
        for(int t=0; t<T;t++){
            int N = sc.nextInt();
            List<Integer> grades = new ArrayList<>();
            for(int i =0; i<5*N; i++){
                int grade = sc.nextInt();
                grades.add(grade);
            }
            Collections.sort(grades);
            int sum = 0;
            int low = N;
            int high = grades.size()-N-1;
            for(int i = low; i<=high;i++){
                sum += grades.get(i);
            }
            int finalScore = sum/(3* N);
            System.out.println(finalScore);
        }
    }
}
