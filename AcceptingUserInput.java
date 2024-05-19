import java.util.Scanner;
public class AcceptingUserInput {

    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your favorite food: ");
            String food = scanner.nextLine();

            System.out.println("Your name is: "+name);
            System.out.println("Your age is: "+age);
            System.out.println("Your favorite food is: "+food);
            
        }
    }
    
}
