import java.io.File;

public class fileClass {
    public static void main(String[] args) {

        // file = An abstract representation of file directory and pathnames

        File file = new File("C:\\Users\\raisen\\Desktop\\secret_message.TXT");

        if(file.exists()) {
			System.out.println("That file exists! :o");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
		}
		else {
			System.out.println("That file does not exist :<");
		}
    }
}
