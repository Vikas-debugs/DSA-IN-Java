import java.util.Scanner;

public class aray {
    public static void main(String[] args) {
        int marks[] = new int[4];
        marks[0] = 2;
        marks[2] = 3;
        System.out.println(marks[0]);
        // PRINT array element using FOR loop
        int mark[] = { 2, 34, 45, 53, 393, 939 };
        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]);
        }

        // user input array
        System.out.println("ENTER ARRAY SIZE:");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println(" ENTER ELEMENTS:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" ARRAY IS:");

        for (int i = 0; i < size; i++) {

            System.out.println(arr[i]);
        }
    }
}
