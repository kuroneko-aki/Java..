import java.util.Random;

public class GeneratingRandomValues {
    
    public static void main(String[] args) {

        //random class can be used to generate pseudo-random values

        Random random = new Random();

        //int x = random.nextInt(); nextInt will give us a value between -2billion and 2billion
        //double y = random.nextDouble(); nextDouble will give us a value between 0 and 1
        int x = random.nextInt(6)+1;
        //boolean z = random.nextBoolean(); nextBoolean will give us true or false

        System.out.println(x);

    }
}
