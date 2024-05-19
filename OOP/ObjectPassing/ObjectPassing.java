public class ObjectPassing {
    
    public static void main(String[] args) {

        Garage garage = new Garage();

        Cars cars1 = new Cars("BMW");
        Cars cars2 = new Cars("Tesla");

        garage.park(cars1);
        garage.park(cars2);
    }
}
