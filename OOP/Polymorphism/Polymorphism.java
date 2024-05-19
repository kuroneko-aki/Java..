public class Polymorphism {

    public static void main(String[] args) {

        // Polymorphism = greek word for poly-"many", morph-"form"
        //                the ability of an object to identify as more than one type

        Car car = new Car();
        Motorbike motorbike = new Motorbike();
        Boat boat = new Boat();

        Vehicle[] racers = {car, motorbike, boat};

        for(Vehicle x : racers) {
            x.go();
        }
    }
}