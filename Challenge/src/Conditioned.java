import java.util.Scanner;

public class Conditioned {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int n2 = sc.nextInt();
        if(n1 == n2 ) {
            System.out.println("Both numbers are equal.");
        }
        else if(n1<n2) {
            System.out.println("First given number is less than second given number.");
        }
        else {
            System.out.println("First given number is greater than second given number.");
        }
    }
}
