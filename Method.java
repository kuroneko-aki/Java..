public class Method {

    public static void main(String[] args) {

        // method = a block of code that is executed whenever it is called upon

        String name = "Rai";
        int age = 20;

        hello(name, age);

    }
    
    static void hello(String name, int age) {
        System.out.println("Hello "+name);
        System.out.println("You are "+age);
    }

}
