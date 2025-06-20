package patterns;

public class Alphabetpattern12 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++) {
            char ch = (char) ('A' + i);  
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch += 5;             }
            System.out.println();
        }
    }
}
