public class lab1_1 {
    public static void main(String[] args) {
        int n = 5; 
        int spaces = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n - spaces/2; j++) {
                System.out.print("*");
            }
            if(i==0) System.out.print("*");
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - spaces/2; j++) {
                System.out.print("*");
            }
            spaces += 3 + i; 
            System.out.println();
        }
        System.out.println("   JAVA  ");
        spaces = 7 ;
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < n - spaces/2; j++) {
                System.out.print("*");
            }
            if(i==0) System.out.print("*");
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - spaces/2; j++) {
                System.out.print("*");
            }
            spaces -= 3 + i-1; 
            System.out.println();
        }
    }
}
