import java.util.Scanner;

public class IfStatementWithScanner {

    public static void main(String[] args) {

        int age;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an age: ");
            age = scanner.nextInt();
        }

        if(age<=12){
            System.out.println("you are not an adult");
        }
        else if(age<=17){
            System.out.println("you are a teenager");
        }
        else if(age>=18){
            System.out.println("you are an adult");
        }
        else if(age>=70){
            System.out.println("ok boomer");
        }
        else{

        }
    }
}