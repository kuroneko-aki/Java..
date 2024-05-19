public class Constructors {
    
    public static void main(String[] args) {

        // constructor = is a special method that is called when an object is instantiated (created)

        Human human1 = new Human("Allie", 20, 155);
        Human human2 = new Human("Rai", 20, 153);

        human1.eat();
        human2.drink();
    }
}
