package bank;

class Ac{
    public String name;
    protected String email;
    private String Pass;
}
//getter and setters
public String gePass(){
    return this.Pass;
}
 public void setPass(String passString){
    this.Pass = passString;
 }
public class bank {
    public static void  main  (String args[]){
    Ac ac1= new Ac();
    ac1.name = "vikas";
    ac1.setPass("kkssj");
    System.out.println(ac1.gePass());
}
}