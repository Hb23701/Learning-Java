import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month to get the number of days: ");
        String month = sc.nextLine();
        if(month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July") || month.equals("August") || month.equals("October") || month.equals("December")){
            System.out.println(month + " has 31 days");
        }
        else if(month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November")) {
            System.out.println(month + " has 30 days");
            }
        else if (month.equals("February")) {
            System.out.println("This month has 28 days");
        }
        else {
            System.out.println("Invalid value for month");
        }
    }
}
