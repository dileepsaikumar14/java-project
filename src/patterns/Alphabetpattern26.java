package patterns;

public class Alphabetpattern26 {
    public static void main(String[] args) {
        int rows = 5;
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {
            char[] line = new char[i];

           
            for (int j = 0; j < i; j++) {
                line[j] = ch++;
            }

           
            if (i % 2 == 0) {
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(line[j] + " ");
                }
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print(line[j] + " ");
                }
            }

            System.out.println();
        }
    }
}
