package patterns;

public class Alphabetpattern1 {
    public static void main(String[] args) {
        int rows = 6; 

        for (int i = 0; i < rows; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
