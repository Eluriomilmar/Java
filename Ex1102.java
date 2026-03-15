import java.io.*;

public class Ex1102 {
    public static void main(String[] args) {

        String path = "C:\\Users\\Lucas\\Desktop\\teste.txt";

        String[] lines = new String[] {
                "Testing stuff",
                "Idk what I'm doing",
                "ayayay muchacho jajaja"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
