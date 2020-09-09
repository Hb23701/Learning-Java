import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your roll number: ");
        int rollNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your field of interest: ");
        String interestedField = sc.nextLine();
        System.out.println("My name is " + name + " and my roll number is " + rollNumber + ". I am interested in " + interestedField + ".");

    }
}
