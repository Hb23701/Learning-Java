import java.util.Scanner;

public class AreaOfARectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a decimal value for length: ");
        double length = sc.nextDouble();
        System.out.print("Please enter a decimal value for breadth: ");
        double breadth = sc.nextDouble();
        int area = (int) (length * breadth);
        System.out.println("Area of rectangle is: " + area);
    }



}

