import java.util.*;

public class TwoDArrayList {

    public static void main(String[] args) {

        // 2D ArrayList = a dynamic list of lists
        // the size of these lists can be changed during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("cake");
        bakeryList.add("egg pie");
        bakeryList.add("croissant");

        ArrayList<String> beverageList = new ArrayList();
        beverageList.add("water");
        beverageList.add("rootbeer");
        beverageList.add("juice");

        ArrayList<String> snackList = new ArrayList();
        snackList.add("chips");
        snackList.add("oreos");

        groceryList.add(bakeryList);
        groceryList.add(beverageList);
        groceryList.add(snackList);

        System.out.println(groceryList);
        //System.out.println(groceryList.get(1).get(1));


    }
    
}
