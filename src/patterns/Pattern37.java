package patterns;

public class Pattern37 {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 0; i < size; i++) {
            char letter = (char) ('A' + i);  
            for (int j = 0; j < size; j++) {
                if (j < i) {
                    System.out.print("A ");
                } else {
                    System.out.print(letter + " ");
                }
            }
            System.out.println();
        }
    }
}
