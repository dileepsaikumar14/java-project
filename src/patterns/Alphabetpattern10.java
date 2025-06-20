package patterns;

public class Alphabetpattern10 {
    public static void main(String[] args) {
        int rows = 6;
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
