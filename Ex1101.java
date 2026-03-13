import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Lucas\\Desktop\\teste.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.next());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
