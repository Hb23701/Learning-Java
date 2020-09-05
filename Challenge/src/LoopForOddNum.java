// Write a program to display n terms of odd natural numbers and tpublic class LoopForOddNum {


public class LoopForOddNum {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        int n = 5;
        int x = 2*n - 1;


        while (a<=x) {
             System.out.println("Odd Number: " + a);
             a = a+2;
             sum = sum + a;
            System.out.println("Sum of Odd Numbers: " + sum);
        }

    }
}
