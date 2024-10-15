import java.util.Scanner;

public class CountingLettersRedux {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String text = input.nextLine();

        String lettersEntered = " ";


        while (true){
            int count = 0;
            System.out.println("Which letter would you like to count now? ");
            String letter = input.nextLine();

            if (lettersEntered.contains(letter)){
                System.out.println("Repeated character. Exiting the program");
                break;
            }

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == letter.charAt(0)) {
                    count++;
                    lettersEntered += letter;
                }
            }
            System.out.printf("There are %d in your text\n", count);

        }



    }
}
