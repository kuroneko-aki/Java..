public class SuperKeyword {
    
    public static void main(String[] args) {

        // super = keyword refers to the superclass (parent) of an object
        //         very similar to the "this" keyword

        Hero hero1 = new Hero("Flash", 25, "Super speed");
        Hero hero2 = new Hero("Shazam", 26, "Lightning");

        System.out.println(hero1.toString());
    }
}
