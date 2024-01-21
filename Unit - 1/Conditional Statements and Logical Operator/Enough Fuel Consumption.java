public static void enoughFuelConsumption(int fuel,int distance){
    int required = fuel*distance;
    if(required>50){
        System.out.println("Enough");
    }else{
       System.out.println("Go On"); 
    }
  }
