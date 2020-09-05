public class LoopLoop {
    public static void main(String[] args) {
        int a = 1;
        for (int row = 0;row<5;row++) {
            for(int col = 0;col<=row;col++) {
                System.out.print(a++ + " " );

            }
            System.out.println();
        }
    }
}
