import java.util.Scanner;

public class CommandLineCalculator {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        double operand1;
        double operand2;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operand1 = Double.parseDouble(text.substring(0, i));
                operand2 = Double.parseDouble(text.substring(i + 1, text.length()));
                switch (ch) {
                    case '+':
                        System.out.println(operand1 + operand2);
                        break;
                    case '-':
                        System.out.println(operand1 - operand2);
                        break;
                    case '*':
                        System.out.println(operand1 * operand2);
                        break;
                    case '/':
                        System.out.println(operand1 / operand2);
                        break;
                }


            }
        }
    }



}
