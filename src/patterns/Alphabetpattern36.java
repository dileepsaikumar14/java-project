package patterns;

public class Alphabetpattern36 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;

        for (int i = 0; i < rows; i++) {
            char ch = (char) ('A' + i); 

            for (int j = 0; j < cols; j++) {
                System.out.print(ch + " ");
                ch += 9; 
            }

            System.out.println();
        }
    }
}
