package patterns;

public class Alphabetpattern21 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++) {
            char rowChar = (char) ('A' + i);
            for (int j = 0; j < rows + 1; j++) {
                if (j <= rows - i - 1) {
                    System.out.print("A ");
                } else {
                    System.out.print(rowChar + " ");
                }
            }
            System.out.println();
        }
    }
}
