package patterns;

public class Alphabetpattern8 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++) {
            for (char ch = 'F'; ch >= 'F' - i; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
