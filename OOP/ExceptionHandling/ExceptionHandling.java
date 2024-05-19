import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        // exception = an event that occurs during the execution of a program-
        //             disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;
            System.out.println("result " + z);
        }
        catch(ArithmeticException e) {
            System.out.println("You can't divide by zero, you dumb fuck!");
        }
        catch(InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER OMFG!!");
        }
        catch(Exception e) {
            System.out.println("Something went wrong..");
        }
        finally {
            scanner.close();
        }
        // there is a bug here, run the code on eclipse to see output..
    }
}