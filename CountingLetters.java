import java.util.Scanner;

public class CountingLetters {
    public static void main(String[] args) {
        System.out.println("Enter some text: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("Choose a letter: ");
        String letter = input.nextLine();

        int count = 0;
        for (int i = 0; i < text.length(); i++){
            if(text.charAt(i) == letter.charAt(0)){
                count++;
            }
        }

        System.out.println("The letter " + letter + " appears " + count + " times");

    }
}
