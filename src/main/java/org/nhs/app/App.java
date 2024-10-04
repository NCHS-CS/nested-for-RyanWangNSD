public class App {

    public static void main (String args[]) {
        /*
        for (int i = 1; i <= 5; i++) {
            for (int x = 1; x <= z; x++) {
                System.out.print(i);
            }
            System.out.println();
        }
        */
        // problem 1
        for (int i = 1; i <= 5; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // problem 2
        for (int i = 1; i <= 5; i++) {
            for (int x = 4; x >= i; x--) {
                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++) {
                System.out.print(i);
            }
            System.out.println();
        }
        // problem 3
        for (int i = 1; i <= 5; i++) {
            for (int x = 4; x >= i; x--) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
        // challenge problem
        for (int i = 8; i >= -8; i--) {
            for (int x = i; x >= 0; x--) {
                System.out.print(" ");
            }
            
            for (int x = 1; x >= (9-i)*2; x++) {
                System.out.print(9-i);
            }
        }
    }

}