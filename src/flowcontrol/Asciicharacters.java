package flowcontrol;

public class Asciicharacters {
    public static void main(String[] args) {
        System.out.println("ASCII values and their corresponding characters:");

      
        for (int i = 0; i <= 127; i++) {
            System.out.println("ASCII Value: " + i + " => Character: " + (char)i);
        }
    }
}
