import java.util.Scanner;

public class Arrayhoo {
    public static void main(String[] args) {
        // finding an element's position in an array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers 1 to 10 separated by comma: ");
        String[] a = sc.nextLine().split(",");
        System.out.print("Enter any number to check if it matches with your previous input: ");
        int b = sc.nextInt();
        boolean found = false;
        for (int j = 0; j < a.length; j++) {
            if (b == Integer.parseInt(a[j].strip())) {
                System.out.println("The number  " + b + " is present at position " + j + " in the array a");
                found = true;
            }
        }
        // when element not found
        if (!found) {
            System.out.println("Element " + b + " is not found in array a");
        }
        //how to create a duplicate of the original array
        int[] newArray = new int[a.length];
        int c = 0;
        while (c<a.length){
            newArray[c] = Integer.parseInt(a[c].strip());
            System.out.println(newArray[c]);
            c++;
        }
        //get min and max values of array
        int maxnum = Integer.MIN_VALUE;
        int minnum = Integer.MAX_VALUE;
        for (int d = 0; d<newArray.length; d++) {
            if(maxnum < newArray[d]) {
                maxnum = newArray[d];
            }
            if(minnum > newArray[d]) {
                minnum = newArray[d];
            }
        }
        System.out.println(maxnum);
        System.out.println(minnum);

    }
}

