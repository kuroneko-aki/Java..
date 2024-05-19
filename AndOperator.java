public class AndOperator {
    
    public static void main(String[] args) {

        //logical operators = used to connect two or more expressions
        //
        //      && = (AND) both conditions must be true
        //      || = (OR) either condition must be true
        //      !  = (NOT) reverses boolean value of a condition

        int temp = 19;

        if (temp>30) {
            System.out.println("It's hot outside");
        }
        else if (temp>=20 && temp<=30) {
            System.out.println("It's warm outside");
        }
        else {
            System.out.println("It's cold outside");
        }
        
    }
}
