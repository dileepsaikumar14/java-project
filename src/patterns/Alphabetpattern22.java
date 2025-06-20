package patterns;

public class Alphabetpattern22 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++) {
        
            for (char ch = (char) ('A' + i); ch <= 'F'; ch++) {
                System.out.print(ch);
            }

          
            for (char ch = (char) ('E'); ch >= 'A' + i; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
