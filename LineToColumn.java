import java.util.Scanner;

public class LineToColumn {
    public static void main(String[] args) {

        System.out.println("Enter some text: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.println(word);
        }
    }
}
