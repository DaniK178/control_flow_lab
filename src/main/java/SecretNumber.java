import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {

        System.out.println("Welcome to guess number! The secret number lies between 0 and 50.");
        System.out.println("Type your guess below:");

//        collect user input
        Scanner scan = new Scanner(System.in);
        Integer num = scan.nextInt();

//        if number is 26, print 'correct!'
//        if number is less the 26 print 'Too low!'
//        if number is more than 26 print 'Too high!"

        if (num == 26) {
            System.out.println("correct!");
        } else if (num < 26) {
            System.out.println("Too low! Try a higher number.");
        } else {
            System.out.println("Too high! Try a lower number.");
        }

    }
}
