package patterns;

public class Pattern19 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            char ch = 'E';
            for (int j = 0; j < rows - i; j++) {
                System.out.print((char)(ch - j) + " ");
            }
            System.out.println();
        }
    }
}
