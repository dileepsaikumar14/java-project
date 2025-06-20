package patterns;

public class Alphabetpattern18 {
    public static void main(String[] args) {
        int total = 6;

        
        for (int i = 0; i < total; i++) {
            for (char ch = (char) ('A' + i); ch < 'A' + total; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

      
        for (int i = total - 2; i >= 0; i--) {
            for (char ch = (char) ('A' + i); ch < 'A' + total; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
