 import java.util.*;
 class Shape {
  String  coloString; 
  public void area(){
    System.out.println("area");
  }
}
//  single level inheritance
class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

//multilevel 
 class equalateral extends Triangle {
 public void area (int l, int h)
 {
System.out.println(1/2*l*h);
 }
 }
 //herircel inheritences
 class circle extends Shape{
public void area(int r)
{
    System.out.println((3.14)*r*r);
}    
}

public class inheritence {
public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.coloString  ="red";
    }
}
