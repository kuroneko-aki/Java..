import java.util.Scanner;

public class OrOperator {
    
    public static void main(String[] args) {

        //logical operators = used to connect two or more expressions
        //
        //      && = (AND) both conditions must be true
        //      || = (OR) either condition must be true
        //      !  = (NOT) reverses boolean value of a condition

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("You are playing a game! press q or Q to quit");
            String response = scanner.next();
            
            if (response.equals("q") || response.equals("Q")) {
                System.out.println("You quit the game");
            }
            else {
                System.out.println("You are still playing the game *pew* *pew*");
            }
        }

    }
}
