import java.util.Scanner;

public class Money {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y"; //loop here 

        while (again.equalsIgnoreCase("y")) {
            // have the user enter the amount of money 
            System.out.print("Enter the denomination (1, 2, 5, 10, 20, 50, 100): ");
            int amount = input.nextInt();

            if (amount == 1) {
                System.out.println("George Washington is on the $1 bill.");
            } else if (amount == 2) {
                System.out.println("Thomas Jefferson is on the $2 bill.");
            } else if (amount == 5) {
                System.out.println("Abraham Lincoln is on the $5 bill.");
            } else if (amount == 10) {
                System.out.println("Alexander Hamilton is on the $10 bill.");
            } else if (amount == 20) {
                System.out.println("Andrew Jackson is on the $20 bill.");
            } else if (amount == 50) {
                System.out.println("Ulysses S. Grant is on the $50 bill.");
            } else if (amount == 100) {
                System.out.println("Benjamin Franklin is on the $100 bill.");
            } else {
                System.out.println("No such banknote exists.");
            }
            //ask to loop
            System.out.print("Do you want to check another denomination? (y/n): ");
            again = input.next();
        }
        //Finish
        System.out.println("Bye!");
    }
}
