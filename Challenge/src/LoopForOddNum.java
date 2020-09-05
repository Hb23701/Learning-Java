// Write a program to display n terms of odd natural numbers and tpublic class LoopForOddNum {


public class LoopForOddNum {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        int n = 5;
        int x = 2*n - 1;


        while (a<=x) {
             System.out.println("Odd Number: " + a);
            sum = sum + a;
            a = a+2;
        }
        System.out.println("Sum of Odd Numbers: " + sum);


    }
}
