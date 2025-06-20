package patterns;

public class Pattern32 {
    public static void main(String[] args) {
        int rows = 5;
        char startChar = 'E';

       
        for (int i = 0; i < rows; i++) {
            for (char ch = (char)(startChar - i); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

       
        for (int i = 1; i < rows; i++) {
            for (char ch = (char)(startChar - i); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
