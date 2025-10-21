
// // 1. REVERSE A STRING  USING RECURSION
// public class recursions2{
//     public static void pritR(String str, int idx) {
//         if (idx == 0) {
//             System.out.println("  " + str.charAt(idx));
//             return;
//         }
//         System.out.print("  " + str.charAt(idx));
//         pritR(str, idx - 1);
//     }

//     public static void main(String[] args) {
//         String str = "abcd";
//         pritR(str, str.length() - 1);
//     }
// }

              // // 2. isSORTED array?
// public class recursions2 {
//     public static boolean sorted(int arr[], int idx) {
//         if (idx == arr.length - 1) {
//             return true;
//         }
//         if (arr[idx] >= arr[idx + 1]) {
//             // array is unsorted
//             return false;
//         } else {
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 3, 4, 2 };
//         System.out.println(sorted(arr, 0));
//     }

// }

              // 3/move all x to the end of the string

// import java.security.PublicKey;
// import java.sql.Struct;

// public class recursions2 {
//     public static void moveX(String str, int idx, int count, String NEWstring) {

//         if (idx == str.length()) {
//             for (int i = 0; i < count; i++) {
//                 NEWstring += 'x';
//             }
//             System.out.println(NEWstring);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if (currChar == 'x') {
//             count++;
//             moveX(str, idx + 1, count, NEWstring);
//         } else {
//             NEWstring += currChar;
//             moveX(str, idx + 1, count, NEWstring);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "sdxrex";
//         moveX(str, 0, 0, "");
//     }
// }
                  // Problem: Tower of Hanoi

// You have 3 rods (A, B, C) and n disks stacked on A (largest at bottom, smallest on top).
// Your goal:
// ➡ Move all disks from A → C, using B as helper,
// but you can move only one disk at a time,
// and you can’t place a larger disk on a smaller one.

// 🪄 Recursive logic:

// Move n-1 disks from A → B, using C as helper

// Move the nth disk (largest) from A → C

// Move the n-1 disks from B → C, using A as helper


// public class towerOfHENOI {
//     public static void TowerOfHENOI(int n, String S, String H, String D) {
//         if (n == 1) {
//             System.out.println("Move disk 1 from " + S + " to " + D);
//             return;
//         }
//         TowerOfHENOI(n - 1, S, D, H);
//         System.out.println("Move disk" + n + "from " + S + " to " + D);
//         TowerOfHENOI(n - 1, H, S, D);
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         TowerOfHENOI(n, "A", "B", "C");
//     }
// }

                    // print all permutations of a string
//  abc -> acb,cab, cba,bca, bac,abc

// public class permutation{
//   public static void printP(String str, String P) 
//   {
//     if (str.length()==0){
//         System.out.println(P);
//         return;
//     }  
//     for(int i =0; i<str.length(); i++){
//         char currChar=str.charAt(i);
//         String newsString = str.substring(0, i) + str.substring( i+1);
//         printP(newsString, P+currChar);
//     }
//   }   
//     public static void main(String[] args) {
//         String str = "abc";
//         printP(str, "");
//     }
// }

//         count total paths in a maze to move from 0,0 to  n,m  in like a matrix
// public class backtraking{
//   public static int countPATHS(int i, int j, int n , int m){
//     if(i==n || j==m){
//       return 0;
//     }
//     if (i==n-1 && j==n-1) {
//       return 1; 
//     }

//     int downPATHS = countPATHS(i+1,j, n, m);
//     int rightPATHS = countPATHS(i, j+1,n, m);
//    return downPATHS+rightPATHS;
//   }  
//    public static void main(String[] args) {
//     int n =3, m=3;
//     int total =countPATHS(0, 0, n, m);
//     System.out.println(total);
//    }  
//   }


//   number of way of invite guest in party , all combinations  or in pair or sinlge
 public class Nways{
    public static  int  guest(int n ) {
        if(n<=1){
            return 1;
        }
        // single 
        int  ways1= guest(n-1);
        // pair
        int ways2 = (n-1)* guest(n-2);
        return ways1 + ways2;
    }
   public static void main(String[] args) {
    int n= 4;
    System.out.println(guest(n));
   }
    
 }

 
 