public class Encapsulation {

    public static void main(String[] args) {

        // encapsulation = attributes of a class will be hidden or private
        //                 can be accessed only through methods (getters & setters)
        //                 you should make attributes private if you don't have a reason to make the public/protected

        Car car = new Car("Chevrolet", "Camaro", 2023);

        car.setYear(2024);
        
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        
    }
}