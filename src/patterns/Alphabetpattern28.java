package patterns;

public class Alphabetpattern28 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
           
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

           
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
