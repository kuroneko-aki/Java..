public class OverloadedConstructors {
    
    public static void main(String[] args) {

        // overloaded constructors = multiple constructors within a class with the same name,
        //                           but have different parameters
        //                           name + parameters = signature 

        Sushi sushi = new Sushi("sushi rice", "salmon", "cucumber", "dried seaweed");

        System.out.println("Here are the ingredients for your sushi: ");
        System.out.println();
        System.out.println(sushi.rice);
        System.out.println(sushi.seafood);
        System.out.println(sushi.vegetable);
        System.out.println(sushi.seaweed);
    }
}
