      // PRINT ALL PERMUTATIONS OF A STRING ABC........ 

public class backtracking{
 public static void Ppremutation(String  str, String perm, int idx) {
    if( str.length()== 0){
        System.out.println(perm);
        return;
    }
  for ( int i =0; i<str.length(); i++){
    char currChar = str.charAt(i);
    String neString = str.substring(0, i) + str.substring(i+1);
    Ppremutation(neString, perm+currChar, idx+1);
  }
 }   
 public static void main(String[] args) {
    String str = "ABC";
    Ppremutation(str, "", 0);
 } 
}

// N-QUEENS n