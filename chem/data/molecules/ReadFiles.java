import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {

public static void main(String[] args) {

    File file = new File("all.txt");
    String s = "";
    try {

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            s+=sc.nextLine();
            s+="\\n";
        }
        sc.close();
        System.out.println(s);
    } 
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
 }
}