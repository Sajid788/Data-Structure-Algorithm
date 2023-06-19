import java.util.*;
import java.io.*;
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
class Main{
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int [] [] arr = new int[n][n];
      for(int i = 0; i<n; i++){
          for(int j = 0; j<n; j++){
              arr[i][j] = sc.nextInt();
          }
          
      }
      int left = 0,right=n-1,top=0,bottom = n-1;
      int temp1 = 0;
      int temp2 = 0;
      while(left<right && top<bottom){
          temp1 = arr[top][left];
          for(int i =left; i<right; i++){
              temp2 = arr[top][i+1];
              arr[top][i+1] = temp1;
              temp1 = temp2;
          }
          top++;
          for(int i = top; i<=bottom; i++){
              temp2 = arr[i][right];
              arr[i][right] = temp1;
              temp1 =temp2;
          }
          right--;
          for(int i = right; i>=left; i--){
              temp2 = arr[bottom][i];
              arr[bottom][i] =temp1;
              temp1 = temp2;
          }
          bottom--;
          for(int i = bottom; i>=top-1; i--){
              temp2=arr[i][left];
              arr[i][left] = temp1;
              temp1 = temp2;
          }
          left++;
      }
      StringBuilder ans = new StringBuilder();
      for(int i = 0; i<n; i++){
          for(int j = 0; j<n; j++){
              ans.append(arr[i][j]+" ");
          }
          ans.append("\n");
      }
      System.out.println(ans);
    }
}
