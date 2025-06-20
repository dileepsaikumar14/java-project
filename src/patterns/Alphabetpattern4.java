package patterns;

public class Alphabetpattern4 {
    public static void main(String[] args) {
        int max = 6; 

        
        for (int i = max; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        for (int i = 2; i <= max; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
