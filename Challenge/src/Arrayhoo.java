import java.util.Scanner;

public class Arrayhoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers 1 to 10 separated by comma: ");
        String[] a = sc.nextLine().split(",");
        System.out.print("Enter any number to check if it matches with your previous input: ");
        int b = sc.nextInt();
        boolean found = false;
        for (int j = 0; j < a.length; j++) {
            if (b == Integer.parseInt(a[j])) {
                System.out.println("The number  " + b + " is present at position " + j + " in the array a");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Element " + b + " is not found in array: ");
        }
    }
}

