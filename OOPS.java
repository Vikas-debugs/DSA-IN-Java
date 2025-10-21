class Pen{
    
    String color;
    String   type;
    public void write(){
        System.out.println("woriting");
    }


    Pen(){
        System.out.println("non paremeter constructor");
    } 
    public void printcolor(){
        System.out.println(this.color);
         System.out.println(this.type);
        //this is used to tell which object is calling color
        //like pen1, pen2, pen3.....
    } 
   

    Pen(Pen p2){
        this.type = p2.type;   //this.type is called the object name  String   type; type is paremeter passed
        this.color = p2.color;  //this.color is called the object name  String   color;, color is the paremeter name passed
        System.out.println();
    }
    
    //  Pen(String color , String type){
    //     this.type = type;   //this.type is called the object name  String   type; type is paremeter passed
    //     this.color =color;  //this.color is called the object name  String   color;, color is the paremeter name passed
    //     System.out.println();
    // }

    //polymorshism
     public void print1(String color){
        System.out.println(color);
     }
     public void print1(String type){
        System.out.println(type);
     }
     public void print1(String color, String type){
        System.out.println(color +  " " + type);
     }
    
}

public class OOPS {
  public static void main(String[] args) {
    // Pen pen1 = new Pen("yellow","gell"); //Pen is like a constructor
    // pen1.color = "red";
    // pen1.type = "gel";
    Pen pen1 = new Pen(); //Pen is like a constructor
    pen1.color = "red";
    pen1.type = "gel";
    pen1.print1("green");
   
    Pen pen2 = new Pen(pen1); //copy cunstructer inherite the properties of pen1
    //  Pen pen2 = new Pen();
    // pen2.color = "black";
    // pen2.type = "gel";
    // pen1.printcolor();
    pen2.print1("dark");
    pen2.print1("green", "dark");
    pen2.printcolor();
    
  }
    
}
