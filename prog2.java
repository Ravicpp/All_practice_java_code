package javaLocal;

public class prog2 {
    public static void main(String arg[]) {
        int n = 4;
        int m = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    // print for the blank space
                    System.err.print(" ");
                }
            }
            // print for the new line
            System.out.println();
        }
    }
}
