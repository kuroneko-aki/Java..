public class Abstraction {

    public static void main(String[] args) {
    
        // abstract = abstract classes cannot be instatiated, but the can have a subclass
        //            abstracat methods are declared withoun an implementation

        //Vehicle vehicle = new Vehicle();
        Car car = new Car();

        car.go();
    }
}
