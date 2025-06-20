package patterns;

public class Alphabetpattern16 {
    public static void main(String[] args) {
        int peak = 6; 

       
        for (int i = 1; i <= peak; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

       
        for (int i = peak - 1; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
