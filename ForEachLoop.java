import java.util.ArrayList;

public class ForEachLoop {
    
    public static void main(String[] args) {

        // for-each = traversing technique to iterate through the elements in an array/collection
        //            less steps, more readable
        //            less flexible
        
        //String[] colors = {"black", "white", "purple", "pink"};
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("black");
        colors.add("white");
        colors.add("purple");
        colors.add("pink");

        for(String i : colors) {
            System.out.println(i);
        }

    
    }
}
