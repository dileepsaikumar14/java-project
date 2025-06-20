package patterns;

public class Alphabetpattern37 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                char ch = (char) ('E' - Math.min(i, j));
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
