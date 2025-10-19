import java.util.*;

public class strings {
   public static void main(String[] args) {
      String Fname = "Vikas";
      String Lname = "Yadav";
      // string concatination
      System.err.println(Fname + " " + Lname);
      // user input a
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER STRING ::");
      String name = sc.nextLine();
      System.out.println(name);
      // CharAt
      for (int i = 0; i < name.length(); i++) {
         System.out.println(name.charAt(i));
      }
      // COMPARE AT
      if (Fname.compareTo(Lname) == 0) {
         System.out.println("EQUAL STRINGS");
      } else {
         System.out.println("not equal ");
      }

      // substring

      StringBuilder Sb = new StringBuilder("StringBuilder");
      System.out.println(Sb);
      // charAT
      System.out.println("Sb.charAt(2): " + "  " + Sb.charAt(2));
      System.out.println("Sb.capacity() :" + "  " + Sb.capacity());
      // System.out.println(Sb.hashCode);
      // System.out.println(Sb.insert(0, instert));
      System.out.println("Sb.append :" + "  " + Sb.append("H"));

      // reverse a string
      // for ( int i =0; i< Sb.length()/2; i++){
      // int front = i;
      // int back = Sb.length()-1-i;
      // Char fchar = Sb.charAt(front);
      // Char bchar = Sb.charAt(back);
      // Sb.setCharAt(front, bchar);
      // Sb.setCharAt(back, fchar);

      // }
      // System.out.println(Sb);

   }

}