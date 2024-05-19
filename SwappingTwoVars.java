public class SwappingTwoVars {
    
    public static void main(String[] args){

        String x = "water";
        String y = "gatorade";
        String temp;

        temp = x;
        x=y;
        y=temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);

    }
}
