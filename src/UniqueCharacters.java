import java.util.Scanner;
public class UniqueCharacters{
        public static void main(String[] args) {
            System.out.println("Give me a string.");
            Scanner input = new Scanner(System.in);
            String s = input.next();

            boolean[] seen = new boolean[127];

            for(int i = 0; i < s.length(); i++) {
                if (seen[s.charAt(i)]) {
                    System.out.println("Repeated character " + s.charAt(i) + " at position: " + i);
                    return;
                } else {
                    seen[s.charAt(i)] = true;
                }
            }
            System.out.println("No repeated characters.");
        }
}