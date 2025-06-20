package patterns;

public class Alphabetpattern27 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j < 5; j++) {
                System.out.print((char)(ch + j));
            }
            System.out.println();
        }
    }
}
