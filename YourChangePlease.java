//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.math.BigDecimal;
import java.util.Scanner;

public class YourChangePlease {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total cost: ");
        BigDecimal cost = input.nextBigDecimal();
        System.out.println("Enter amount of money paid: ");
        BigDecimal paid = input.nextBigDecimal();
        BigDecimal diff = paid.subtract(cost);

        diff = diff.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Change is £" + diff);

        BigDecimal[] parts = diff.divideAndRemainder(BigDecimal.ONE);

        int pounds = parts[0].intValue();
        int pence = parts[1].movePointRight(2).intValue();

        while (pounds > 0){
            if (pounds >= 50){
                int fifties = pounds / 50;
                pounds -= fifties * 50;
                System.out.println(fifties + " fifty pound notes");
            } else if (pounds >=20 && pounds < 50){
                int twenties = pounds / 20;
                pounds -= twenties * 20;
                System.out.println(twenties + " twenty pound notes");
            } else if (pounds >=10 && pounds < 20){
                int tens = pounds / 10;
                pounds -= tens * 10;
                System.out.println(tens + " ten pound notes");
            } else if (pounds >=5 && pounds < 10){
                int fives = pounds / 5;
                pounds -= fives * 5;
                System.out.println(fives + " five pound notes");
            } else if (pounds >=2 && pounds < 5){
                int twos = pounds / 2;
                pounds -= twos * 2;
                System.out.println(twos + " two pound coins");
            } else if (pounds >=1 && pounds < 2){
                int ones = pounds;
                pounds -= ones;
                System.out.println(ones + " one pound coins");
            }
        }

        while (pence > 0){
            if (pence >= 50) {
                int fiftyPCoins = pence / 50;
                pence -= fiftyPCoins * 50;
                System.out.println(fiftyPCoins + " 50p coins");
            } else if (pence >= 20 && pence < 50) {
                int twentyPCoins = pence / 20;
                pence -= twentyPCoins * 20;
                System.out.println(twentyPCoins + " 20p coins");
            } else if (pence >=10 && pence < 20) {
                int tenPCoins = pence / 10;
                pence -= tenPCoins * 10;
                System.out.println(tenPCoins + " 10p coins");
            } else if (pence >=5 && pence < 10) {
                int fivesPCoins = pence / 5;
                pence -= fivesPCoins * 5;
                System.out.println(fivesPCoins + " 5p coins");
            } else if (pence >=2 && pence < 5) {
                int twoPCoins = pence / 2;
                pence -= twoPCoins * 2;
                System.out.println(twoPCoins + " 2p coins");
            } else if (pence >=1 && pence < 2) {
                int onesPCoins = pence;
                pence -= onesPCoins;
                System.out.println(onesPCoins + " 1p coins");
            }

        }

    }
}

