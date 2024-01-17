public static void areaAndPerimeter(int l1,int b1,int l2,int b2){
    int rectangle1 = l1*b1;
    int rectangle2 = l2*b2;
    if  (rectangle1>rectangle2){
        System.out.println(true);
    }else{
        System.out.println(false);
    }
    
    int perimeter1 = 2*(l1+b1);
    int perimeter2 = 2*(l2+b2);
    if  (perimeter1>perimeter2){
       System.out.println(true); 
    }else{
       System.out.println(false); 
    }
  }
