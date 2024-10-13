import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        String inputOne = input.nextLine();
        String inputTwo = input.nextLine();
        double numberOne = Double.parseDouble(inputOne);
        double numberTwo = Double.parseDouble(inputTwo);

        System.out.println("Choose addition (A), subtraction (S), multiplication (M), division (D): ");
        char operation = input.next().charAt(0);
        switch (operation){
            case 'A':
                numberOne += numberTwo;
                System.out.println(numberOne);
                break;
            case 'S':
                numberOne -= numberTwo;
                System.out.println(numberOne);
                break;
            case 'M':
                numberOne *= numberTwo;
                System.out.println(numberOne);
                break;
            case 'D':
                numberOne /= numberTwo;
                System.out.println(numberOne);
                break;
            default:
                System.out.println("Invalid operation");
        }



    }
}
