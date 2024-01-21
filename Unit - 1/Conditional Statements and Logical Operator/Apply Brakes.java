public static void applyBrakes(int distance,int time){
    int speed = distance/time;
    if(speed>40){
        System.out.println("Apply Brake");
    }else{
       System.out.println("Keep Going"); 
    }
  }
