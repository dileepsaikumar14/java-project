package patterns;

public class AlphabetPattern33 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch += 4;
            }
            System.out.println();
        }
    }
}
