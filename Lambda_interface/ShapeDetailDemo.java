package Lambda_interface;

import java.util.Scanner;

@FunctionalInterface
interface Draw{
    double circleArea(int r);
}

@FunctionalInterface
interface calculateRecArea{
     int recArea(int l,int b);

    
}





public class ShapeDetailDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length and breadth");
        int l1=sc.nextInt();
        int b1=sc.nextInt();
    Draw d = (r)->{
        final double pi=3.14;
        return pi*r*r;
    };
        System.out.println("I am in shape draw method "+d.circleArea(30));
    
    

    
    calculateRecArea s=(l,b)->{
        return l*b;
    };
        System.out.println("area is "+s.recArea(l1,b1)); 
}
}