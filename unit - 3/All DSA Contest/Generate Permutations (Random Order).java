class Solution{
  public List<List<Integer>> generatePermutation(int[] a){
    List<List<Integer>> list = new ArrayList<>();
  permute(a,list,0);
  return list;
  }
  public void swap ( int [] arr , int i , int j ){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
  public void permute (int [] arr, List<List<Integer>> list,int cur){
      if ( cur == arr.length){
          List<Integer> temp = new ArrayList<>();
          for ( int i = 0; i< arr.length; i++) 
          temp.add(arr[i]);
          list.add(temp);
          return;
      }
      for ( int i = cur; i<arr.length; i++){
          swap (arr, cur, i);
          permute(arr,list,cur+1);
          swap (arr,cur,i);
      }
      return;
  }
}

