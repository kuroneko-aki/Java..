public class StringClass {

    public static void main(String[] args) {

        // String = a reference data type that can store one or more characters
        //          reference data types have access to useful methods.

        String name = "Rai";

        //boolean result = name.equalsIgnoreCase("rai");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("i");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();

        String result = name.replace('i', 'y');

        System.out.println(result);
    }
    
}
