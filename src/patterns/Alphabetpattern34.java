package patterns;

public class Alphabetpattern34 {
    public static void main(String[] args) {
        int rows = 9;

        for (int i = 0; i < rows; i++) {
            char ch = (char) ('A' + i);
            int jump = 1;

            for (int j = 0; j <= i && ch <= 'Z'; j++) {
                System.out.print(ch + " ");
                ch += ++jump; 
            }

            System.out.println();
        }
    }
}
