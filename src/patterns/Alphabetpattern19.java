package patterns;

public class Alphabetpattern19 {
    public static void main(String[] args) {
        int total = 6;

        for (int i = total - 1; i >= 0; i--) {
            for (char ch = (char) ('A' + i); ch <= 'F'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
