import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;
        do {
            System.out.println("Guess my number(1-100) : ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHOO .. CORRECT NUMBER !!! ");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("your number is too large");
            } else {
                System.out.println("your number is too small");
            }
        }
        while (userNumber >= 0);

        System.out.println("My number was ; ");
        System.out.println(myNumber);
    }}