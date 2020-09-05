// Write a program to display n terms of odd natural numbers and tpublic class LoopForOddNum {
import java.util.Scanner;

public class LoopForOddNum {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to multiply with: ");
        int n = sc.nextInt();
        int x = 2*n - 1;


        while (a<=x) {
             System.out.println("Odd Number: " + a);
            sum = sum + a;
            a = a+2;
        }
        System.out.println("Sum of Odd Numbers: " + sum);


    }
}
