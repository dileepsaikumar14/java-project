package patterns;

public class Pattern20 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            char ch = 'E';
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(ch - j + 1) + " ");
            }
            System.out.println();
        }
    }
}
